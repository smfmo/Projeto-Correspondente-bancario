CREATE TABLE contrato (
    id SERIAL PRIMARY KEY,
    nome_cliente VARCHAR(255) NOT NULL,
    cpf CHAR(11) NOT NULL,
    valor_bruto NUMERIC(15, 2) NOT NULL,
    valor_liquido NUMERIC(15, 2) NOT NULL,
    valor_prestacao NUMERIC(15, 2) NOT NULL,
    numero_prestacoes INT NOT NULL,
    telefone VARCHAR(15) NOT NULL
);
