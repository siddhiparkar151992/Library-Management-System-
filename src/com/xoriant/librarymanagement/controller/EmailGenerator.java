package com.xoriant.librarymanagement.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.xoriant.librarymanagement.businessObjects.User;

public class EmailGenerator {

	public  void generateEmail(Map<String,String> usernameAndPassword,User user) {

		String email = user.getEmail1();

		Iterator<Map.Entry<String, String>> entries = usernameAndPassword
				.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();

			final String username = "siddhiparkar15@gmail.com";
			final String password = "9664875508";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username,
									password);
						}
					});

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("siddhiparkar15@gmail.com"));

				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(user.getEmail1()));
				message.setSubject("Welcome To Online Library System");
				message.setText("Dear User Heartiest Congratulations for subscriptions, USername is +"
						+ entry.getKey() + "Value is " + entry.getValue());

				Transport.send(message);

				System.out.println("Email Sent to first Email address");
			}

			catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}

	}

	
}