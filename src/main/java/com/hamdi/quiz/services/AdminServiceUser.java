package com.hamdi.quiz.services;


import com.hamdi.quiz.model.security.User;
import com.hamdi.quiz.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceUser implements AdminServiceUserInterface {

    @Autowired
    private UserRepository repUser;

    @Override
    public User create(User User) {
        return repUser.save(User);
    }

    @Override
    public void delete(Long id) {
        repUser.deleteById(id);
    }

    @Override
    public List findAll() {
        return repUser.findAll();
    }

    @Override
    public List<User> findById(Long id) {
        return repUser.findAllById(id);
    }

    @Override
    public User update(User User) {
        return repUser.save(User);
    }

    @Override
    public User findByUsername(String username) {
        return repUser.findByUsername(username);
    }
}
