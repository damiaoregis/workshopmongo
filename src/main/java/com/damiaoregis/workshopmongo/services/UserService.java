package com.damiaoregis.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damiaoregis.workshopmongo.domain.User;
import com.damiaoregis.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
     
    @Autowired
    private UserRepository Repository;
    
    public List<User> findAll() {
        return Repository.findAll();
    }
            
}