package com.hamdi.quiz.services;



import com.hamdi.quiz.model.entity.Candidature;


import java.util.List;

public interface ServiceCandidatureInterface {

    Candidature create(Candidature Candidature);




    void delete(Long id);

    List findAll();

    List<Candidature> findById(Long id);
    List<Candidature> findByUser(String nom);
    List<Candidature> findBystate(String etat);

    Candidature update(Candidature Candidature);
}
