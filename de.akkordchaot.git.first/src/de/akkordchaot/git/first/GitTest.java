package de.akkordchaot.git.first;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GitTest {
	
    public static void main(String[] args) {
        
        String recipient = "simon.007@web.de";
        
        String sender = "simon.reichhuber@gmx.de";
        
        String host = "localhost:8080";
        
        Properties properties = System.getProperties();
        
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties);
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            
            message.setSubject("Test Message sended with java");
            message.setText("This is an example text.");
            
            Transport.send(message);
            System.out.println("Message was sent successfully");
            
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
