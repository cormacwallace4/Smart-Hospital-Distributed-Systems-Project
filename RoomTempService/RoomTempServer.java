package cw.RoomTempService;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import cw.RoomTempService.TemperatureGrpc.TemperatureImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class RoomTempServer extends TemperatureImplBase {
	//storing room temperature for 10 rooms to be used in methods.
    private static final Map<Integer, String> roomTemperatures = new HashMap<Integer, String>() {{
        put(1, "18");
        put(2, "14");
        put(3, "21");
        put(4, "12");
        put(5, "28");
        put(6, "7");
        put(7, "15");
        put(8, "13");
        put(9, "9");
        put(10, "2");
    }};

    public static void main(String[] args) {
        RoomTempServer tempserver = new RoomTempServer();
        //setting the port 
        int port = 50051;
        
      //defining service name and type to register with jmDNS
        String serviceName = "roomtempService.local.";
        String serviceType = "Grpc";
        

        try {
        	//created a new server with the set port and service implementation
            Server server = ServerBuilder.forPort(port)
                    .addService(tempserver)
                    .build()
                    //starts server
                    .start();

           System.out.println("gRPC server started, listening on " + port);

            //registering the service with jmDNS
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create(serviceName, serviceType, port, "");
            jmdns.registerService(serviceInfo);

            System.out.println("Service registered with jmDNS: " + serviceInfo);

            //waiting for the server to shut down
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    //UNARY RPC METHOD
    
    //method to give the temperature of a specific room the user requests
    @Override
    public void giveTemp(TempRequest request, StreamObserver<TempReply> responseObserver) {
        try {
            //extract the room number from the request name and convert it to an int
            String roomNumber = request.getName().replaceAll("[^0-9]", "");
            int room = Integer.parseInt(roomNumber);
            
            //printing message to indicate request has been received
            System.out.println("Receiving room temperature request for room " + room + "...");
            
            //1 second delay to demonstrate communication between server and client
            Thread.sleep(1000);
            
            //get the temperature for the specified room, or "Unknown room" if the room is not found
            String temperature = roomTemperatures.getOrDefault(room, "Unknown room");
            
            //create a new TempReply message with the retrieved temperature
            TempReply reply = TempReply.newBuilder().setMessage(temperature).build();
            
            //send the TempReply message to the client via the responseObserver
            responseObserver.onNext(reply);
                      
            responseObserver.onCompleted();
            
        } catch (NumberFormatException e) {
            //if an invalid room number is provided in the request, send error response
            responseObserver.onError(new IllegalArgumentException("Invalid room number"));
            
        } catch (InterruptedException e) {
            
            responseObserver.onError(e);
        }
    }

    //UNARY RPC METHOD
    
    //method that sets the temperature of a specific room
    @Override
    public void setTemp(SetTempRequest request, StreamObserver<TempReply> responseObserver) {

        //get the room number and desired temperature from the request.
        int roomNumber = request.getRoomNumber();
        String temperature = request.getTemperature();

        //check if room number is valid.
        if (roomNumber < 1 || roomNumber > 10) {
            //if the room number is invalid, return an error to the client.
            responseObserver.onError(new IllegalArgumentException("Invalid room number"));
            return;
        }

        //print a message to the server to show that it received a request to set the room temperature.
        System.out.println("Receiving request to set the room temp of room: " + roomNumber);

        //print a message to show that the temperature of the room is being set.
        System.out.println("Setting temperature of room " + roomNumber + " to " + temperature + " Degrees Celsius" + "...");

        //update the temperature of the room in the roomTemperatures map.
        roomTemperatures.put(roomNumber, temperature);

        //get the updated temperature for the room.
        String updatedTemperature = roomTemperatures.getOrDefault(roomNumber, "Unknown room");

        //create a new TempReply with the updated temperature.
        TempReply reply = TempReply.newBuilder().setMessage(updatedTemperature).build();

        //send the TempReply to the client.
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    
  //SERVER STREAMING METHOD

  //method to give the temperature of a all the rooms
    @Override
    public void getAllRooms(TempRequest request, StreamObserver<AllRoomsReply> responseObserver) {
    	//printing message to indicate request has been received
        System.out.println("Receiving request to get all rooms and their temperatures...");
     //create new builder for the AllRoomsReply message
        AllRoomsReply.Builder allRoomsBuilder = AllRoomsReply.newBuilder();
        
        //iterate through all the entries in the roomTemperatures map
        for (Map.Entry<Integer, String> entry : roomTemperatures.entrySet()) {
            //create a new RoomTemp message for each room temperature entry
            RoomTemp roomTemp = RoomTemp.newBuilder()
                    .setRoomNumber(entry.getKey())
                    .setTemperature(entry.getValue())
                    .build();
                    
            //add the RoomTemp message to the AllRoomsReply message builder
            allRoomsBuilder.addRooms(roomTemp);
        }
        
        //build the final AllRoomsReply message
        AllRoomsReply allRoomsReply = allRoomsBuilder.build();
        
        //send the AllRoomsReply message to the client via the responseObserver
        responseObserver.onNext(allRoomsReply);
        
      
        responseObserver.onCompleted();
    }
}
