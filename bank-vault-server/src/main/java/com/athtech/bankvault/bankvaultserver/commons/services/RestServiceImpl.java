package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.RestServiceException;
import com.athtech.bankvault.bankvaultserver.commons.payloads.RestServiceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServiceImpl implements RestService {


    private static final Logger log = LoggerFactory.getLogger(RestServiceImpl.class);



    @Override
    public RestServiceResponse get(String url, HttpHeaders headers) {

        RestTemplate restTemplate = new RestTemplate();

        return hitWithRestTemplate(HttpMethod.GET, url, null, headers, restTemplate);
    }



    private RestServiceResponse hitWithRestTemplate(HttpMethod httpMethod, String url, Object body, HttpHeaders headers, RestTemplate restTemplate) {


        RestServiceResponse response = null;

        try {
            HttpEntity<Object> request = createRequest(body, headers);

            ResponseEntity<String> responseString = restTemplate.exchange(url, httpMethod, request, String.class);

            response = RestServiceResponse.of(httpMethod, responseString.getStatusCode(), responseString.getBody());

        } catch (RestServiceException err) {
            response = RestServiceResponse.of(httpMethod, err.getErrorStatus(), err.getErrorBody());
        } catch (Exception err) {
            response = RestServiceResponse.ofError(httpMethod, err);
        }

        return response;
    }

    private static <T> HttpEntity<T> createRequest(T object, HttpHeaders headers) {

        if (object == null) {
            new HttpEntity<>(headers);
        }
        return new HttpEntity<>(object, headers);
    }
}
