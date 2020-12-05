package org.apache.commons.mail;

import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class MailTest2 extends TestCase{
	SimpleEmail testEmail;
	
	@Before
	public void setUp() {
		testEmail = new SimpleEmail();
		
	}
    
@Test
	public void testBuildMimeMessage() throws EmailException {
		System.out.println("Tests a full mime message");
		System.out.println("mio__");
		
		Date date = new Date();
		testEmail.setCharset("UTF-8");
		testEmail.setHostName("John");
		testEmail.setFrom("Eman@gmail.com");
		testEmail.addTo("Hello@yahoo.com");
		testEmail.addBcc("ahoy@aol.com");
		testEmail.addCc("Moon23@yahoo.com");
		testEmail.addHeader("Emmanuel", "Hello");
		testEmail.setSentDate(date);
		testEmail.setSubject("Hello");
		testEmail.setMsg("This is a test");
		testEmail.buildMimeMessage();
		
	}
	@Test
	public void testBuildMimeMessageNullContent() throws EmailException {
		System.out.println("Tests for when the content is null");
		System.out.println("mio__");
		
		testEmail.setHostName("John");
		testEmail.setFrom("Eman@gmail.com");
		testEmail.addTo("Hello@yahoo.com");
		testEmail.content = null;
		testEmail.setMsg("This is a test");
		testEmail.buildMimeMessage();
		
	}
	@Test
	public void testBuildMimeMessageExists() throws EmailException {
		System.out.println("Tests to see if mime exists");
		System.out.println("mio__");
		
		testEmail.setHostName("John");
		testEmail.setFrom("Eman@gmail.com");
		testEmail.addTo("Hello@yahoo.com");
		testEmail.setMsg("Whats up");
		testEmail.buildMimeMessage();

		try{
			testEmail.buildMimeMessage();

		}catch (IllegalStateException e) {

		}	
    }
}
