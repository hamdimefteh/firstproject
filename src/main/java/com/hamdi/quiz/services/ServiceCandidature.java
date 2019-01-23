package com.hamdi.quiz.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamdi.quiz.model.dao.candidatureRepository;
import com.hamdi.quiz.model.entity.Candidature;
import java.util.List;
import java.util.Optional;

import com.hamdi.quiz.model.security.User;
import com.hamdi.quiz.security.repository.UserRepository;

@Service
public class ServiceCandidature implements ServiceCandidatureInterface {

    @Autowired
    private candidatureRepository repCandidature;

    @Autowired
    private UserRepository repUser;

    @Override
    public Candidature create(Candidature Candidature) {
        return repCandidature.save(Candidature);
    }

    @Override
    public void delete(Long id) {
        repCandidature.deleteById(id);
    }

    @Override
    public List findAll() {
        return repCandidature.findAll();
    }

    @Override
    public List<Candidature> findById(Long id) {
        return repCandidature.findAllById(id);
    }

    @Override
    public List<Candidature> findByUser(String nom) {
        User u = repUser.findByUsername(nom);
        return repCandidature.findCandidatureByUser(u);
    }

    @Override
    public List<Candidature> findBystate(String etat) {
        return repCandidature.findCandidatureByEtat(etat);
    }

    @Override
    public Candidature update(Candidature Candidature) {
        return repCandidature.save(Candidature);
    }
}
