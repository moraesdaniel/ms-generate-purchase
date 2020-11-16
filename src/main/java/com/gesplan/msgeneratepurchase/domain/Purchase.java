package com.gesplan.msgeneratepurchase.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class Purchase {
    private Client cliente;
    private double valor;
    private Date data;
    private double qtdItens;

    public Purchase(Client cliente, double totalValue, Date date, double qtdItems) {
        this.cliente = cliente;
        this.valor = totalValue;
        this.data = date;
        this.qtdItens = qtdItems;
    }
}
