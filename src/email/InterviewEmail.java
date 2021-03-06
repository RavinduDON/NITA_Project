package email;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterviewEmail {
    public static void composeMail(String recipient,String regNumber,String stdName,String interviewDate,String interviewTime,String interviewPlace) throws Exception {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","25");

        String myEmail="colombostudent.nita@gmail.com";
        String password="xxxxxxxxxxxxxxxxxxxx";
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,password);
            }
        });
        Message message=prareMassage(session,myEmail,recipient,regNumber,stdName,interviewDate,interviewTime,interviewPlace);

        Transport.send(message);
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Email Successfully Sent", ButtonType.OK);
        alert.show();

    }

    public static Message prareMassage(Session session,String myEmail,String recipiant,String regNumber,String stdName,String interviewDate,String interviewTime,String interviewPlace){
        try {
            Message message=new MimeMessage(session);

            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipiant));
            message.setSubject("Notice for NAITA Interview");
            message.setText("You are hereby noticed that your Interview for NAITA training \n" +
                    "is fixed as mentioned below\n\n" +
                    "1. Student Name:'"+stdName+"'\n"+
                    "2. Registration number is:'"+regNumber+"'\n" +
                    "3. Place: "+interviewPlace+"\n" +
                    "4. Time: "+interviewTime+"\n" +
                    "5. Date: "+interviewDate+"\n" +
                    "6. Documents: National Identity Card,Birth Certificate,Educational Certificates with supporting Certificates.\n" +
                    "7. Dress: Smart-Black & White\n" +
                    "8. Inquiries: 0112597672\n\n" +
                    "M.R.D.A.S Gunarathna\n" +
                    "District Manager\n" +
                    "NAITA-Colombo");
            return message;
        } catch (Exception e) {
            Logger.getLogger(SendTextMail.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }
}
