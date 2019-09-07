package email;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendTextMail {
    public static void composeMail(String recipient,String regNumber,String stdName) throws Exception {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","25");

        String myEmail="ravindugunarathna@gmail.com";
        String password="19980924";
        Session session=Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,password);
            }
        });
        Message message=prareMassage(session,myEmail,recipient,regNumber,stdName);

        Transport.send(message);
        System.out.println("Message sent successful");

    }

    public static Message prareMassage(Session session,String myEmail,String recipiant,String regNumber,String stdName){
        try {
            Message message=new MimeMessage(session);

            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipiant));
            message.setSubject("NAITA Course Registration");
            message.setText("You have been registered at NAITA Colombo\n" +
                    "Student Name:'"+stdName+"'\n"+
                    "your registration number is:'"+regNumber+"'\n" +
                    "We will be called  for an interview as soon as possible.\n\n" +
                    "M.R.D.A.S Gunarathna\n" +
                    "District Manager\n" +
                    "NAITA Colombo");
            return message;
        } catch (Exception e) {
            Logger.getLogger(SendTextMail.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

}
