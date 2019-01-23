package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.concoursRepository;
import com.hamdi.quiz.model.entity.Concours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceConcours implements AdminServiceConcoursInterface {
@Autowired
private concoursRepository repconcours;

    @Override
    public Concours create(Concours concours) {
        return repconcours.save(concours);
    }

    @Override
    public void delete(Long id) {

             repconcours.deleteById(id);

    }

    @Override
    public List findAll() {
        return repconcours.findAll();
    }

    @Override
    public List<Concours> findById(Long id) {
        return repconcours.findAllById(id);
    }

    @Override
    public Concours update(Concours concours) {
        return repconcours.save(concours);
    }
}
