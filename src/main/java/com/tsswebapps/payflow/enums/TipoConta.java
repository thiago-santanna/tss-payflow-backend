package com.tsswebapps.payflow.enums;

public enum TipoConta {

    CARTEIRA("Carteira"),
    BANCO("Banco"),
    CARTAO("Cartão");

    private final String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
