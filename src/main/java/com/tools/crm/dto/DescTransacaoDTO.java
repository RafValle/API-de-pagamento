package com.tools.crm.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DescTransacaoDTO {
    @NotNull
    private Double valor;
    @NotNull
    private LocalDate dataHora;
    @NotEmpty
    private String estabelecimento;

    public DescTransacaoDTO(Double valor, LocalDate dataHora, String estabelecimento) {
        super();
        this.valor = valor;
        this.dataHora = dataHora;
        this.estabelecimento = estabelecimento;
    }

    public DescTransacaoDTO(){

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    @Override
    public String toString() {
        return "descricaoDTO [valor=" + valor + ", dataHora=" + dataHora + ", estabelecimento=" + estabelecimento + "]";
    }
}
