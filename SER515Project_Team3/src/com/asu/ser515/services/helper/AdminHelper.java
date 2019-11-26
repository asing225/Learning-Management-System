package com.asu.ser515.services.helper;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;

/**
 * @author anurag933103
 * @date 11/26/2019
 * 
 *       Helper class to initiate mail from user.
 */
public class AdminHelper {

	public static void main(String[] args) {
		  String recipient = "anurag933103@gmail.com"; 
		  
	      // email ID of  Sender. 
	      String sender = "anurag933103@gmail.com"; 

	      // using host as localhost 
	      String host = "localhost"; 
	  
	      // Getting system properties 
	      Properties properties = System.getProperties(); 
	      // Setting up mail server 
	      properties.setProperty("mail.smtp.host", host); 
	      // creating session object to get properties 
	      Session session = Session.getDefaultInstance(properties); 
	      
	    //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(sender));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(recipient));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }
	      catch (MessagingException mex) {
	    	  mex.printStackTrace();
	    	  }
	}

}
