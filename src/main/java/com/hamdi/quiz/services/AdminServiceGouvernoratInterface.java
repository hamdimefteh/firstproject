package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Gouvernorat;

import java.util.List;

public interface AdminServiceGouvernoratInterface {
    Gouvernorat create(Gouvernorat Gouvernorat);




    void delete(Long id);

    List findAll();

    List<Gouvernorat> findById(Long id);

    Gouvernorat update(Gouvernorat Gouvernorat);
}
