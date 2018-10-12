package com.diligitis.api.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.diligitis.api.enuns.EnumEstadoCivil;
import com.diligitis.api.enuns.EnumGenero;
import com.diligitis.api.enuns.EnumInteresses;
import com.diligitis.api.enuns.EnumSexualidade;

@Document(collection = "Matches")
public class Matches {

	@Id
	private ObjectId _id;

	private Long id;

	private Long idUsuario;
	private Long idUsuarioCorrespondente;

	private Date data;

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

	public Long getIdUsuarioCorrespondente() {
		return idUsuarioCorrespondente;
	}

	public void setIdUsuarioCorrespondente(Long idUsuarioCorrespondente) {
		this.idUsuarioCorrespondente = idUsuarioCorrespondente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Matches [id=" + id + ", idUsuario=" + idUsuario + ", idUsuarioCorrespondente=" + idUsuarioCorrespondente
				+ ", data=" + data + "]";
	}

}
