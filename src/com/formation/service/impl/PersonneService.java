package com.formation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.dao.IPersonneDao;
import com.formation.model.Personne;
import com.formation.service.IPersonneService;

@ManagedBean(name = "pService")
@ApplicationScoped
public class PersonneService implements IPersonneService {
    
    private IPersonneDao ipd;
    private Personne personne = new Personne();
    private Map<String, Personne> personnes;
    private static Long i=1L;
    
    
    public PersonneService() {
        personnes = new HashMap<String, Personne>();
        addPersonne(new Personne(i++, "lecorff", "alexis", "alecorff", "123", "alecorff@outlook.fr", true));
        addPersonne(new Personne(i++, "admin", "admin", "admin", "admin", "admin@admin.fr", true));
    }
    
   
    @Override
    public Personne createPersonne(Personne personne) {
        ipd.createPersonne(personne);
        return null;
    }

    @Override
    public void delete(Personne personne) {
        ipd.delete(personne);
    }

    @Override
    public List<Personne> findPersonnes() {
        return ipd.findPersonnes();
    }
    
    public String editPersonne(Personne personne) {
        personne.setEditable(true);
        return null;
    }
    
    @Override
    public Personne getByLogin(String login) {
//        ipd.getByLogin(login);
        if (login != null) {
            return (personnes.get(login.toLowerCase()));
        } else {
            return null;
        }
    }

    private void addPersonne(Personne personne) {
        personnes.put(personne.getLogin(), personne);
    }
    
    
    //getters setters
        public IPersonneDao getIpd() {
            return ipd;
        }

        public void setIpd(IPersonneDao ipd) {
            this.ipd = ipd;
        }

        public Personne getPersonne() {
            return personne;
        }

        public void setPersonne(Personne personne) {
            this.personne = personne;
        }

        
    
}