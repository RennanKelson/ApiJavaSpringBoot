package com.api.cepsbr.service;

import com.api.cepsbr.exception.NoContentException;
import com.api.cepsbr.model.Endereco;
import com.api.cepsbr.model.Status;
import com.api.cepsbr.repository.EnderecoRepository;
import com.api.cepsbr.repository.EnderecoStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorreiosService {
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private EnderecoStatusRepository enderecoStatusRepository;
    public Status getStatus(){
        return Status.ESTA_PRONTO;
    }
    public Endereco getEnderecoCep(String cep) throws NoContentException{
        return enderecoRepository.findById(cep).
                orElseThrow(NoContentException::new);
    }
    public void Status() {

    }
}
