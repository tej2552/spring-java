package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRESTController {

    @Value("${myAnime.favourite}")
    String favAnime;

    @Value("${myAnime.isekai}")
    String isekaiAnime;

    @GetMapping("/")
    public String content(){
        return "My App";
    }

    @GetMapping("/demo")
    public String demoEndpoint(){
        return "Ohayo Gosaimas";
    }

    @GetMapping("/Favourite")
    public String show(){ return favAnime; }

    @GetMapping("/isekai")
    public String show1(){ return isekaiAnime; }

}
