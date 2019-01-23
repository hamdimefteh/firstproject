package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.gouvernoratRepository;
import com.hamdi.quiz.model.entity.Gouvernorat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceGouvernorat implements AdminServiceGouvernoratInterface {
    @Autowired
    private gouvernoratRepository repGouvernorat;

    @Override
    public Gouvernorat create(Gouvernorat gouvernorat) {
        return repGouvernorat.save(gouvernorat);
    }

    @Override
    public void delete(Long id) {

        repGouvernorat.deleteById(id);

    }

    @Override
    public List findAll() {
        return repGouvernorat.findAll();
    }

    @Override
    public List<Gouvernorat> findById(Long id) {
        return repGouvernorat.findAllById(id);
    }

    @Override
    public Gouvernorat update(Gouvernorat gouvernorat) {
        return repGouvernorat.save(gouvernorat);
    }
}
