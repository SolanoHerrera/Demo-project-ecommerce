package email;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.annotations.Test;

public class EmailTest {

    @Test
    public void emailTest() throws EmailException {
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("\"C:\\Users\\dolap\\OneDrive\\Documentos\\Solano\\" +
                "Guru99-Ecommerce\\Proyecto ecommerce\\TestCases.zip\"");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Test Cases");
        attachment.setName("Test");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.addTo("qatesting3118@gmail.com", "Qa Tester");
        email.setFrom("qatesting3118@gmail.com", "Qa Tester");
        email.setSubject("The Test cases");
        email.setMsg("Here is the test cases you wanted");

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
    }
}
