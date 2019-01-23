package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Epreuve;

import java.util.List;

public interface AdminServiceEpreuveInterface {
    Epreuve create(Epreuve epreuve);




    void delete(Long id);

    List findAll();

    List<Epreuve> findById(Long id);

    Epreuve update(Epreuve epreuve);
}
