package com.hamdi.quiz.controller;

import com.hamdi.quiz.model.entity.*;

import com.hamdi.quiz.model.security.User;
import com.hamdi.quiz.services.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins ="4200",maxAge = 3600)
@RestController

public class Controller {
    @Autowired
    private ServiceCandidature gsc; /* g for general both user and candidature */

    @Autowired
    private AdminServiceConcours a;
    @Autowired
    private AdminServiceSpecialite asp;
    @Autowired
    private AdminServiceGouvernorat asgov;
    @Autowired
    private AdminServiceCentre asc;

    @Autowired
    private AdminServiceUser asu;

    @Autowired
    private AdminServiceEpreuve ase;

    @Autowired
    private AdminServiceOffre asf;

    Candidature ca;
    List<Candidature> listecandidature;

    Concours c1;
    List<Concours> listeconcours;

    Specialite sp;
    List<Specialite> listespecialites;

    Gouvernorat sgov;
    List<Gouvernorat> listegouvernorats;

    Centre sc;
    List<Centre> listecentres;

    Epreuve se;
    List<Epreuve> listeepreuves;

    Offre sf;
    List<Offre> listeoffres;

    User u;
    List<User> liste;
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/addcandidature", method = RequestMethod.POST)
    Candidature enregistrercandidature(@RequestBody Candidature c) {

        logger.info("processing authentication for '{}'", "insertion candidature");
        ca = gsc.create(c);
        if (ca != null) {
            return ca;
        } else {
            logger.info("processing authentication for '{}'", "null insertion candidature");

            return null;
        }

    }

    @RequestMapping(value = "/candidature", method = RequestMethod.GET)
    List<Candidature> listercandidature ()
    {

        logger.info("processing authentication for '{}'", "lister candidature");
        listecandidature = gsc.findAll();
        if(listecandidature!=null) {
            return listecandidature;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null lister candidature");

            return null;}
    }

    @RequestMapping(value = "candidaturebyusername", method = RequestMethod.POST)
    List<Candidature> listercandidaturebyuser (@RequestBody String username)
    {

        logger.info("processing authentication for '{}'", "lister candidature yb user");
        listecandidature = gsc.findByUser(username);
        if(listecandidature!=null) {
            return listecandidature;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null lister candidature by user ");

            return null;}
    }

    @RequestMapping(value = "/offre", method = RequestMethod.GET)
    List<Offre> listertoutlesoffres ()
    {

        logger.info("processing list for '{}'", "lister offre");
        listeoffres = asf.findAll();
        if(listeoffres!=null) {
            return listeoffres;
        }
        else
        {
            logger.info("null value '{}'", "affichage liste des offres");

            return null;}

    }

    @RequestMapping(value = "centre", method = RequestMethod.GET)
    List<Centre> ajoutercentre ()
    {

        logger.info("processing list for '{}'", "lister centre");
        listecentres = asc.findAll();
        if(listecentres!=null) {
            return listecentres;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion centre");

            return null;}

    }

    @RequestMapping(value = "utilisateur", method = RequestMethod.POST)
    User listeru(@RequestBody String username)
    {
     User ut;
        logger.info("processing list for '{}'", "lister utilisateur by username");
        ut = asu.findByUsername(username);
        if(ut!=null) {
            return ut;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null lister utilisateur by username");
            logger.error("null lister utilisateur");

            return null;}

    }


    @RequestMapping(value = "specialite/{spec}", method = RequestMethod.GET)
    List<Specialite> listerspecbytype (
            @PathVariable(name="spec",required=true) String spec
    )
    {

        logger.info("processing authentication for '{}'", "afficher by type specialite");
        listespecialites = asp.findByTypespecialite(spec);
        if(listespecialites!=null) {
            return listespecialites;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null type specialite");

            return null;}

    }

}