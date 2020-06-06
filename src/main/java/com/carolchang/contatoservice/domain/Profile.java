package com.carolchang.contatoservice.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.carolchang.contatoservice.domain.enums.Projeto;

@Document
public class Profile extends Contato{
	private static final long serialVersionUID = 1L;
	
	public Profile() {
		super();
	}
	
	public Profile(String id, String nome, String email, String telefone, String mensagem,Integer projeto) {
		super(id,nome,email,telefone,mensagem,projeto);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome = ");
		builder.append(getNome());
		builder.append("\n");
		builder.append("Email = ");
		builder.append(getEmail());
		builder.append("\n");
		builder.append("Telefone = ");
		builder.append(getTelefone());
		builder.append("\n");
		builder.append("Mensagem = ");
		builder.append(getMensagem());
		builder.append("\n");
		builder.append("Projeto => ");
		builder.append(Projeto.getNomeProjeto(getProjeto()));
		builder.append("\n");
		return builder.toString();
	}

}
