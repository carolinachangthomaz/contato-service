package com.carolchang.contatoservice.domain;

import com.carolchang.contatoservice.domain.enums.Projeto;

public class Profile extends Contato{
	private static final long serialVersionUID = 1L;
	
	public Profile() {
		super();
	}
	
	public Profile(String id, String nome, String email, String telefone, String mensagem, Projeto projeto) {
		super(id,nome,email,telefone,mensagem,projeto);
	}

}
