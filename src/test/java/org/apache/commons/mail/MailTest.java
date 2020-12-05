package org.apache.commons.mail;

import java.util.Date;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MailTest extends TestCase{
    Email testEmail;

    @Before
    public void setUp() {
        testEmail = new SimpleEmail();
    }

    @Test
    public void testAddTo() throws EmailException {
        System.out.println("Adding recipient to mime");
        System.out.println("mio__");
        testEmail.addTo("aquaman@sea.com");
        assertEquals("aquaman@sea.com", testEmail.getToAddresses().get(0).toString());
    }

    @Test
    public void testSetSubject() {
        System.out.println("Set the subject for mime.");
        System.out.println("mio__");
        testEmail.setSubject("Hello World");
        assertEquals("Hello World", testEmail.getSubject());
    }
}