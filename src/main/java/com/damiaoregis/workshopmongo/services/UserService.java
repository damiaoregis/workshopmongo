package com.damiaoregis.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damiaoregis.workshopmongo.domain.User;
import com.damiaoregis.workshopmongo.repositories.UserRepository;
import com.damiaoregis.workshopmongo.services.excepion.ObjectNotFoundException;

@Service
public class UserService {
     
    @Autowired
    private UserRepository repository;
    
    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
      Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
            
}