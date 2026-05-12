package com.dto.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lojinha")
public class Control {


    @GetMapping("/galeria")
    public ResponseEntity<String> teste(){

        return new ResponseEntity<>("Lojinha Legal!", HttpStatus.OK);
        
    }



}
