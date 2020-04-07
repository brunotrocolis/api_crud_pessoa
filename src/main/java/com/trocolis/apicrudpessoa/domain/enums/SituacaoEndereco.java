package com.trocolis.apicrudpessoa.domain.enums;

public enum SituacaoEndereco {
    ATIVO("Ativo"), DESATIVADO("Desativado");

    private String descricao;

    SituacaoEndereco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
