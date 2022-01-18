package com.tools.crm.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pagamento")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idPagamento;
	private String cartao;
	private Double valor;
	private LocalDate dateTime;
	private String estabelecimento;
	private Integer nsu;
	private Integer condigoAutorizacao;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Enumerated(EnumType.STRING)
	private FormaPagamento tipo;
	private Long parcelas;

	public Pagamento(Long idPagamento, String cartao, Double valor, LocalDate dateTime,
					 String estabelecimento, Integer nsu, Integer condigoAutorizacao, Status status,FormaPagamento tipo, Long parcelas){
		super();
		this.idPagamento = idPagamento;
		this.cartao = cartao;
		this.valor = valor;
		this.dateTime = dateTime;
		this.estabelecimento = estabelecimento;
		this.nsu = nsu;
		this.condigoAutorizacao = condigoAutorizacao;
		this.status = status;
		this.tipo = tipo;
		this.parcelas = parcelas;
	}

	public Pagamento() {

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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Integer getNsu() {
		return nsu;
	}

	public void setNsu(Integer nsu) {
		this.nsu = nsu;
	}

	public Integer getCondigoAutorizacao() {
		return condigoAutorizacao;
	}

	public void setCondigoAutorizacao(Integer condigoAutorizacao) {
		this.condigoAutorizacao = condigoAutorizacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public LocalDate getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDate dateTime) {
		this.dateTime = dateTime;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ",idPagamento=" + idPagamento + ", cartao=" + cartao + ", valor=" + valor
				+ ", estabelecimento=" + estabelecimento + ", nsu=" + nsu + ", condigoAutorizacao=" + condigoAutorizacao + ", status=" + status
				+ ", tipo=" + tipo + ", parcelas=" + parcelas + "]";
	}
}
