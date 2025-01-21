package dev.langchain4j.http.okhttp;

import dev.langchain4j.http.HttpClient;
import dev.langchain4j.http.HttpClientIT;

class OkHttpHttpClientIT extends HttpClientIT {

    @Override
    protected HttpClient client() {
        return new OkHttpHttpClientBuilder()
                .build();
    }
}
