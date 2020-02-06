package com.athtech.bankvault.bankvaultserver.commons.payloads;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.util.Optional;

public class RestServiceResponse
{
    private HttpMethod method;
    private String responseBody;
    private HttpStatus status;
    private Exception err;

    private RestServiceResponse(HttpMethod method, HttpStatus status, String responseBody)
    {
        this.method = method;
        this.status = status;
        this.responseBody = responseBody;
        this.err = null;
    }

    private RestServiceResponse(HttpMethod method, Exception err)
    {
        this.method = method;
        this.status = null;
        this.responseBody = null;
        this.err = err;
    }

    public RestServiceResponse() {
    }

    public static RestServiceResponse of(HttpMethod method, HttpStatus status, String responseBody)
    {
        return new RestServiceResponse(method, status, responseBody);
    }

    public static RestServiceResponse ofError(HttpMethod method, Exception err)
    {
        return new RestServiceResponse(method, err);
    }

    public HttpMethod getMethod()
    {
        return method;
    }

    public Optional<String> getResponseBody()
    {
        return Optional.ofNullable(responseBody);
    }

    public Optional<HttpStatus> getStatus()
    {
        return Optional.ofNullable(status);
    }

    public Optional<Exception> getErr()
    {
        return Optional.ofNullable(err);
    }

    public Boolean hasException()
    {
        return getErr().isPresent();
    }

    public Boolean isErroneous()
    {
        return hasException();
    }
}

