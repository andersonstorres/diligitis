package com.diligitis.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.diligitis.api.entity.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario,Long> {

	@Query("{ 'nome' : ?0 }")
	List<Usuario> findByNome(String nome);
	
}
