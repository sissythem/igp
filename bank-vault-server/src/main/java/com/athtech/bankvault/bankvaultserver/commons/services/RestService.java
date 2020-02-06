package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.payloads.RestServiceResponse;
import org.springframework.http.HttpHeaders;


public interface RestService {

    RestServiceResponse get(String url, HttpHeaders headers);
}
