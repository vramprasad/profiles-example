package com.prasad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HealthCheckController {
    @Value("${environment}")
    private String environment;

    @GetMapping("/healthcheck")
    public String healthcheck() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return "ENV = "+environment+" : healthcheck @ " + timeStamp + " - All OK";
    }
}
