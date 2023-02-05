package com.api.cepsbr.service;

import com.api.cepsbr.model.Endereco;
import com.api.cepsbr.model.Status;
import org.springframework.stereotype.Service;

@Service
public class CorreiosService {
    public Status getStatus(){
        return Status.ESTÁ_PRONTO;
    }
    public Endereco getEnderecoCep(String cep){
        return null;
    }
    public void Status() {

    }
}
