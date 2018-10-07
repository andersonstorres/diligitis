package com.diligitis.api.enuns;

public enum EnumGenero {
	
	MASCULINO("M", "Masculino"),
	FEMININO("F", "Feminino");
	
	private String sigla;
	private String descricao;
	
	private EnumGenero(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public EnumGenero getInstance(String sigla) {
		
		for (EnumGenero eS : values()) {
			if (eS.getSigla().equals(sigla)) {
				return eS;
			}
		}
		
		return null;
		
	}

}
