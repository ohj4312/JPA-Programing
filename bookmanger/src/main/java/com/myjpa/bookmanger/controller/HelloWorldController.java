package com.myjpa.bookmanger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest API 요청을 받을 수 있는 컨트롤러
public class HelloWorldController {
    
    //cf) ctrl + shift+ T : 테스트 만들기
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world";
    }
}
