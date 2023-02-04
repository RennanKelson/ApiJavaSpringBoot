package com.api.cepsbr.controller;

import com.api.cepsbr.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/via-ceps")
public class CepController {
    @GetMapping ("/status")
    public String getStatus (){
        return "UP";
    }

    @GetMapping("cep/{cep}")
    public Endereco getEnderecoCep (@PathParam("cep") String cep){
        return Endereco.builder().cep(cep).build();

//        Endereco endereco = new Endereco;
//        endereco.setCep(cep);
//
//        return endereco;
    }
}
