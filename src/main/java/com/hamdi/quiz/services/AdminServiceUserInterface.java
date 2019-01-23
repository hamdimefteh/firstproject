package com.hamdi.quiz.services;



import com.hamdi.quiz.model.entity.Specialite;
import com.hamdi.quiz.model.security.User;

import java.util.List;

public interface AdminServiceUserInterface {

    User create(User user);




    void delete(Long id);

    List findAll();
    User findByUsername(String username);

    List<User> findById(Long id);

    User update(User user);
}
