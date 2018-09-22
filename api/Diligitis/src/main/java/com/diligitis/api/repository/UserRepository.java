package com.diligitis.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.diligitis.api.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {

	@Query("{ 'nome' : ?0 }")
	List<User> findByNome(String nome);
	
}
