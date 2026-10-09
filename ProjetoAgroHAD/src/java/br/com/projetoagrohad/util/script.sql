/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  andre
 * Created: 17/02/2023
 */

CREATE TABLE raca (
	idRaca SERIAL CONSTRAINT pk_raca PRIMARY KEY NOT NULL,
	nomeRaca VARCHAR(250) NOT NULL
);

CREATE TABLE vacina (
	idVacina SERIAL CONSTRAINT pk_vacina PRIMARY KEY NOT NULL,
	nomeVacina VARCHAR(200) NOT NULL,
	doseRecomendada VARCHAR(250) NOT NULL
);

CREATE TABLE paciente (
	codigoPaciente SERIAL CONSTRAINT pk_paciente PRIMARY KEY NOT NULL,
	codigoPessoa INT NOT NULL UNIQUE REFERENCES pessoa(codigoPessoa),
	numCartaoSusPaciente VARCHAR NOT NULL,
	statusPaciente BOOLEAN NOT NULL,
	codigoProfissao INT NOT NULL REFERENCES profissao(codigoProfissao)
);

