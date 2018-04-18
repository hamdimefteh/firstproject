package com.hamdi.quiz.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.hamdi.quiz.model.entity.Classe;
@RepositoryRestResource(path="classe")
public interface classeRepository extends JpaRepository<Classe,Long> {
}
