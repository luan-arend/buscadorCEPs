package service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequestService {
    private String responseBody;
    public String getResponseBody() {
        return responseBody;
    }

    public HttpRequestService(String url) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            responseBody = response.body();
        } catch (RuntimeException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
