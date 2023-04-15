package com.microservices.urlservicesclient_01.controller;

import com.microservices.urlservicesclient_01.model.Client01;
import com.microservices.urlservicesclient_01.service.Client00Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client01Controller {
    //    @GetMapping("/client01")
//    public ResponseEntity<?> getDataFromClient0() {
//        String url = "http://localhost:8000/client00";
//        // if u send anything with url just set to map and put to last of this response
//        // element
//        ResponseEntity<Client01> response = new RestTemplate().getForEntity(url, Client01.class);
//        var client00 = response.getBody();
//        return ResponseEntity.ok().body(Client01.builder().environment(client00.getEnvironment())
//                .dataTransfer(client00.getDataTransfer()).build());
//    }
    @Autowired
    private Client00Proxy client00Proxy;

    @GetMapping("/client01")
    public ResponseEntity<?> getDataFromClient0UseFeign() {
        var client00 = client00Proxy.retrieveValue();
        return ResponseEntity.ok().body(Client01.builder()
                .environment(client00.getEnvironment()+" feign")
                .dataTransfer(client00.getDataTransfer()).build());
    }
}
