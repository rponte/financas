package br.com.triadworks.financas.model.pessoa;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String fantasia;
	
	@Enumerated(EnumType.STRING)
	private TipoDePessoa tipo;
	private String numeroDoDocumento;
	@Embedded
	private Endereco endereco;
	private String email;
	private String telefone;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date cadastradoEm;
	@Temporal(TemporalType.TIMESTAMP)
	private Date atualizadoEm;
	
}
