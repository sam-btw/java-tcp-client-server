package milestone1;

import java.io.*;
import java.net.*;

public class TCPServer {

    public static void main(String[] args) throws Exception {

        String clientSentence;
        String capitalizedSentence;

        // Create server socket on port 6780
        ServerSocket welcomeSocket = new ServerSocket(6780);

        System.out.println("Server is running...");
        System.out.println("Waiting for client connection...");

        while (true) {

            // Accept client connection
            Socket connectionSocket = welcomeSocket.accept();

            System.out.println("Client connected!");

            // Create input stream from client
            BufferedReader inFromClient =
                    new BufferedReader(
                            new InputStreamReader(
                                    connectionSocket.getInputStream()));

            // Create output stream to client
            DataOutputStream outToClient =
                    new DataOutputStream(
                            connectionSocket.getOutputStream());

            // Receive sentence from client
            clientSentence = inFromClient.readLine();

            System.out.println(
                    "Received: " + clientSentence
            );

            // Convert sentence to uppercase
            capitalizedSentence =
                    clientSentence.toUpperCase() + '\n';

            // Send result back to client
            outToClient.writeBytes(capitalizedSentence);

            connectionSocket.close();
        }
    }
}
