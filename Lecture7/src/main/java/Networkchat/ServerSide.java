/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkchat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zia
 */
public class ServerSide {

    public static void main(String[] args) {
        int port;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Port #: ");
        port = scn.nextInt();

        try {
            ServerSocket SerSkt = new ServerSocket(port);
            System.out.println("Server Connected at port (" + port + ")");
            Socket skt = SerSkt.accept();
            System.out.println("Client Connected !");

            while (skt.isConnected()) {
                InputStream iStream = skt.getInputStream();
                BufferedReader bfr = new BufferedReader(new InputStreamReader(iStream));
                System.out.println(bfr.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
