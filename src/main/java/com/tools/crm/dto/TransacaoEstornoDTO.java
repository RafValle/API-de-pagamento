package com.tools.crm.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoEstornoDTO {
    @NotNull
    private Long idPagamento;
    @NotEmpty
    private String cartao;
    @NotNull
    private DescTransacaoRepostaDTO descricao;
    @NotNull
    private  FormaPagamentoDTO formaPagamento;

    public FormaPagamentoDTO getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoDTO formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "estornoDTO [cartao=" + cartao + ", id=" + idPagamento + ", descricao=" + descricao +  ", formaPagamento= " + formaPagamento +"]";}
}