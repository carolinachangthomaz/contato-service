package com.carolchang.contatoservice.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.carolchang.contatoservice.domain.enums.Projeto;

@Document
public class Profile extends Contato{
	private static final long serialVersionUID = 1L;
	
	public Profile() {
		super();
	}
	
	public Profile(String id, String nome, String email, String telefone, String mensagem, Projeto projeto) {
		super(id,nome,email,telefone,mensagem,projeto);
	}

}
