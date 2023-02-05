package com.api.cepsbr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {
    @Id
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
}
