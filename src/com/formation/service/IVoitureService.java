package com.formation.service;

import java.util.List;

import com.formation.model.Voiture;

public interface IVoitureService {
	
	public Voiture createVoiture(Voiture voiture);
	public void delete(Voiture voiture);
	public List<Voiture> findVoitures();

}
