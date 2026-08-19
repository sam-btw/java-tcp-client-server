import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) {

        try {

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Type CONNECT to start: ");

            String command = keyboard.readLine();

            // Only connect if user types CONNECT
            if (!command.equalsIgnoreCase("CONNECT")) {
                System.out.println("Connection not started.");
                return;
            }

            // Change this IP to server laptop IPv4
            Socket clientSocket = new Socket("172.20.10.13", 6781);

            System.out.println("Connected to server!");

            BufferedReader inFromServer = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Thread to receive messages from server
            Thread receiveThread = new Thread(() -> {

                try {
                    String serverMessage;

                    while ((serverMessage = inFromServer.readLine()) != null) {
                    	System.out.println("Server: " + serverMessage);
                    }

                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            receiveThread.start();

            // Send messages to server
            String clientMessage;

            while (true) {
                clientMessage = keyboard.readLine();
                outToServer.println(clientMessage);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
