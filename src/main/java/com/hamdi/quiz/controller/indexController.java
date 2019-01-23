package com.hamdi.quiz.controller;
import org.slf4j.LoggerFactory;
import com.hamdi.quiz.security.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.hamdi.quiz.model.security.*;

@CrossOrigin(origins ="*",maxAge = 3600)
@RestController
public class indexController {
    @Bean
    public PasswordEncoder passwordEncoderBean() {
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private UserRepository  userrepository;

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/inscription/inscrire", method = RequestMethod.POST)
    User enregistrer(@RequestBody User user)
        {

        String crypt = passwordEncoderBean().encode(user.getPassword());
            user.setPassword(crypt);
            List<Authority> l = new ArrayList<Authority>();
            Authority a = new Authority();
            a.setId(1L);
            l.add(a);
            user.setAuthorities(l);
            logger.info(user.toString());
        logger.info("processing authentication for '{}'", "insertion utilisateur");
        return userrepository.save(user);

        }
    }

