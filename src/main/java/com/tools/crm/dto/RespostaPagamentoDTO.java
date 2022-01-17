package com.tools.crm.dto;

public class RespostaPagamentoDTO {
    private Long idPagamento;
    private String cartao;

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

    @Override
    public String toString() {
        return "RespostaPagamentoDTO [idPagamento=" + idPagamento + ", cartao=" + cartao + "]";
    }
}
