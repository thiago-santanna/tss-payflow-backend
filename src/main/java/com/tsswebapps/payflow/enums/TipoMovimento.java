package com.tsswebapps.payflow.enums;

public enum TipoMovimento {
    PIX("Pix"),
    TED("Transferência Eletrônica Disponível"),
    DOC("Documento de Crédito"),
    BOLETO("Boleto"),
    DEBITO("Débito"),
    CREDITO("Crédito"),
    DINHEIRO("Dinheiro"),
    CHEQUE("Cheque"),
    CARTAO("Cartão"),
    OUTROS("Outros");

    private String descricao;

    TipoMovimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
