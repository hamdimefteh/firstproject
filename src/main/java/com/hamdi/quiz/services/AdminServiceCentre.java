package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.centreRepository;
import com.hamdi.quiz.model.entity.Centre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceCentre implements AdminServiceCentreInterface {
    @Autowired
    private centreRepository repCentre;

    @Override
    public Centre create(Centre centre) {
        return repCentre.save(centre);
    }

    @Override
    public void delete(Long id) {

        repCentre.deleteById(id);

    }

    @Override
    public List findAll() {
        return repCentre.findAll();
    }

    @Override
    public List<Centre> findById(Long id) {
        return repCentre.findAllById(id);
    }

    @Override
    public Centre update(Centre centre) {
        return repCentre.save(centre);
    }
}
