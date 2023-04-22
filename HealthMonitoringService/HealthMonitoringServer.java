package cw.HealthMonitoringService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.Status;

public class HealthMonitoringServer {

    //setting the port on which the server will listen
    private static final int port = 50052;

    //defining service name and type to register with jmDNS
    private static final String serviceName = "monitoringService.local.";
    private static final String serviceType = "Grpc.";

    public static void main(String[] args) throws Exception {
        //created a new server with the set port and service implementation
        Server server = ServerBuilder.forPort(port)
                .addService(new HealthMonitoringServiceImpl())
                .build();

        //starting the server
        server.start();

        //printing message to show server has started
        System.out.println("Server started, listening on " + port);

        // registering service with jmDNS
        try {
            //new instance of jmDNS with the local host address
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            //defining properties of the service
            Map<String, String> properties = new HashMap<>();
            properties.put("path", "/health");

            //created a new ServiceInfo object with the service name, type, port, and properties
            ServiceInfo serviceInfo = ServiceInfo.create(serviceName, serviceType, port, 0, 0, true, properties);

            //service registered with jmDNS
            jmdns.registerService(serviceInfo);

            //printing message to show the service has been registered with jmDNS
            System.out.println("Service registered with jmDNS: " + serviceInfo);
        } catch (UnknownHostException e) {
            //error message
            System.err.println("Error registering service with jmDNS: " + e.getMessage());
        }

        //waiting for server to be terminated
        server.awaitTermination();
    }
}

  class HealthMonitoringServiceImpl extends HealthMonitoringServiceGrpc.HealthMonitoringServiceImplBase {
    
	  //UNARY RPC METHOD
	  
	  //method that returns the vitals of whichever patient that matches the patient id the user enters
	  @Override
      public void getPatientVitals(PatientID request, StreamObserver<PatientVitals> responseObserver) {
		  //print message to server showing request for patient vitals has been requested
          System.out.println("Received request for patient id: " + request.getId());
          PatientVitals patientVitals = null;
          switch (request.getId()) {
          //defining patient vitalss for each patient
              case "1":
                  patientVitals = PatientVitals.newBuilder()
                          .setPatientId(request.getId())
                          .setHeartRate(80.0)
                          .setBloodPressure(120.0)
                          .setTemperature(98.6)
                          .build();
                  break;
              case "2":
                  patientVitals = PatientVitals.newBuilder()
                          .setPatientId(request.getId())
                          .setHeartRate(90.0)
                          .setBloodPressure(90)
                          .setTemperature(99.1)
                          .build();
                  break;
              case "3":
                  patientVitals = PatientVitals.newBuilder()
                          .setPatientId(request.getId())
                          .setHeartRate(70.0)
                          .setBloodPressure(110.0)
                          .setTemperature(98.3)
                          .build();
                  break;
              case "4":
                  patientVitals = PatientVitals.newBuilder()
                          .setPatientId(request.getId())
                          .setHeartRate(100.0)
                          .setBloodPressure(140.0)
                          .setTemperature(99.9)
                          .build();
                  break;
              case "5":
                  patientVitals = PatientVitals.newBuilder()
                          .setPatientId(request.getId())
                          .setHeartRate(85.0)
                          .setBloodPressure(125.0)
                          .setTemperature(98.7)
                          .build();
                  break;
              default:
            	  //error message if user input is outside of 1-5
                  responseObserver.onError(Status.NOT_FOUND.withDescription("Patient not found.").asRuntimeException());
                  return;
          }
          responseObserver.onNext(patientVitals);
          responseObserver.onCompleted();
      }

	  //BI-DIRECTIONAL STREAMING METHOD
	  
	  //method to send alert to client and receive back an alert confirmation.
	  //will continue to send alert until it receives confirmation of the alert from the client.
    @Override
    public void alertDoctors(PatientVitals request, StreamObserver<AlertConfirmation> responseObserver) {
      System.out.println("Sent Alert for PatientID 2, Patient blood pressure dangerously low.");
      AlertConfirmation alertConfirmation = AlertConfirmation.newBuilder().setSuccess(true).build();
      responseObserver.onNext(alertConfirmation);
      responseObserver.onCompleted();
    }

    //storing information for safe patient vitals 
    private static final Map<String, String> vitalSigns = new HashMap<String, String>() {{
        put("Heart Rate: ", "60 - 100 bpm");
        put("Blood Pressure: ", "90/60 mm Hg - 120/80 mm Hg");
        put("Temperature: ", "97°F (36.1°C) - 99°F (37.2°C)");       
    }};
    
    
    //SERVER STREAMING METHOD
    
    //method that returns the safe vital levels for each vital sign
    @Override
    public void getSafeVitals(SafeVitalsRequest request, StreamObserver<AllVitalsReply> responseObserver) {
    	//prints message to server to show its received a request
        System.out.println("Receiving request to get all vital signs and their safe ranges...");
        //creating a new builder the AllVitalsReply message
        AllVitalsReply.Builder allVitalsBuilder = AllVitalsReply.newBuilder();
        //iterates through vitalSigns map to add to the message the client will recieve
        for (Map.Entry<String, String> entry : vitalSigns.entrySet()) {
            VitalSigns vitalSigns = VitalSigns.newBuilder()
                    .setVitalSignName(entry.getKey())
                    .setSafeRange(entry.getValue())
                    .build();
            //add each vital sign to the message going to the client
            allVitalsBuilder.addVitalSignName(vitalSigns);
        }
        //build final AllVitalsReply message
        AllVitalsReply allVitalsReply = allVitalsBuilder.build();
       //send final AllVitalsReply message
        responseObserver.onNext(allVitalsReply);
        //can notify client its completed. I have left it blank though 
        responseObserver.onCompleted();
    }

  }

