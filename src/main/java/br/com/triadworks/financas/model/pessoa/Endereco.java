package br.com.triadworks.financas.model.pessoa;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String numero;
	private String bairro;
	private String complemento;
	private String cep;
	
}
