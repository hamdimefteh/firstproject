package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Centre;

import java.util.List;

public interface AdminServiceCentreInterface {
    Centre create(Centre centre);




    void delete(Long id);

    List findAll();

    List<Centre> findById(Long id);

    Centre update(Centre centre);
}
