package com.formation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.model.Client;
import com.formation.model.Personne;

@ManagedBean(name="singleton")
@ApplicationScoped
public class SingletonBean {
	
	private List<Personne> cache;
	 
	@PostConstruct
	public void initCache() {
 
		cache = new ArrayList<Personne>();
	}
 
	public void delete(Personne pers) {
 
		this.cache.remove(pers);
	}
 
	public void put(Long id_personne, String nom, String prenom, String login, String password, String numero_permis,
			Date annee_permis, int telephone)  {
		Client p = new Client();	
		p.setId_personne(id_personne);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setLogin(login);
		p.setPassword(password);
		p.setNumero_permis(numero_permis);
		p.setAnnee_permis(annee_permis);
		p.setTelephone(telephone);
		
 
		this.cache.add(p);
	}
 
	public List<Personne> getCache() {
		return cache;
	}
}

