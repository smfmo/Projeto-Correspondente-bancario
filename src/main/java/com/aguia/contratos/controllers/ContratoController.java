package com.aguia.contratos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.aguia.contratos.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.aguia.contratos.model.Contrato;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    ContratoRepository repository;

    @GetMapping
    public ResponseEntity<List<Contrato>> getAll(){
        List<Contrato> listContratos = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listContratos);
    }
}
