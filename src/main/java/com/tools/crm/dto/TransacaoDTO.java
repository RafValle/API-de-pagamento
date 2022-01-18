package com.tools.crm.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TransacaoDTO {

    @NotNull
    private Long idPagamento;
    @NotEmpty
    private String cartao;
    @NotNull
    private DescTransacaoDTO descricao;
    @NotNull
    private FormaPagamentoDTO formaPagamento;

    public TransacaoDTO(Long idPagamento,String cartao, DescTransacaoDTO descricao, FormaPagamentoDTO formaPagamento){
        super();
        this.idPagamento = idPagamento;
        this.cartao = cartao;
        this.descricao = descricao;
        this.formaPagamento = formaPagamento;
    }

    public TransacaoDTO(){

    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public DescTransacaoDTO getDescricao() {
        return descricao;
    }

    public void setDescricao(DescTransacaoDTO descricao) {
        this.descricao = descricao;
    }

    public FormaPagamentoDTO getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoDTO formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "transacao [cartao=" + cartao + ", id=" + idPagamento + ", descricao=" + descricao +  ", formaPagamento= " + formaPagamento +"]";}
}
