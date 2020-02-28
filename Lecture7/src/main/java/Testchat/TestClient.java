/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testchat;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.out;

/**
 *
 * @author zia
 */
public class TestClient {

    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8989);
            out.println("connected with server !");
            out.print(">> ");
            BufferedReader getInput = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outStream = clientSocket.getOutputStream();
            
            PrintWriter toServer = new PrintWriter(outStream, true);
            toServer.println("client: " + getInput.readLine());
//            toServer.print(getInput.readLine());

        } catch (IOException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
