package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Specialite;

import java.util.List;

public interface AdminServiceSpecialiteInterface {

    Specialite create(Specialite Specialite);




    void delete(Long id);

    List findAll();
    List<Specialite> findByTypespecialite(String spec);

    List<Specialite> findById(Long id);

    Specialite update(Specialite Specialite);
}
