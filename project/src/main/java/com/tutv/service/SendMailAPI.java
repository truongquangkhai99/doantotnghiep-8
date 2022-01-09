/**
 * @package com.tutv.service
 * @date Dec 18, 2021
 * @author trinh
 */
package com.tutv.service;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

/**
 * SendMailAPI
 */
@Service
public class SendMailAPI {
	public static void sendMailTU(String toEmail, String subject, String body) throws MessagingException, UnsupportedEncodingException  {
		final String fromEmail = "trinhtu16051999@gmail.com";
		final String password = "Thanhthuy34";
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
    props.put("mail.smtp.port", "587"); //TLS Port
    props.put("mail.smtp.auth", "true"); //enable authentication
    props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");  
 // smtp.gmail.com supports TLSv1.2 and TLSv1.3
    props.put("mail.smtp.ssl.protocols", "TLSv1.2");

    Authenticator auth = new Authenticator() {
    	 	@Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(fromEmail, password);
        }
    };
    Session session = null;   
    session =	Session.getDefaultInstance(props, auth);
    MimeMessage msg = new MimeMessage(session);
    //set message headers
    msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
    msg.addHeader("format", "flowed");
    msg.addHeader("Content-Transfer-Encoding", "8bit");
    msg.setFrom(new InternetAddress(fromEmail, "ADMIN - Thuy Loi University"));
    msg.setReplyTo(InternetAddress.parse(fromEmail, false));
    msg.setSubject(subject, "UTF-8");
    /*msg.setText(body, "UTF-8");*/
    msg.setContent(body, "text/html; charset=utf-8");
    msg.setSentDate(new Date());
    msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
    Transport.send(msg);
	}
}
