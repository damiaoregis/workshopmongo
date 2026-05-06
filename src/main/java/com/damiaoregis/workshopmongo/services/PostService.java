package com.damiaoregis.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damiaoregis.workshopmongo.domain.Post;
import com.damiaoregis.workshopmongo.repositories.PostRepository;
import com.damiaoregis.workshopmongo.services.excepion.ObjectNotFoundException;

@Service
public class PostService {
     
    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
      Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    
    

}