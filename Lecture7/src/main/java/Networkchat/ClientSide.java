/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkchat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zia
 */
public class ClientSide {

    public static void main(String[] args) {
        String hostIP;
        int port;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Server IP Address: ");
        hostIP = scn.nextLine();
        System.out.print("Enter Server Port: ");
        port = scn.nextInt();

        try {
            Socket skt = new Socket(hostIP, port);

            while (true) {
                BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
                OutputStream oStram = skt.getOutputStream();
                PrintWriter pWriter = new PrintWriter(oStram, true);
                pWriter.println(bReader.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
