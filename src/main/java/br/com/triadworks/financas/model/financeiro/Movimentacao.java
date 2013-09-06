package br.com.triadworks.financas.model.financeiro;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movimentacao {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated
	private TipoDeMovimentacao tipo;
	@Enumerated
	private Status status;
	
	@Column(precision=15, scale=2)
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE)
	private Date vencimento;
	
	@Temporal(TemporalType.DATE)
	private Date dataDePagamento;
	
	
}
