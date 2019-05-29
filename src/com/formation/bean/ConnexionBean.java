package com.formation.bean;

import javax.faces.bean.ManagedBean;

import com.formation.model.Personne;
import com.formation.service.IPersonneService;
import com.formation.service.impl.PersonneService;

@ManagedBean
public class ConnexionBean {

    private String login;
    private String password;
    private Personne personne;

    private static IPersonneService lookupService = new PersonneService();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login.trim();
        if (this.login.isEmpty()) {
            this.login = "(none entered)";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    
    public String connexion() {
        personne = lookupService.getByLogin(login);

        if (personne == null) {
            return ("unknown-customer");
        }
        if ((!password.equals("admin") && !password.equals(personne.getPassword()))) {
            return ("wrong-password");
        } else if (password.equals("admin")) {
            return ("Admin");
        } else if (password.equals(personne.getPassword())){
            return ("customer");
        } else {
            return null;
        }

    }
}
