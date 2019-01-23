package com.hamdi.quiz.services;

import com.hamdi.quiz.model.dao.concoursRepository;
import com.hamdi.quiz.model.dao.offreRepository;
import com.hamdi.quiz.model.entity.Concours;
import com.hamdi.quiz.model.entity.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class AdminServiceOffre implements AdminServiceOffreInterface {

    @Autowired
    private offreRepository repOffre;
    @Autowired
    private concoursRepository crepository;
    @Override
    public Offre create(Offre offre) {
        return repOffre.save( offre);
    }

    @Override
    public void delete(Long id) {
        repOffre.deleteById(id);
    }

    @Override
    public List<Offre> findAll() {
        return repOffre.findAll();
    }

    @Override
    public List<Offre> findById(Long id) {
        return repOffre.findAllById(id);
    }

    @Override
    public Offre update(Offre Offre) {
        return repOffre.save(Offre);
    }


    @Override
    public List<Offre> findByConcours() {
        int an = LocalDate.now().getYear();
        String ann = String.valueOf(an);
       Concours  c = crepository.findAllByAnnee(ann).get(crepository.findAllByAnnee(ann).size()-1);
        return repOffre.findByConcours((Concours) c);
    }


}
