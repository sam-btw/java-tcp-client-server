package milestone1;

import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) throws Exception {

        String sentence;
        String modifiedSentence;

        // Read input from keyboard
        BufferedReader inFromUser =
                new BufferedReader(
                        new InputStreamReader(System.in));

        // Create client socket and connect to server
        Socket clientSocket =
                new Socket("127.0.0.1", 6780);

        // Create output stream to server
        DataOutputStream outToServer =
                new DataOutputStream(
                        clientSocket.getOutputStream());

        // Create input stream from server
        BufferedReader inFromServer =
                new BufferedReader(
                        new InputStreamReader(
                                clientSocket.getInputStream()));

        System.out.print("Enter a sentence: ");

        sentence = inFromUser.readLine();

        // Send sentence to server
        outToServer.writeBytes(sentence + '\n');

        // Receive modified sentence from server
        modifiedSentence = inFromServer.readLine();

        System.out.println(
                "FROM SERVER: " + modifiedSentence
        );

        clientSocket.close();
    }
}
