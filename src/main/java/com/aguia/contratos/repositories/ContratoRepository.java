package com.aguia.contratos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aguia.contratos.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Integer>{

}
