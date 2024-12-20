package com.aguia.contratos.dtos;

import java.math.BigDecimal;

public record ContratoDto(
        String nomeCliente,
        String cpf,
        BigDecimal valorBruto,
        BigDecimal valorLiquido,
        BigDecimal valorPrestacao,
        int numeroPrestacoes,
        String telefone) {

}
