package com.tools.crm.dto;

import com.sun.istack.NotNull;

public class RequisicaoPagamentoDTO {
    @NotNull
    private TransacaoDTO transacao;

    public TransacaoDTO getPagamento() {
        return transacao;
    }
}
