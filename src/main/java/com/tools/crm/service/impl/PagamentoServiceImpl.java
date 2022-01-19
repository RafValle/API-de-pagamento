package com.tools.crm.service.impl;

import com.tools.crm.convert.RequisicaoConverter;
import com.tools.crm.dto.RequisicaoPagamentoDTO;
import com.tools.crm.dto.RespostaPagamentoDTO;
import com.tools.crm.model.Pagamento;
import com.tools.crm.model.Status;
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
    private RequisicaoConverter requisicaoConverter;

    @Override
    public RespostaPagamentoDTO realizarPagamento(RequisicaoPagamentoDTO requisicaoPagamentoDTO) {
        Pagamento pag = requisicaoConverter.convertToRequisicaoPagamento(requisicaoPagamentoDTO);

        pag.setNsu(1234);
        pag.setStatus(Status.AUTORIZADO);
        pag.setCondigoAutorizacao(1111111);
        Pagamento pagamento = pagamentoRepositorio.save(pag);
        RespostaPagamentoDTO respostaPagamentoDTO = new RespostaPagamentoDTO();

        respostaPagamentoDTO = requisicaoConverter.convertToRequisicaoPagamentoResposta(pagamento);

        return respostaPagamentoDTO;
    }
}
