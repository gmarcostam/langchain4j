package dev.langchain4j.http.okhttp;

import dev.langchain4j.http.HttpClientBuilder;
import okhttp3.OkHttpClient;

import java.time.Duration;

public class OkHttpHttpClientBuilder implements HttpClientBuilder {

    private OkHttpClient.Builder okHttpClientBuilder;
    private Duration connectTimeout;
    private Duration readTimeout;
    private boolean logRequests;
    private boolean logResponses;

    public OkHttpClient.Builder okHttpClientBuilder() {
        return okHttpClientBuilder;
    }

    public OkHttpHttpClientBuilder okHttpClientBuilder(OkHttpClient.Builder okHttpClientBuilder) {
        this.okHttpClientBuilder = okHttpClientBuilder;
        return this;
    }

    @Override
    public Duration connectTimeout() {
        return connectTimeout;
    }

    @Override
    public OkHttpHttpClientBuilder connectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    @Override
    public Duration readTimeout() {
        return readTimeout;
    }

    @Override
    public OkHttpHttpClientBuilder readTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    @Override
    public boolean logRequests() {
        return logRequests;
    }

    @Override
    public OkHttpHttpClientBuilder logRequests(boolean logRequests) {
        this.logRequests = logRequests;
        return this;
    }

    @Override
    public boolean logResponses() {
        return logResponses;
    }

    @Override
    public OkHttpHttpClientBuilder logResponses(boolean logResponses) {
        this.logResponses = logResponses;
        return this;
    }

    @Override
    public OkHttpHttpClient build() {
        return new OkHttpHttpClient(this);
    }
}
