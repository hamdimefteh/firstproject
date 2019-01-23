package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.specialiteRepository;
import com.hamdi.quiz.model.entity.Specialite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AdminServiceSpecialite implements AdminServiceSpecialiteInterface {

    @Autowired
    private specialiteRepository repspecialite;
    @Override
    public Specialite create(Specialite specialite) {
        return repspecialite.save(specialite);
    }

    @Override
    public void delete(Long id) {
        repspecialite.deleteById(id);
    }

    @Override
    public List findAll() {
        return repspecialite.findAll();
    }

    @Override
    public List<Specialite> findById(Long id) {
        return repspecialite.findAllById(id);
    }

    @Override
    public Specialite update(Specialite specialite) {
        return repspecialite.save(specialite);
    }

    @Override
    public List<Specialite> findByTypespecialite(String spec) {
        return repspecialite.findByTypespecialite(spec);
    }
}
