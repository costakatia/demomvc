package com.example.demo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcioanario extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String nome;

	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00 ")
	private BigDecimal salario;
	
	@Column(name = "data_entrada", nullable = false, columnDefinition =  "DATE")
	private LocalDate dataEntrada;
	
	@Column(name ="data_saida", nullable = false, unique = true, columnDefinition =  "DATE")
	private LocalDate dataSaida;
	
}
