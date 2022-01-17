package com.tools.crm.controller;

import java.util.List;

import com.tools.crm.dto.RequisicaoPagamentoDTO;
import com.tools.crm.dto.RespostaPagamentoDTO;
import com.tools.crm.service.PagamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tools.crm.model.Pagamento;
import com.tools.crm.repository.PagamentoRepository;

import javax.validation.Valid;


@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

	@Autowired
	private PagamentoServico pagamentoServico;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;

	@GetMapping
	public List<Pagamento> listar() {
		return pagamentoRepository.findAll();	
	}

//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public Pagamento adicionar(@RequestBody Pagamento pagamento) {
//		return pagamentoRepository.save(pagamento);
//
//	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<RespostaPagamentoDTO> realizarPagamento(
			@Valid @RequestBody RequisicaoPagamentoDTO requisicaoPagamentoDTO) {
		return new ResponseEntity<RespostaPagamentoDTO>(pagamentoServico.realizarPagamento(requisicaoPagamentoDTO),
				HttpStatus.CREATED);
	}
}
