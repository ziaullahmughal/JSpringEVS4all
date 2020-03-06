/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 *
 * @author zia
 */
public class ChatClnt {

    public static void main(String[] args) {
        try {
            Socket ClntSkt = new Socket("localhost", 8989);
            System.out.println("Connect with chat server !" + "\n" + "Type only 'E' to exit.");
            while (!ClntSkt.isClosed()) {
                BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print(">>");
                OutputStream oStram = ClntSkt.getOutputStream();
                PrintWriter pWriter = new PrintWriter(oStram, true);
                String S = bReader.readLine();
                pWriter.println(S);
                if ("E".equals(S)) {
                    ClntSkt.close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatClnt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException NE) {
            System.out.println("Null Exception");
        }
    }
}
