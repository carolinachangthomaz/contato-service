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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome = ");
		builder.append(getNome());
		builder.append(", Email = ");
		builder.append(getEmail());
		builder.append(", Telefone = ");
		builder.append(getTelefone());
		builder.append(", Mensagem = ");
		builder.append(getMensagem());
		builder.append(", Projeto = ");
		builder.append(getProjeto());
		builder.append("\n");
		return builder.toString();
	}

}
