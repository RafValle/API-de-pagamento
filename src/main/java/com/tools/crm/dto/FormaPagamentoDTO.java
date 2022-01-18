package com.tools.crm.dto;

import com.tools.crm.model.FormaPagamento;

import javax.validation.constraints.NotNull;

public class FormaPagamentoDTO {

    @NotNull
    private FormaPagamento tipo;
    @NotNull
    private Long parcelas;

    public FormaPagamentoDTO(FormaPagamento tipo, Long parcelas) {
        super();
        this.tipo = tipo;
        this.parcelas = parcelas;
    }

    public FormaPagamentoDTO(){

    }

    public FormaPagamento getTipo() {
        return tipo;
    }

    public void setTipo(FormaPagamento tipo) {
        this.tipo = tipo;
    }

    public Long getParcelas() {
        return parcelas;
    }

    public void setParcelas(Long parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "formaDTO [tipo=" + tipo + ", parcelas" + parcelas + "]";
    }
}
