package com.diligitis.api.enuns;

public enum EnumSexualidade {
	
	BISSEXUAL("B", "Bissexual"),
	GAY("G", "Gay"),
	MENTE_ABERTA("M", "Mente Aberta"),
	HETEROSSEXUAL("H", "Heterossexual");
	
	private String sigla;
	private String descricao;
	
	private EnumSexualidade(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public EnumSexualidade getInstance(String sigla) {
		
		for (EnumSexualidade eS : values()) {
			if (eS.getSigla().equals(sigla)) {
				return eS;
			}
		}
		
		return null;
		
	}

}
