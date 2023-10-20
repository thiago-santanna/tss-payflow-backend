package com.tsswebapps.payflow.enums;

public enum BancosBrasileiros {
    BANCO_DO_BRASIL("001"),
    CAIXA_ECONOMICA_FEDERAL("104"),
    BRADESCO("237"),
    ITAU("341"),
    SANTANDER("033"),
    HSBC("399"),
    CITIBANK("745");

    private final String codigo;

    BancosBrasileiros(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
