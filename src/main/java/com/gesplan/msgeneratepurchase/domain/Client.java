package com.gesplan.msgeneratepurchase.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Client {
    private long id;
    private String nome;

    public Client(long id, String name) {
        this.id = id;
        this.nome = name;
    }
}