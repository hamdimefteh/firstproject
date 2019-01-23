package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Concours;

import java.util.List;

public interface AdminServiceConcoursInterface {


    Concours create(Concours concours);




    void delete(Long id);

    List findAll();

    List<Concours> findById(Long id);

    Concours update(Concours concours);
}
