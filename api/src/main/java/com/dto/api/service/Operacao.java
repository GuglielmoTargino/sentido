package com.dto.api.service;

import org.springframework.stereotype.Service;

@Service
public class Operacao {

    private String item=null;

    

    public String creditar(){

        item = "Creditou";
        return item;
    }

    public String debitar(){

        item = "Debitou";
        return item;
    }


}
