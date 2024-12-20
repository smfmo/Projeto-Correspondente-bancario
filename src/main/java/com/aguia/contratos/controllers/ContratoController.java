package com.aguia.contratos.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import com.aguia.contratos.repositories.ContratoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.aguia.contratos.dtos.ContratoDto;
import com.aguia.contratos.model.Contrato;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    ContratoRepository repository;

    @GetMapping
    public ResponseEntity<List<Contrato>> getAll() {
        List<Contrato> listContratos = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listContratos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(value = "id") Integer id) {
        Optional<Contrato> contrato = repository.findById(id);
        if (contrato.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contrato não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(contrato.get());
    }

    @PostMapping
    public ResponseEntity<Contrato> save(@RequestBody ContratoDto dto) {
        var contrato = new Contrato();
        BeanUtils.copyProperties(dto, contrato);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(contrato));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        Optional<Contrato> contrato = repository.findById(id);
        if (contrato.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contrato não encontrado!");
        }
        repository.delete(contrato.get());
        return ResponseEntity.status(HttpStatus.OK).body("Contrato excluído!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Integer id, @RequestBody ContratoDto dto) {
        Optional<Contrato> contrato = repository.findById(id);
        if (contrato.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contrato não encontrado!");
        }
        var contratoModel = contrato.get();
        BeanUtils.copyProperties(dto, contratoModel);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(contratoModel));
    }

}
