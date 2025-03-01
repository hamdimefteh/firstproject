/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hamdi.quiz.services;

import com.hamdi.quiz.model.entity.Offre;
import com.hamdi.quiz.model.entity.Concours;

import java.util.List;

public interface AdminServiceOffreInterface {
    Offre create(Offre offre);




    void delete(Long id);

    List<Offre> findAll();

    List<Offre> findById(Long id);
    List<Offre> findByConcours();
    Offre update(Offre offre);
}
