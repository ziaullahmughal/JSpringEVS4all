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
public class ClientSide {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8989);
            out.println("Connected with Server !");
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outStream = s.getOutputStream();
            PrintWriter printWrit = new PrintWriter(outStream, true);
            String sendMsg = bReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
