package Chat;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zia
 */
public class ChatSrvr {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String Msg = ": : : Server with Saved Chat History : : :";
        int port = 8989;
        try {
            ServerSocket SrvrSkt = new ServerSocket(port);
            System.out.println(Msg);
            Socket Skt = SrvrSkt.accept();
            System.out.println("Client Connected");
            Msg = "Clinet Connect on Port(" + port + ")\n";

            while (Skt.isConnected()) {
                InputStream iStream = Skt.getInputStream();
                BufferedReader bfr = new BufferedReader(new InputStreamReader(iStream));
                String ClntMsg = bfr.readLine();
                if ((ClntMsg.isEmpty()) || (ClntMsg.equals("E"))) {
                    break;
                }
                System.out.println(ClntMsg);
                Date dt = new Date();
                Msg = Msg + "\r\n" + dateFormat.format(dt) + "> " + ClntMsg;
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatSrvr.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException NE) {
            System.out.println("Null Exception : " + NE);
        } finally {
            WriteChatInFile(Msg);
        }
    }

    public static void WriteChatInFile(String ChatMsg) {
        try {
            Path DestFile = Paths.get("D:/ChatHistory.txt");
            Files.write(DestFile, ChatMsg.getBytes());

        } catch (IOException IOE) {
            Logger.getLogger(ChatSrvr.class.getName()).log(Level.SEVERE, null, IOE
            );
        }
    }
}
