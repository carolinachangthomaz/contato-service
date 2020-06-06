package com.carolchang.contatoservice.domain.enums;


public enum Projeto {
	
	PROFILE(1,"PROFILE"),
	NEOHOUSECAMPOBELO(2,"NEOHOUSE CAMPO BELO");
	
	
	private int codigo;
	private String descricao;
	
	private Projeto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	
	public static Projeto toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for (Projeto p : Projeto.values()) {
			if(codigo.equals(p.getCodigo())) {
				return p;
			}
		}
		
		throw new IllegalArgumentException("Código inválido");
	}
	
	public static String getNomeProjeto(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for (Projeto p : Projeto.values()) {
			if(codigo.equals(p.getCodigo())) {
				return p.getDescricao();
			}
		}
		
		throw new IllegalArgumentException("Código inválido");
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
