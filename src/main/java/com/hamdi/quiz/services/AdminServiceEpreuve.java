package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.epreuveRepository;
import com.hamdi.quiz.model.entity.Epreuve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceEpreuve implements AdminServiceEpreuveInterface {
    @Autowired
    private epreuveRepository repEpreuve;

    @Override
    public Epreuve create(Epreuve epreuve) {
        return repEpreuve.save(epreuve);
    }

    @Override
    public void delete(Long id) {

        repEpreuve.deleteById(id);

    }

    @Override
    public List findAll() {
        return repEpreuve.findAll();
    }

    @Override
    public List<Epreuve> findById(Long id) {
        return repEpreuve.findAllById(id);
    }

    @Override
    public Epreuve update(Epreuve epreuve) {
        return repEpreuve.save(epreuve);
    }
}
