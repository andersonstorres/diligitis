package com.diligitis.api.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Interesses")
public class Interesses {

	@Id
	private ObjectId _id;

	private Long id;

	private Long idUsuario;
	private String sigla;
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Interesses [idUsuario=" + idUsuario + ", sigla=" + sigla + ", descricao=" + descricao + "]";
	}

}
