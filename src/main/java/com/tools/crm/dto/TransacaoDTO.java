package com.tools.crm.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TransacaoDTO {
    private Long idPagamento;
    @NotEmpty
    private String cartao;
    @NotNull
    private descTransacaoDTO descricao;
}
