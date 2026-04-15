package com.damiaoregis.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.damiaoregis.workshopmongo.domain.User;
import com.damiaoregis.workshopmongo.repositories.UserRepository;

@Configuration
public class Instanciation implements CommandLineRunner {

    @Autowired 
    private UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        userRepository.deleteAll();
        
        userRepository.saveAll(Arrays.asList(
            new User(null, "Maria Brown", "maria@gmail.com"),
            new User(null, "Alex Green", "alex@gmail.com"),
            new User(null, "Bob Grey", "bob@gmail.com")
        ));
    }
    
}
