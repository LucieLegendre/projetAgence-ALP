package com.formation.dao;

import java.util.List;

import com.formation.model.Voiture;

public interface IVoitureDao {
	
	public Voiture createVoiture(Voiture voiture);
	public void delete(Voiture voiture);
	public List<Voiture> findVoitures();

}
