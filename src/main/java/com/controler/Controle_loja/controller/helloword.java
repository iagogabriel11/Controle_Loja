package com.controler.Controle_loja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-word")
public class helloword {

    @GetMapping
    public String hellow(){
        return "Hello word";
    }


}
