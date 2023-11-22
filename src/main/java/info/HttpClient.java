package info;

import info.mailprovider.SendMailResponse;

public interface HttpClient {
    SendMailResponse post(String url, Object request);
}
