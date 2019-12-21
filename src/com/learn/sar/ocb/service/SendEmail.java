package com.learn.sar.ocb.service;


import java.util.Properties;

import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail extends Authenticator {
	
	public SendEmail() {
		super();
	}
	

	public static void mailToStoreManager() {
		// TODO Auto-generated method stub
		String recipient = "n.ratheesh2010@gmail.com";
		String sender = "nichuspalace@gmail.com";
		String password = "********";
		
		Properties properties = System.getProperties();
		
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");   
		properties.put("mail.smtp.auth", "true"); 
		
		
		
		Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(sender,password);
				}
				});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
			message.setSubject("Purchase Order Created");
			message.setText("OCB has been created on Dec 19th,2019.");
			
			Transport.send(message);
			System.out.println("Mail successfully sent");
		}
		catch (MessagingException mex)
		{
			mex.printStackTrace();
		}

	}

}
