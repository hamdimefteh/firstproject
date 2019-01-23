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

public class adminController {
    @Autowired
    private ServiceCandidature gsc;
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
    
    Concours c1 ;
    List<Concours> listeconcours;

    Specialite sp ;
    List<Specialite> listespecialites;

    Gouvernorat sgov ;
    List<Gouvernorat> listegouvernorats;

    Centre sc ;
    List<Centre> listecentres;

    Epreuve se ;
    List<Epreuve> listeepreuves;

    Offre sf ;
    List<Offre> listeoffres;

    User u;
    List<User> listeutilisateurs;
    Candidature ca;
    List<Candidature> listecandidature;
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/admin/addconcours", method = RequestMethod.POST)
     Concours enregistrerconcours (@RequestBody Concours c)
    {

        logger.info("processing authentication for '{}'", "insertion concours");
         c1 = a.create(c);
         if(c1!=null) {
             return c1;
         }
         else
         {
             logger.info("processing authentication for '{}'", "null insertion concours");

             return null;}

    }

    @RequestMapping(value = "/admin/concours", method = RequestMethod.GET)
    List<Concours> listerconcours ()
    {

        logger.info("processing authentication for '{}'", "insertion concours");
        listeconcours = a.findAll();
        if(listeconcours!=null) {
            return listeconcours;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion concours");

            return null;}

    }

    @RequestMapping(value = "/admin/specialite", method = RequestMethod.GET)
    List<Specialite> ajouterspecialite ()
    {

        logger.info("processing authentication for '{}'", "insertion specialite");
        listespecialites = asp.findAll();
        if(listespecialites!=null) {
            return listespecialites;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion specialite");

            return null;}

    }

    @RequestMapping(value = "/admin/addspecialite", method = RequestMethod.POST)
    Specialite enregistrerspecialite (@RequestBody Specialite s)
    {

        logger.info("processing authentication for '{}'", "insertion specialite");
        sp= asp.create(s);
        if(sp!=null) {
            return sp;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion specialite");

            return null;}

    }

    @RequestMapping(value = "/admin/gouvernorat", method = RequestMethod.GET)
    List<Gouvernorat> ajoutergouvernorat ()
    {

        logger.info("processing authentication for '{}'", "insertion gouvernorat");
        listegouvernorats = asgov.findAll();
        if(listegouvernorats!=null) {
            return listegouvernorats;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion gouvernorat");

            return null;}

    }

    @RequestMapping(value = "/admin/gouvernorat/{id}", method = RequestMethod.GET)
    List<Gouvernorat> cherchergouvernorat (@PathVariable Long id)
    {

        logger.info("processing authentication for '{}'", "rech gov");
        listegouvernorats = asgov.findById(id);
        if(listegouvernorats!=null) {
            return listegouvernorats;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion gouvernorat");

            return null;}

    }

    @RequestMapping(value = "/admin/concours/{id}", method = RequestMethod.GET)
    List<Concours> chercherconcours (@PathVariable Long id1)
    {

        logger.info("processing recherche for '{}'", "rech concours");
        listeconcours = a.findById(id1);
        if(listeconcours!=null) {
            return listeconcours;
        }
        else
        {
            logger.info("processing  for '{}'", "null recherche concours");

            return null;}

    }

    @RequestMapping(value = "/admin/addgouvernorat", method = RequestMethod.POST)
    Gouvernorat enregistrergouvernorat (@RequestBody Gouvernorat g)
    {

        logger.info("processing authentication for '{}'", "insertion gouvernorat");
        sgov= asgov.create(g);
        if(sgov!=null) {
            return sgov;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion gouvernorat");

            return null;}

    }

    @RequestMapping(value = "/admin/centre", method = RequestMethod.GET)
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

    @RequestMapping(value = "/admin/centre/{id}", method = RequestMethod.GET)
    List<Centre> cherchercentrebyid (@PathVariable Long id1)
    {

        logger.info("processing list for '{}'", "lister centre by id");
        listecentres = asc.findById(id1);
        if(listecentres!=null) {
            return listecentres;
        }
        else
        {
            logger.info("processing chercher centre by id for '{}'", "not found");

            return null;}

    }

    @RequestMapping(value = "/admin/addcentre", method = RequestMethod.POST)
    Centre enregistrercentre (@RequestBody Centre c)
    {

        logger.info("processing authentication for '{}'", "insertion centre");
        sc = asc.create(c);
        if(sc!=null) {
            return sc;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion centre");

            return null;}

    }

    @RequestMapping(value = "/admin/utilisateur", method = RequestMethod.GET)
    List<User> listerutilisateur()
    {

        logger.info("processing list for '{}'", "lister utilisateur");
        listeutilisateurs = asu.findAll();
        if(listeutilisateurs!=null) {
            return listeutilisateurs;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null lister utilisateur");
            logger.error("null lister utilisateur");

                         return null;}

    }

    @RequestMapping(value = "/admin/epreuve", method = RequestMethod.GET)
    List<Epreuve> ajouterepreuve ()
    {

        logger.info("processing list for '{}'", "lister epreuve");
        listeepreuves = ase.findAll();
        if(listeepreuves!=null) {
            return listeepreuves;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion centre");

            return null;}

    }

    @RequestMapping(value = "/admin/addepreuve", method = RequestMethod.POST)
    Epreuve enregistrerepreuve (@RequestBody Epreuve e)
    {

        logger.info("processing authentication for '{}'", "insertion epreuve");
        se = ase.create(e);
        if(se!=null) {
            return se;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null insertion epreuve");

            return null;}

    }

    @RequestMapping(value = "/admin/addoffre", method = RequestMethod.POST)
    Offre enregistreoffre (@RequestBody Offre o)
    {

        logger.info("processing insertion nouvel offre for '{}'", "insertion offre");

        sf = asf.create(o);

        if(sf!=null) {
            logger.info("insertion réussie d'un nouvel offre");
            return sf;
        }
        else
        {
            logger.info("null add offre'{}'", "null insertion offre");

            return null;}

    }

    @RequestMapping(value = "/admin/offre", method = RequestMethod.GET)
    List<Offre> listertoutlesspec ()
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
    @RequestMapping(value = "/admin/specialite/{spec}", method = RequestMethod.GET)
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
    @RequestMapping(value = "/admin/specialites/{spec}", method = RequestMethod.GET)
    List<Specialite> listerspecbytype (
            @PathVariable(name="spec",required=true) Long spec
    )
    {

        logger.info("processing authentication for '{}'", "afficher by id specialite");
        listespecialites = asp.findById(spec);
        if(listespecialites!=null) {
            return listespecialites;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null type specialite");

            return null;}

    }

    @RequestMapping(value = "/admin/specialites/", method = RequestMethod.POST)
    List<Specialite> listerspecbytype (@RequestBody long[] tabspec )
    {

        logger.info("processing authentication for '{}'", "retourner spec by id specialite");
        listespecialites.clear();
        for(int i =0 ; i<tabspec.length;i++)
        {
        listespecialites.add(asp.findById(tabspec[i]).get(0));
        }
        if(listespecialites!=null) {
            return listespecialites;

        }
        else
        {
            logger.info("processing authentication for '{}'", "null id specialite");

            return null;}

    }

    @RequestMapping(value = "admin/candidaturebystate/", method = RequestMethod.POST)
    List<Candidature> listercandidaturebystate (@RequestBody String etat)
    {

        logger.info("processing authentication for '{}'", "lister candidature by state");
        listecandidature = gsc.findBystate(etat);
        if(listecandidature!=null) {
            return listecandidature;
        }
        else
        {
            logger.info("processing authentication for '{}'", "null lister candidature by state ");

            return null;}
    }


    @RequestMapping(value = "admin/updatecandidature" , method = RequestMethod.POST)
    int updatecandidature ( @RequestBody Candidature candidature1)
    {

        logger.info("processing authentication for '{}'", "lister candidature by state");
        Candidature candidature = gsc.update(candidature1);
        if(candidature!=null) {
            logger.info("success update");
            return 1;
        }
        else
        {
            logger.info("processing  for '{}'", "null update candidature by id state refuse or confirme ");
         return 0;
            }
    }



}
