package Business.sms;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class InterviewSMS {
    public static void SendSMS(String recipiant,String regNumber,String interviewDate) throws Exception {

        String msg="NAITA+Registration+Number:"+regNumber+"+" +
                "Interview+Date:"+interviewDate+"+" +
                "See+your+email+for+details+" +
                "District+Manager-NAITA+Colombo.";
        URL textit = new URL("http://textit.biz/sendmsg/index.php?id=94718705365&pw=xxxx&to="+recipiant+"&text="+msg+"");
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
