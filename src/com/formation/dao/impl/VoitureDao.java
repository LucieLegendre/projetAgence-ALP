package com.formation.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.formation.dao.IVoitureDao;
import com.formation.model.Voiture;


@ManagedBean(name="voituredao")
@ApplicationScoped
public class VoitureDao implements IVoitureDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 591122381159482511L;
	
	private static List<Voiture> voitures;
	private static Long i=1L;
	
	
	@Override
	public Voiture createVoiture(Voiture voiture) {
		voiture.setId_voiture(i++);
		voitures.add(voiture);
		return voiture;
	}


	@Override
	public void delete(Voiture voiture) {
		voitures.remove(voiture);	
	}


	@Override
	public List<Voiture> findVoitures() {
		return voitures;
	}

	
}
