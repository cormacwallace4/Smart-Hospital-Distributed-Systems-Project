package cw.BedManagementService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class BedManagementServer {

    private static final int port = 50053;
    private static final String serviceName = "bedManagementService.local.";
    private static final String serviceType = "Grpc.";

    public static void main(String[] args) throws Exception {
    	//create grpc server
        Server server = ServerBuilder.forPort(port)
                .addService(new HospitalBedServiceImpl())
                .build();
        //stasrt server
        server.start();
        System.out.println("Server started, listening on port " + port + ".");
        
        // Register the service with jmDNS
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            Map<String, String> properties = new HashMap<>();
            properties.put("path", "/beds");
            ServiceInfo serviceInfo = ServiceInfo.create(serviceName, serviceType, port, 0, 0, true, properties);
            jmdns.registerService(serviceInfo);

            System.out.println("Service registered with jmDNS: " + serviceInfo);
        } catch (UnknownHostException e) {
            System.err.println("Error registering service with jmDNS: " + e.getMessage());
        }
      //waiting for the server to shut down
        server.awaitTermination();
    }
}

		//BI-DIRECTIONAL STREAMING METHOD
		
		//method returns whether the bed the user inputs is available or not
    class HospitalBedServiceImpl extends HospitalBedServiceGrpc.HospitalBedServiceImplBase {
        @Override
        public StreamObserver<HospitalBedRequest> checkBedAvailability(
                StreamObserver<HospitalBedResponse> responseObserver) {
            return new StreamObserver<HospitalBedRequest>() {
                @Override
                public void onNext(HospitalBedRequest request) {
                	//get the bed ID from the request.
                    int bedId = request.getBedId();
                 //check the availability of the bed.
                    boolean isAvailable = getBedAvailability(bedId);
                 //create a response indicating whether the bed is available or not.
                    HospitalBedResponse response = HospitalBedResponse.newBuilder()
                            .setBedId(bedId)
                            .setAvailable(isAvailable)
                            .build();
                 //send the response to the client.
                    responseObserver.onNext(response);
                    System.out.println("Receiving request to check the availability of bed number: " + bedId);
                }
                

                @Override
                //send error message if one occurs
                public void onError(Throwable t) {
                    System.err.println("Error: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
        
        
        //CLIENT SIDE STREAMING METHOD

        //method assigns a patient to a specific bed as long as it is available
        @Override
        public StreamObserver<BedAssignmentRequest> assignBed(
                StreamObserver<BedAssignmentResponse> responseObserver) {
            //returns a new StreamObserver for handling BedAssignmentRequest objects
            return new StreamObserver<BedAssignmentRequest>() {
                @Override
                public void onNext(BedAssignmentRequest request) {
                    //extracts the bed ID and patient name from the request
                    int bedId = request.getBedId();
                    String patientName = request.getPatientName();
                    //calls a method to assign the bed to the patient
                    boolean isAssigned = assignBedToPatient(bedId, patientName);

                    //builds a BedAssignmentResponse object with the assigned status
                    BedAssignmentResponse response = BedAssignmentResponse.newBuilder()
                            .setSuccess(isAssigned)
                            .build();

                    //sends the response to the client
                    responseObserver.onNext(response);
                   
                    System.out.println("Receiving request to assign a patient to bed number: " + bedId);
                }

                @Override
                public void onError(Throwable t) {
                    //handles any errors that occur during processing
                }

                @Override
                public void onCompleted() {
                    //notifies client that the stream has completed
                    responseObserver.onCompleted();
                }
            };
        }



        //sets the even beds as available and the odd beds unavailable
        //this is just dummy data to show how the method works
        private boolean getBedAvailability(int bedId) {          
            return bedId % 2 == 0;
        }
        
        private boolean assignBedToPatient(int bedId, String patientName) {
            return bedId % 2 == 0;
        }
        
        //defines a static map of ward cleaners with their phone numbers
        private static final Map<Integer, String> WardCleaners = new HashMap<Integer, String>() {{
            put(1, "James Dooley Phone: 087-4572837");
            put(2, "Catherine Doyle Phone: 083-2189473");
            put(3, "John Halligan Phone: 085-8392827");
            put(4, "Mary Ryan Phone: 089-3829589");
            
        }};
        
        
        //UNARY RPC METHOD
        
        //method that allows the user to check the cleaner name and phone number for each ward.
        @Override
        public void giveCleaner(CleanerRequest request, StreamObserver<CleanerResponse> responseObserver) {
            try {
            	//extracts ward number from request
                String wardNumber = request.getName().replaceAll("[^0-9]", "");
                int ward = Integer.parseInt(wardNumber);
                
                //printing message to indicate request has been received
                System.out.println("Receiving ward cleaner information request for ward " + ward + "...");
                
                //1 second delay to demonstrate communication between server and client
                Thread.sleep(1000);
                
                //checks the cleaner information for the ward and builds a CleanerResponse object
                String cleaner = WardCleaners.getOrDefault(ward, "Unknown room");
                CleanerResponse reply = CleanerResponse.newBuilder().setMessage(cleaner).build();
                
                //sends message to client
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
            } catch (NumberFormatException e) {
            	//handles invalid ward number
                responseObserver.onError(new IllegalArgumentException("Invalid ward number"));
            } catch (InterruptedException e) {
            	//handles any other errors
                responseObserver.onError(e);
            }
        }
        
        
    }

