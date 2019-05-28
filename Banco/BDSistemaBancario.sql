CREATE DATABASE BANCO;
USE BANCO;

-- TABELA DE CLIENTES
CREATE TABLE Clientes (
	ID_Cliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    NomeCliente VARCHAR(100) NOT NULL,
    EnderecoCliente VARCHAR(100) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    CPF_CNPJ INT NOT NULL,    
    Telefone INT NOT NULL
);

-- INSERINDO DADOS PARA TESTES NA TABELA CLIENTES
INSERT INTO Clientes (NomeCliente, EnderecoCliente, CPF_CNPJ, Email, Telefone) 
VALUES ('NomeTestééééée', 'EnderecoTeste', '12365478963', 'teste@email.com', '11952190193');
SELECT * FROM CLIENTES;

-- TABELA CONTA
CREATE TABLE CONTA (
	ID_Conta INTEGER PRIMARY KEY AUTO_INCREMENT,
    Saldo DECIMAL(10,2),
    Senha VARCHAR(10) NOT NULL,
    ID_Cliente INTEGER NOT NULL,    
    FOREIGN KEY (ID_Cliente) REFERENCES Clientes (ID_Cliente)
);
-- INSERINDO DADOS PARA TESTES NA TABELA CONTA 
INSERT INTO CONTA (ID_Cliente, Saldo, Senha)
VALUES (1, 1585.58, 'TESTE123éeee');

-- TABELA DE CARTÕES
CREATE TABLE Cartao (ID_Cartao INTEGER PRIMARY KEY AUTO_INCREMENT,
    NumAgencia INTEGER NOT NULL,
    CVV INTEGER NOT NULL,
    Bandeira VARCHAR(15) NOT NULL,
    Senha Varchar(10),
    CienteDesde DATE,
    Validade DATE,
    ID_CONTA INTEGER NOT NULL,
    ID_Cliente INTEGER NOT NULL,
    FOREIGN KEY FK_ContaCartao (ID_Conta) REFERENCES Conta (ID_Conta),
    FOREIGN KEY FK_ClienteCartao (ID_Cliente) REFERENCES Clientes (ID_Cliente)
);

INSERT INTO Cartao (NumAgencia, CVV, Bandeira, Senha, CienteDesde, Validade, ID_Conta, ID_Cliente) VALUES ('01', '15', 'Master Card', '123', '2005/05/01', '2020/05/29', '3', '1');


SELECT * FROM CONTA;
SELECT * FROM Cartao;


