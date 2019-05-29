package com.formation.dao.impl;

import java.util.List;
import java.util.Map;

import com.formation.dao.IPersonneDao;
import com.formation.model.Personne;

public class PersonneDao implements IPersonneDao {

	private static List<Personne> personnes;
	private static Long i = 1L;
	private Map<String, Personne> personnes2;

	@Override
	public Personne createPersonne(Personne personne) {
		personne.setId_personne(i++);
		personnes.add(personne);
		return personne;
	}

	@Override
	public List<Personne> findPersonnes() {
		return personnes;
	}

	@Override
	public void delete(Personne personne) {
		personnes.remove(personne);
	}

	@Override
    public Personne getByLogin(String login) {
        if (login != null) {
            return (personnes2.get(login.toLowerCase()));
        } else {
            return null;
        }
    }
}