package milestone2;


	import java.io.*;
	import java.net.*;

	public class TCPServer {

	    public static void main(String[] args) {

	        try {
	            // Create server socket
	            ServerSocket welcomeSocket = new ServerSocket(6781);

	            System.out.println("Server is running...");
	            System.out.println("Waiting for client connection...");

	            Socket connectionSocket = welcomeSocket.accept();

	            System.out.println("Client connected!");

	            BufferedReader inFromClient =
	                    new BufferedReader(
	                            new InputStreamReader(
	                                    connectionSocket.getInputStream()));

	            PrintWriter outToClient =
	                    new PrintWriter(
	                            connectionSocket.getOutputStream(), true);

	            BufferedReader keyboard =
	                    new BufferedReader(
	                            new InputStreamReader(System.in));

	            // Thread to receive messages from client
	            Thread receiveThread = new Thread(() -> {
	                try {
	                    String messageFromClient;

	                    while ((messageFromClient =
	                            inFromClient.readLine()) != null) {

	                        System.out.println("Client: "
	                                + messageFromClient);
	                    }

	                } catch (IOException e) {
	                    System.out.println("Connection closed.");
	                }
	            });

	            receiveThread.start();

	            // Send messages to client
	            String serverMessage;

	            while (true) {
	                serverMessage = keyboard.readLine();

	                outToClient.println(serverMessage);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
