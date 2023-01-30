package com.api.cepsbr.controller;

import com.api.cepsbr.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CepController {
    @GetMapping ("/status")
    public String getStatus (){
        return "UP";
    }

    @GetMapping("/zipcode/{zipcode}")
    public Endereco getEnderecoZipCode (@PathParam("zipcode") String zipcode){
        return Endereco.builder().zipcode(zipcode).buid();
    }
}
