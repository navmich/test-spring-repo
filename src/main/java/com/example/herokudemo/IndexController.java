package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Michal Navrátil
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
}
