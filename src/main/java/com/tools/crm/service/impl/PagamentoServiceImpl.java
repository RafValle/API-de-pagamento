package com.tools.crm.service.impl;

import com.tools.crm.dto.RequisicaoPagamentoDTO;
import com.tools.crm.dto.RespostaPagamentoDTO;
import com.tools.crm.model.Pagamento;
import com.tools.crm.repository.PagamentoRepository;
import com.tools.crm.service.PagamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class PagamentoServiceImpl implements PagamentoServico {

    @Autowired
    private PagamentoRepository pagamentoRepositorio;

    @Autowired
    private ConversionService conversionService;

    @Override
    public RespostaPagamentoDTO realizarPagamento(RequisicaoPagamentoDTO requisicaoPagamentoDTO) {
        Pagamento pag = conversionService.convert(requisicaoPagamentoDTO.getTransacao(), Pagamento.class);

        Pagamento pagamento = pagamentoRepositorio.save(pag);
        RespostaPagamentoDTO respostaPagamentoDTO = new RespostaPagamentoDTO();
        respostaPagamentoDTO.setIdPagamento(pagamento.getIdPagamento());
        respostaPagamentoDTO.setCartao(pagamento.getCartao());


        return respostaPagamentoDTO;
    }
}
