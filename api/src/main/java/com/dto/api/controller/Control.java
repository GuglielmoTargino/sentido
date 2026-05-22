package com.dto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.api.service.Operacao;

@RestController
@RequestMapping("/lojinha")
public class Control {

  private String item;
  @Autowired
  private Operacao resu;


 @GetMapping("/credito")
    public ResponseEntity<String> testar(){
      item = resu.creditar();

        return new ResponseEntity<String>(item, HttpStatus.OK); 
    }

  @GetMapping("/debito")
    public ResponseEntity<String> testa2(){
      item = resu.debitar();

        return new ResponseEntity<String>(item, HttpStatus.OK); 
    }
 

    ////////////fim control
}
