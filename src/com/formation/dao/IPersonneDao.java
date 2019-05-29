package com.formation.dao;

import java.util.List;

import com.formation.model.Personne;


public interface IPersonneDao {
	
	public Personne createPersonne(Personne personne);
	public void delete(Personne personne);
	public List<Personne> findPersonnes();
	public Personne getByLogin(String login);
}
