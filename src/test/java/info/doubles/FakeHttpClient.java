package info.doubles;

import info.HttpClient;
import info.mailprovider.SendMailRequest;
import info.mailprovider.SendMailResponse;

public class FakeHttpClient implements HttpClient {
    @Override
    public SendMailResponse post(String url, Object request) {
        SendMailRequest sendMailRequest = (SendMailRequest) request;
        return new SendMailResponse(200, sendMailRequest.recipient() + sendMailRequest.subject() + sendMailRequest.body());
    }
}