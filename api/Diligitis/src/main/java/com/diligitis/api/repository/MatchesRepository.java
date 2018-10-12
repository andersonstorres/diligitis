package com.diligitis.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.diligitis.api.entity.Matches;
import com.diligitis.api.entity.Usuario;

@Repository
public interface MatchesRepository extends MongoRepository<Matches,Long> {

	@Query("{ 'idUsuario' : ?0 }")
	List<Matches> findByUsuario(Long idUsuario);
	
}
