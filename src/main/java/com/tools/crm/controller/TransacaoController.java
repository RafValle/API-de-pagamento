package com.tools.crm.controller;

import com.tools.crm.dto.RequisicaoPagamentoDTO;
import com.tools.crm.dto.RespostaPagamentoDTO;
import com.tools.crm.service.PagamentoServico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tools.crm.repository.PagamentoRepository;

import javax.validation.Valid;


@RestController
@Api(tags = "Transação")
@CrossOrigin(origins = "*")
public class TransacaoController {

	@Autowired
	private PagamentoServico pagamentoServico;

	@Autowired
	private PagamentoRepository pagamentoRepository;

	@PostMapping("/pagamento")
	@ApiOperation(value="Inserir um pagamento")
	public ResponseEntity<RespostaPagamentoDTO> realizarPagamento(
			@Valid @RequestBody RequisicaoPagamentoDTO requisicaoPagamentoDTO) {
		return new ResponseEntity<RespostaPagamentoDTO>(pagamentoServico.realizarPagamento(requisicaoPagamentoDTO),
				HttpStatus.CREATED);
	}
}
