package info;

import info.doubles.FakeHttpClient;
import info.mailprovider.SendMailResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MailSenderTest {
    @Test
    void should_make_a_valid_http_request() {
        // TODO: write a test to demonstrate the bug in MailSender.sendV1()
        MailSender mailSender = new MailSender(new FakeHttpClient());
        User user = new User("User", "user@example.com");

        assertDoesNotThrow(() -> mailSender.sendV1(user, "Message"));
    }

    @Test
    void should_retry_when_getting_a_503_error() {
        // TODO: write a test to demonstrate the bug in MailSender.sendV2
        MailSender mailSender = new MailSender(new FakeHttpClient());
        User user = new User("User", "user@example.com");

        // Le test échouera car la construction de SendMailRequest utilise des paramètres dans le mauvais ordre
        assertDoesNotThrow(() -> mailSender.sendV1(user, "Message"));
    }

    @Test
    void should_fail_sendV2_due_to_bug() {
        FakeHttpClient fakeHttpClient = new FakeHttpClient() {
            @Override
            public SendMailResponse post(String url, Object request) {
                return new SendMailResponse(503, "Service Unavailable");
            }
        };
        MailSender mailSender = new MailSender(fakeHttpClient);
        User user = new User("User", "user@example.com");

        assertDoesNotThrow(() -> mailSender.sendV2(user, "Message"));
    }
}

