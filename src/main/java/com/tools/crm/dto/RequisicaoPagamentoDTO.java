package com.tools.crm.dto;

import javax.validation.constraints.NotNull;

public class RequisicaoPagamentoDTO {

    @NotNull
    private TransacaoDTO transacao;

    public TransacaoDTO getTransacao() {
        System.out.println("teste:"+transacao);
        return transacao;
    }

    public void setTransacao(TransacaoDTO transacao) {
        this.transacao = transacao;
    }
}
