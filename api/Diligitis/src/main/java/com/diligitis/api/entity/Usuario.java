package com.diligitis.api.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.diligitis.api.enuns.EnumEstadoCivil;
import com.diligitis.api.enuns.EnumGenero;
import com.diligitis.api.enuns.EnumInteresses;
import com.diligitis.api.enuns.EnumSexualidade;

@Document(collection = "Usuario")
public class Usuario {
	
	@Id
	private ObjectId _id;
	
	private Long id;
	
	private String email;
	private String senha;
	
	private String nome;
	private EnumGenero genero;
	private Date nascimento;
	private String local;
	
	private String sobre;
	private EnumEstadoCivil estadoCivil;
	private EnumSexualidade sexualidade;
	
	private EnumInteresses interesse;
	
	
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + "]";
	}
	
	

}
