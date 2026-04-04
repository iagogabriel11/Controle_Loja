package com.controler.Controle_loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controler.Controle_loja.services.hellowordserv;


@RestController
@RequestMapping("/hello-word")
public class helloword {

    @Autowired
    private hellowordserv hell;

    @GetMapping
    public String hellow(){
        return hell.hellowordvideo();
    }


}
