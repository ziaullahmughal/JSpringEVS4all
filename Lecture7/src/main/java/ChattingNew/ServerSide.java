/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChattingNew;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.out;

/**
 *
 * @author zia
 */
public class ServerSide {
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(8989);
            out.println("Server Ready !");
            Socket S = SS.accept();
            out.println("Client Connected !");            
            BufferedReader readclient = new BufferedReader(new InputStreamReader(System.in));
//            OutputStream outPrint = S.getOutputStream();
//            PrintWriter getPrint = new PrintWriter(outPrint, true);
            
            out.println(readclient.readLine());
            
        } catch (IOException ex) {
            Logger.getLogger(ServerSide.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
