package com.tools.crm.service;

import com.tools.crm.dto.RequisicaoPagamentoDTO;
import com.tools.crm.dto.RespostaPagamentoDTO;

public interface PagamentoServico {
    public RespostaPagamentoDTO realizarPagamento(RequisicaoPagamentoDTO requisicaoPagamentoDTO);
}
