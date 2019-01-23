/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hamdi.quiz.model.dao;

import com.hamdi.quiz.model.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface offreRepository extends JpaRepository<Offre,Long> {
    List<Offre> findAllById(Long id);
    List<Offre> findByConcours(Concours c);
}