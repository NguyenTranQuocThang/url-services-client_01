package com.microservices.urlservicesclient_01.service;

import com.microservices.urlservicesclient_01.model.Client01;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "client00", url = "localhost:8000")
@FeignClient(name="client00")
public interface Client00Proxy {
    @GetMapping("/client00")
    Client01 retrieveValue();
}
