package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface specialiteRepository extends JpaRepository<Specialite,Long> {
    List<Specialite> findAllById(Long id);
    List<Specialite> findByTypespecialite(String spec);

}