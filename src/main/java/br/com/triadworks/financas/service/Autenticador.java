package br.com.triadworks.financas.service;

import br.com.triadworks.financas.model.Usuario;

public interface Autenticador {

	public Usuario autentica(String login, String senha);

}
