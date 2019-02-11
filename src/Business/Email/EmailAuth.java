/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author dsinf
 */
public class EmailAuth {
    public static final String SMTP_HOST_NAME = "smtp.gmail.com";
    public static final String SMTP_AUTH_USER = "jaychitalia2@gmail.com";
    public static final String SMTP_AUTH_PWD = "worldwar55";

    public static void postMail(String recipient, String message, String sender) throws MessagingException, AddressException, javax.mail.MessagingException {
        boolean debug = false;
        Properties props = new Properties();
        
        props.put("mail.imap.ssl.enable", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);
        session.setDebug(debug);
        Message msg = new MimeMessage(session);
        InternetAddress addressFrom = new InternetAddress(sender);
        msg.setFrom(addressFrom);
        InternetAddress addressTo = new InternetAddress(recipient);
        msg.setRecipient(Message.RecipientType.TO, addressTo);
        msg.setContent(message, "text/plain");
        Transport.send(msg);
    }
}

    

