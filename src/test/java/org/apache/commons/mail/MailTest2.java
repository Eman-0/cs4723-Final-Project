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

public class EmailTest extends TestCase{
	EmailMock testEmail;
	
	@Before
	public void setUp() {
		testEmail = new EmailMock();
		
	}
    
@Test
	public void testBuildMimeMessage() throws EmailException {
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
		
		testEmail.setHostName("John");
		testEmail.setFrom("Eman@gmail.com");
		testEmail.addTo("Hello@yahoo.com");
		testEmail.content = null;
		testEmail.setMsg("This is a test");
		testEmail.buildMimeMessage();
		
	}
	@Test
	public void testBuildMimeMessageExists() throws EmailException {
		
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