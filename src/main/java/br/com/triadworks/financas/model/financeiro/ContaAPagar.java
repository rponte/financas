package br.com.triadworks.financas.model.financeiro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.triadworks.financas.model.pessoa.Fornecedor;

@Entity
public class ContaAPagar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String numeroDoDocumento;
	private String descricao;
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	@Enumerated(EnumType.STRING)
	private FormaDePagamento formaDePagamento = FormaDePagamento.DINHEIRO;
	
	@Column(precision=15, scale=2)
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE)
	private Date emitidoEm;
	
	@OneToMany
	@JoinColumn(name="conta_id")
	private List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
	
}
