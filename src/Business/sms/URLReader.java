package Business.sms;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.net.*;
import java.io.*;
public class URLReader {

        public static void SendSMS(String recipiant,String regNumber) throws Exception {

            String msg="You+have+been+registered+at+NAITA+Colombo" +
                    "your+registration+number+is:'"+regNumber+"'";
            URL textit = new URL("http://textit.biz/sendmsg/index.php?id=94718705365&pw=6012&to='"+recipiant+"'&text='"+msg+"'");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(textit.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"SMS Successfully Sent", ButtonType.OK);
            alert.show();
        }
    }

