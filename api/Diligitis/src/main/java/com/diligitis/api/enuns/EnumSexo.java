package com.diligitis.api.enuns;

public enum EnumSexo {
	
	MASCULINO("M"),
	FEMININO("F");
	
	private String sigla;
	
	private EnumSexo(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}
	
	public EnumSexo getInstance(String sigla) {
		
		for (EnumSexo eS : values()) {
			if (eS.getSigla().equals(sigla)) {
				return eS;
			}
		}
		
		return null;
		
	}

}
