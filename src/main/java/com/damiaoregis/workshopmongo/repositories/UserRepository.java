package com.damiaoregis.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.damiaoregis.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
