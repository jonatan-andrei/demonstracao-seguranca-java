package com.seguranca.demonstracao.service.impl;

import com.seguranca.demonstracao.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Override
    public void cancelar(Long id) {
        // Apenas simulação
    }

}
