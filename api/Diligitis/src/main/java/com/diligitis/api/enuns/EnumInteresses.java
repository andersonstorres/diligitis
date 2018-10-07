package com.diligitis.api.enuns;

public enum EnumInteresses {
	
	AMIZADES("A", "Amizades"),
	BATE_PAPO("B", "Bater Papo"),
	RELACIONAMENTO_SERIO("S", "Relacionamento Sério"),
	RELACIONAMENTO_CASUAL("C", "Relacionamento Casual");
	
	private String sigla;
	private String descricao;
	
	private EnumInteresses(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public EnumInteresses getInstance(String sigla) {
		
		for (EnumInteresses eS : values()) {
			if (eS.getSigla().equals(sigla)) {
				return eS;
			}
		}
		
		return null;
		
	}

}
