package com.api.cepsbr.controller;

import com.api.cepsbr.model.Endereco;
import com.api.cepsbr.service.CorreiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class CepController {
    @Autowired
    private CorreiosService service;
    @GetMapping ("/status")
    public String getStatus (){
        return "Service Status: " + this.service.getStatus();
    }

    @GetMapping("cep/{cep}")
    public Endereco getEnderecoCep (@PathVariable("cep") String cep){
        return this.service.getEnderecoCep(cep);
    }
}
