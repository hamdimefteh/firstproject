package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface centreRepository extends JpaRepository<Centre,Long> {
    List<Centre> findAllById(Long id);
}