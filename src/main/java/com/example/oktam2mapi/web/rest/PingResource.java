package com.example.oktam2mapi.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class PingResource {

    private static final Logger log = LoggerFactory.getLogger(PingResource.class);

    @GetMapping("/ping")
    public String ping() {

        log.info("Recieved Request");

        return "Succesfully Recieved Request";
    }


}
