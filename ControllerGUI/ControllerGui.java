package cw.ControllerGUI;

import javax.swing.*;

import cw.HealthMonitoringService.*;
import cw.RoomTempService.*;
import cw.BedManagementService.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ControllerGui extends JFrame implements ActionListener {
	
	//using managed channel object to connect to the servers
    private final ManagedChannel channel;
    //blocking stub to invoke the Health Monitoring Service methods synchronously
    private final HealthMonitoringServiceGrpc.HealthMonitoringServiceBlockingStub blockingStub;
    //asynchronous stub to invoke the Health Monitoring Service methods asynchronously
    private final HealthMonitoringServiceGrpc.HealthMonitoringServiceStub asyncStub;
   //used in alertDoctors method to keep track of whether alert has been confirmed
    private boolean alertConfirmed = false;
    
    //jlabels and jtextfields to take in user input
    private final JLabel patientIdLabel;
    private final JTextField patientIdField;
    private final JLabel roomLabel;
    private final JTextField roomField;
    private final JLabel BedLabel;
    private final JTextField BedField;
    private final JLabel wardLabel;
    private final JTextField wardField;
    private final JLabel setTempLabel;
    private final JTextField setTempField;

   
    //jtextarea to show output and a scrol pane for it 
    private final JTextArea outputArea;
    private final JScrollPane outputScrollPane;

    //main method that starts the application
    public static void main(String[] args) {
        ControllerGui clientGUI = new ControllerGui();
        clientGUI.setVisible(true);
    }

    //constructor to create the gui
    public ControllerGui() {
        setTitle("Main Controller - Smart Hospital");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting background color of panels and output area
        Color bgColor = Color.decode("#667b68");
        Color outputColor = Color.decode("#cfdfc1");
       

        //creating managed channel to connect to servers
        channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        blockingStub = HealthMonitoringServiceGrpc.newBlockingStub(channel);
        asyncStub = HealthMonitoringServiceGrpc.newStub(channel);
  
        //creating GUI components
       
        patientIdLabel = new JLabel("Patient ID 1-5:");
        patientIdField = new JTextField(3);
        roomLabel = new JLabel("Room Number 1-10:");
        roomField = new JTextField(3);
        BedLabel = new JLabel("Bed Number 1-10:");
        BedField = new JTextField(3);
        wardLabel = new JLabel("Ward Number 1-4:");
        wardField = new JTextField(3);
        setTempLabel = new JLabel("Temperature:");
        setTempField = new JTextField(5);
        
        //setting the colors of the labels
        patientIdLabel.setForeground(Color.white);
        roomLabel.setForeground(Color.white);
        BedLabel.setForeground(Color.white);
        wardLabel.setForeground(Color.white);
        setTempLabel.setForeground(Color.white);
        
        //buttons for user input
        JButton getVitalsBtn = new JButton("Get Patient Vitals");
        JButton alertDoctorsBtn = new JButton("Alert Doctors and Wait for Confirmation");
        JButton safeVitalsBtn = new JButton("Get Safe Vital Ranges");
        JButton exitBtn = new JButton("Exit"); 
        exitBtn.setPreferredSize(new Dimension(20, 50));
        JButton giveTempBtn = new JButton("Get Room Temp");
        JButton setTempBtn = new JButton("Set Room Temp");
        JButton getAllRoomsBtn = new JButton("Get Current Temp of All Rooms");
        JButton checkBedBtn = new JButton("Check Specific Bed Availability");
        JButton checkAllBtn = new JButton("Check All Bed Availability");
        JButton assignBedBtn = new JButton("Assign Bed");
        JButton giveCleanerBtn = new JButton("Show Cleaner");
        
       

        //output area created
        outputArea = new JTextArea(22, 40);
        outputArea.setEditable(false);
        outputScrollPane = new JScrollPane(outputArea);
        outputArea.setBackground(outputColor);
         
        
        //created a jpanel with a grid bag layout to hold our components
        JPanel containerPanel = new JPanel(new GridBagLayout());
        //used constraints to keep everything in the right place 
        GridBagConstraints gbc = new GridBagConstraints();
        containerPanel.setBackground(bgColor);
        //set the size of the gui application
        containerPanel.setPreferredSize(new Dimension(1300, 700));


        //add heading for health monitoring methods 
        JLabel healthLabel = new JLabel("Health Monitoring Service");
        healthLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JPanel healthHeading = new JPanel(new FlowLayout());
        healthHeading.add(healthLabel);
        healthHeading.setBackground(bgColor);
        healthLabel.setForeground(Color.white);
        
        //positioning of health heading 
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(healthHeading, gbc);

        //created health panel and added its buttons, labels and text fields to it
        JPanel healthPanel = new JPanel(new FlowLayout());
        healthPanel.add(patientIdLabel);
        healthPanel.add(patientIdField);
        healthPanel.add(getVitalsBtn);
        healthPanel.add(alertDoctorsBtn);
        healthPanel.add(safeVitalsBtn);
        healthPanel.setBackground(bgColor);
        
        //added health panel and its positioning
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(healthPanel, gbc);

        //add heading for room temp methods 
        JLabel roomservicelabel = new JLabel("Room Temperature Service");
        roomservicelabel.setFont(new Font("Arial", Font.BOLD, 16));
        JPanel roomHeading = new JPanel(new FlowLayout());
       roomHeading.add(roomservicelabel);
       roomHeading.setBackground(bgColor);
       roomservicelabel.setForeground(Color.white);
        
       //positioning of health heading 
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(roomHeading, gbc);

        //created room temp panel and added its buttons, labels and text fields to it
        JPanel roomPanel = new JPanel(new FlowLayout());
        roomPanel.add(roomLabel);
        roomPanel.add(roomField);
        roomPanel.add(setTempLabel);
        roomPanel.add(setTempField);
        roomPanel.add(giveTempBtn);      
        roomPanel.add(setTempBtn);      
        roomPanel.add(getAllRoomsBtn);
        roomPanel.setBackground(bgColor);

        //positioning of room temp panel
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(roomPanel, gbc);

        // Add third health panel
        JLabel bedsLabel = new JLabel("Bed Management Service");
        bedsLabel.setFont(new Font("Arial", Font.BOLD, 16));
        JPanel bedHeading = new JPanel(new FlowLayout());
        bedHeading.add(bedsLabel);
        bedHeading.setBackground(bgColor);
        bedsLabel.setForeground(Color.white);
        

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(bedHeading, gbc);

        JPanel bedPanel = new JPanel(new FlowLayout());
        bedPanel.add(BedLabel);
        bedPanel.add(BedField);        
        bedPanel.add(checkBedBtn);
        bedPanel.add(checkAllBtn);
        bedPanel.add(assignBedBtn);
        bedPanel.add(wardLabel);
        bedPanel.add(wardField);
        bedPanel.add(giveCleanerBtn);
        bedPanel.setBackground(bgColor);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(bedPanel, gbc);

        //add exit button and output scroll pane
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 0;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(outputScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        containerPanel.add(exitBtn, gbc);

        add(containerPanel);

        //adding action listeners to buttons
        getVitalsBtn.addActionListener(this);
        alertDoctorsBtn.addActionListener(this);
        safeVitalsBtn.addActionListener(this);
        giveTempBtn.addActionListener(this);
        setTempBtn.addActionListener(this);
        getAllRoomsBtn.addActionListener(this);
        checkBedBtn.addActionListener(this);
        checkAllBtn.addActionListener(this);
        assignBedBtn.addActionListener(this);
        giveCleanerBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        //ensures window is sized correctly to fit all our components
        pack();


    }

    //this method allows us to see which button has been pressed based on the buttons label
    //whichever button is pressed then it will carry out everything inside that case
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Get Patient Vitals":
                String patientId = patientIdField.getText().trim(); //setting user input to patientId
                outputArea.setText(""); //clear output area
                getPatientVitals(patientId);
                break;
            case "Alert Doctors and Wait for Confirmation":
            	outputArea.setText(""); //clear output area
                alertDoctors();
                break;
            case "Get Safe Vital Ranges":
            	outputArea.setText(""); //clear output area
                getSafeVitals(null);
                break;
            case "Get Room Temp":
            	String roomNumberStr = roomField.getText();
            	int roomNumber = Integer.parseInt(roomNumberStr); //parsing string to int so it can be used in method   	
            	outputArea.setText(""); //clear output area
                giveTemp(roomNumber, outputArea);
                break;
            case "Set Room Temp":
            	String roomNumberTemp = roomField.getText();
            	int roomNumberTempInt = Integer.parseInt(roomNumberTemp);//parsing string to int so it can be used in method 
            	String temp = setTempField.getText();
            	outputArea.setText(""); //clear output area
                setTemp(roomNumberTempInt, temp);
                break;
            case "Get Current Temp of All Rooms":
            	outputArea.setText(""); //clear output area
                getAllRooms();
                break;
            case "Check Specific Bed Availability":
            	String bedAvailableStr = BedField.getText();
            	int bedAvailable = Integer.parseInt(bedAvailableStr);  //parsing string to int so it can be used in method 
            	outputArea.setText(""); // clear output area
                checkBedAvailability(bedAvailable);
                break;
            case "Check All Bed Availability":
            	outputArea.setText(""); // clear output area
                checkAllBedAvailability();
                break;
            case "Assign Bed":
            	String assignedBedStr = BedField.getText();
            	int assignedBed = Integer.parseInt(assignedBedStr); //parsing string to int so it can be used in method  
            	outputArea.setText(""); // clear output area
                assignBed(assignedBed, "Cormac Wallace");
                break;
            case "Show Cleaner":
            	String wardStr = wardField.getText();
            	int ward = Integer.parseInt(wardStr); //parsing string to int so it can be used in method 
            	outputArea.setText(""); // clear output area
                showCleaner(ward, outputArea);
                break;
          
                //upon exit the channel shuts down using the shutdown() method below
            case "Exit":
                try {
                    shutdown();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.exit(0);
                break;
        }
    }
    
    //shuts down the channel when called
    public void shutdown() throws InterruptedException {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Error occurred during channel shutdown: " + e.getMessage());
            throw e;
        }
    }

    //method that gets a specific patients vitals based on the users input
    public void getPatientVitals(String patientId) {
        PatientID request = PatientID.newBuilder().setId(patientId).build();
        PatientVitals patientVitals = blockingStub.getPatientVitals(request);
        outputArea.append("Patient Vitals: " + patientVitals + "\n");
    }
    
    
    //method that sends an alert to the user about a patients vitals. 
    //the user must confirm receipt or it will run every 10 seconds.
    public void alertDoctors() {
        //create a new window for alert confirmation
        JFrame frame = new JFrame("Alert Confirmation");
        frame.setSize(800, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //add components to the window
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        //add message label
        JLabel messageLabel = new JLabel("Received Alert for PatientID 2, Patient blood pressure dangerously low.");
        panel.add(messageLabel, constraints);

        //add confirmation label
        JLabel confirmLabel = new JLabel("Confirm receipt of alert (Y/N):");
        constraints.gridy = 4;
        panel.add(confirmLabel, constraints);

        JTextField inputField = new JTextField(10);
        constraints.gridx = 10;
        panel.add(inputField, constraints);

        //add confirm button and set action listener
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText().trim();
                if (!input.equalsIgnoreCase("Y")) {
                    JOptionPane.showMessageDialog(frame, "Alert not confirmed.");
                    //if not confirmed, send the alert again
                    alertDoctors();
                } else {
                    JOptionPane.showMessageDialog(frame, "Alert confirmed.");
                    alertConfirmed = true;
                }
                frame.dispose(); //close the window
            }
        });
        constraints.gridx = 2;
        panel.add(confirmButton, constraints);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        //method called again if no input is received within 10 seconds
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!alertConfirmed) {
                    JOptionPane.showMessageDialog(frame, "Timed out waiting for user input.");
                    alertDoctors(); // Call the method again
                    frame.dispose(); // Close the window
                }
            }
        }, 10000);

        //sends alert to server which in turn sends alertConfirmation object back to client 
        asyncStub.alertDoctors(PatientVitals.newBuilder().setPatientId("2").build(), new StreamObserver<AlertConfirmation>() {
            @Override
            public void onNext(AlertConfirmation confirmation) {
                // Do nothing
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error occurred during alert confirmation: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Do nothing
            }
            
            

        });
        
        
    }
    
    
    public void getSafeVitals(SafeVitalsRequest request) {
        //call the asynchronous stubs method getSafeVitals and provide a StreamObserver
        asyncStub.getSafeVitals(request, new StreamObserver<AllVitalsReply>() {
            //this method is called each time a response message is received
            @Override
            public void onNext(AllVitalsReply response) {
                //iterate over the list of VitalSigns in the response and display each ones name and safe range
                for (VitalSigns VitalSignName : response.getVitalSignNameList()) {
                    outputArea.append("\nVital Sign: " + VitalSignName.getVitalSignName() + " Safe Range: " + VitalSignName.getSafeRange());
                }
            }

            //error message if any errors occur
            @Override
            public void onError(Throwable t) {
                outputArea.append("RPC failed: " + t.getMessage());
            }

            
            @Override
            public void onCompleted() {
                outputArea.append("\nSafe vitals request completed.");
            }
        });
    }

    //method to give temp of a particular room
    public static void giveTemp(int roomNumber, JTextArea outputArea) {
    	//creates channel to connect to server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        TemperatureGrpc.TemperatureBlockingStub stub = TemperatureGrpc.newBlockingStub(channel);
        //creates request with the name of the room whose temperature is requested. 
        TempRequest request = TempRequest.newBuilder().setName("Room " + roomNumber).build();
       //call the giveTemp method on the stub to make a blocking grpc request for the temp of specific room
        TempReply reply = stub.giveTemp(request);
        channel.shutdown();
        outputArea.append("Room " + roomNumber + " temperature: " + reply.getMessage() + "\n");
    }
    
    //method to set temp of a particular room
    private void setTemp(int roomNumber, String temperature) {
    	//creates channel to connect to server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        //creates stub that uses the grpc channel
        TemperatureGrpc.TemperatureBlockingStub stub = TemperatureGrpc.newBlockingStub(channel);

        //send temperature update to server
        SetTempRequest request = SetTempRequest.newBuilder()
                .setRoomNumber(roomNumber)
                .setTemperature(temperature)
                .build();
        stub.setTemp(request);
        
        //shuts down channel
        channel.shutdown();
        //sends message confirming chance of temperature
        outputArea.append("Temperature of Room " + roomNumber + " set to " + temperature + " Degrees Celsius.\n");       
    }

    //method that returns all the rooms and their temperatures
    public void getAllRooms() {
    	//creates channel to connect to server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
      //creates stub that uses the grpc channel
        TemperatureGrpc.TemperatureBlockingStub stub = TemperatureGrpc.newBlockingStub(channel);
      //create a request to retrieve the temperature of all the rooms.
        TempRequest request = TempRequest.newBuilder().setName("all").build();
        //calls the getAllRooms method on the stub to make a blocking grpc request for the temp of all the rooms
        AllRoomsReply allRoomsReply = stub.getAllRooms(request);
        channel.shutdown();
        
        //getting all the temps of rooms and constructing the message to be sent to the user
        String allRooms = allRoomsReply.getRoomsList().stream()
                .map(roomTemp -> "Room " + roomTemp.getRoomNumber() + ": " + roomTemp.getTemperature() + " Degrees Celsius")
                .collect(Collectors.joining("\n"));
        //displays all the rooms and their temperatures
        outputArea.append(allRooms + "\n");
    }

    
      public void checkBedAvailability(int bedId) {
    	//creates channel to connect to server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        try {
        	//creates stub that uses the grpc channel
            HospitalBedServiceGrpc.HospitalBedServiceStub bedStub = HospitalBedServiceGrpc.newStub(channel);

            //create a stream observer to handle the response from the server
            StreamObserver<HospitalBedResponse> responseObserver = new StreamObserver<HospitalBedResponse>() {
                @Override
                public void onNext(HospitalBedResponse response) {
                    //show the result in the output area
                    String result = "Bed " + bedId + " availability: " + response.getAvailable();
                    outputArea.append(result + "\n");
                }

                @Override
                public void onError(Throwable t) {
                    outputArea.append("Error: " + t.getMessage() + "\n");
                }

                @Override
                public void onCompleted() {
                    //shutdown channel
                	channel.shutdown();
                }
            };

            //create a request to check bed availability for the specified bed ID
            HospitalBedRequest request = HospitalBedRequest.newBuilder().setBedId(bedId).build();

            //call the gRPC method to check bed availability for the specified bed ID
            StreamObserver<HospitalBedRequest> requestObserver = bedStub.checkBedAvailability(responseObserver);

            //send the request to the server
            requestObserver.onNext(request);

            
            requestObserver.onCompleted();

            

        } catch (StatusRuntimeException e) {
            //do nothing
        }       
        
    }


      //method returns all the 10 beds and shows the user whether they are available or unavailable
    public void checkAllBedAvailability() {
    	//creates channel to connect to server
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        try {
            
            //create a stream observer to handle the response from the server
            StreamObserver<HospitalBedResponse> responseObserver = new StreamObserver<HospitalBedResponse>() {
                @Override
                public void onNext(HospitalBedResponse response) {
                    //show the result in the output area
                    String result = "Bed availability: " + response.getAvailable();
                    outputArea.append(result + "\n");
                }

                @Override
                public void onError(Throwable t) {
                    //do nothing
                }

                @Override
                public void onCompleted() {
                    //do nothing
                }
            };

            StringBuilder result = new StringBuilder();

            //loop through bed IDs 1 to 10 and check availability for each bed
            for (int bedId = 1; bedId <= 10; bedId++) {
               

                // Append the result for the current bed ID to the output area
                String bedAvailability = getBedAvailability(bedId) ? "available" : "unavailable";
                result.append("Bed " + bedId + " is " + bedAvailability +"\n");
            }

            //show the final result in the output area
            outputArea.append(result.toString());
            channel.shutdown();

        } catch (StatusRuntimeException e) {
        }
    }

    private boolean getBedAvailability(int bedId) {          
        return bedId % 2 == 0;
    }

   
    //method assigns a bed to a patient
    public void assignBed(int bedId, String patientName) {
    	//creates channel to connect to server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
        //creates stub that uses the grpc channel
        HospitalBedServiceGrpc.HospitalBedServiceStub stub = HospitalBedServiceGrpc.newStub(channel);

     //creates a stream observer for handling responses from the server.
        StreamObserver<BedAssignmentRequest> requestObserver = stub.assignBed(new StreamObserver<BedAssignmentResponse>() {
            //this method is called when a response is received from the server.
            @Override
            public void onNext(BedAssignmentResponse response) {
                //prints to the output area whether the bed assignment was successful or not.
                outputArea.append("Bed assignment successful?: " + response.getSuccess() + "\n");
                Boolean status = response.getSuccess();
                if (status) {
                    //prints to the output area the bed number and patient name if the assignment was successful.
                    outputArea.append("Bed " + bedId + " has been assigned to " + patientName);
                } else {
                	outputArea.append("Bed " + bedId + " cannot be assigned because it is unavailable");
                }
            }

            //this method is called if an error occurs in the communication with the server.
            @Override
            public void onError(Throwable t) {
                //error message.
                outputArea.append("RPC failed: " + t.getMessage());
            }

           //method called when finished
            @Override
            public void onCompleted() {
                
                outputArea.append("\nCompleted");
            }
        });

        //creates a bed assignment request with the given bed ID and patient name.
        BedAssignmentRequest bedAssignmentRequest = BedAssignmentRequest.newBuilder()
                .setBedId(bedId)
                .setPatientName(patientName)
                .build();
        //sends the bed assignment request to the server.
        requestObserver.onNext(bedAssignmentRequest);

        //signals to the server that there are no more requests.
        requestObserver.onCompleted();
    }

	    //this method is used to show the cleaner for a given room number.
	    public static void showCleaner(int roomNumber, JTextArea outputArea) {
	    	//creates a channel to connect to the server.
		    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		    //creates a stub that uses the channel.
		    HospitalBedServiceGrpc.HospitalBedServiceBlockingStub stub = HospitalBedServiceGrpc.newBlockingStub(channel);
		    //creates a cleaner request with the given room number.
		    CleanerRequest request = CleanerRequest.newBuilder().setName("Room " + roomNumber).build();
		    //sends the cleaner request to the server and gets the response.
		    CleanerResponse reply = stub.giveCleaner(request);
		 
		    channel.shutdown();
		    //gives message to user showing the cleaner for the given room number.
		    outputArea.append("Ward " + roomNumber + " Cleaner is: " + reply.getMessage() + "\n");
    }

}
