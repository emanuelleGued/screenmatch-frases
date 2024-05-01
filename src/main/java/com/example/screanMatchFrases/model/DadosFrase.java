package com.example.screanMatchFrases.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosFrase(@JsonAlias("Titulo") String titulo,
                         @JsonAlias("frase") String frase,
                         @JsonAlias("personagem") String personagem,
                         @JsonAlias("poster") String poster) {
}
