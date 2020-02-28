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
public class TestServer {

    public static void main(String[] args) {
        try {
            ServerSocket srvskt = new ServerSocket(8989);
            out.println("Server ready !");
            Socket clientAccept = srvskt.accept();
            out.println("Client connected !");

            InputStream inStream = clientAccept.getInputStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inStream));
            out.println(bReader.readLine());

        } catch (IOException ex) {
            Logger.getLogger(TestServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
