package com.tools.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tools.crm.model.Pagamento;
import com.tools.crm.repository.PagamentoRepository;


@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository pagamentoRepository;

	@GetMapping
	public List<Pagamento> listar() {
		return pagamentoRepository.findAll();	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pagamento adicionar(@RequestBody Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
		
	}
}
