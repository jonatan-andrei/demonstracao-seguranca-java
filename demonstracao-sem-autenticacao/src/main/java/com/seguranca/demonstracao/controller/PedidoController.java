package com.seguranca.demonstracao.controller;


import com.seguranca.demonstracao.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @DeleteMapping("/{id}")
    public ResponseEntity cancelar(@PathVariable Long id) {
        pedidoService.cancelar(id);
        return ResponseEntity.ok().build();
    }
}
