package com.diligitis.api.enuns;

public enum EnumEstadoCivil {
	
	RELACAO_COMPLICADA("Em uma relação complicada"),
	SOLTEIRO("Solteiro"),
	RELACIONAMENTO("Em um relacionamento");
	
	private String descricao;
	
	private EnumEstadoCivil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public EnumEstadoCivil getInstance(String descricao) {
		
		for (EnumEstadoCivil eS : values()) {
			if (eS.getDescricao().equals(descricao)) {
				return eS;
			}
		}
		
		return null;
		
	}

}
