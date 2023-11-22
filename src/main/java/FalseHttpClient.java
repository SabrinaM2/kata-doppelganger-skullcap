import mailprovider.SendMailResponse;

class FalseHttpClient implements HttpClient {
    @Override
    public SendMailResponse post(String url, Object request) {
        return new SendMailResponse(200, "OK");
    }
}