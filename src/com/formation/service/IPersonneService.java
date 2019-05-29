package com.formation.service;

import java.util.List;

import com.formation.model.Personne;

public interface IPersonneService {

	public Personne createPersonne(Personne personne);
	public void delete(Personne personne);
	public List<Personne> findPersonnes();
	public Personne getByLogin(String login);
	
}
