package com.formation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5694441911715925741L;

	private Long id_reservation;
	private Date date_debut;
	private Date date_fin;
	
	private Personne personne;
	private Voiture voiture;
	
	
	//constructeur paramétré
	public Reservation(Long id_reservation, Date date_debut, Date date_fin) {
		super();
		this.id_reservation = id_reservation;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}


	//constructeur par défaut
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	//getters setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_reservation")
	public Long getId_reservation() {
		return id_reservation;
	}


	public void setId_reservation(Long id_reservation) {
		this.id_reservation = id_reservation;
	}


	@Column(name = "date_debut")
	public Date getDate_debut() {
		return date_debut;
	}


	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}


	@Column(name = "date_fin")
	public Date getDate_fin() {
		return date_fin;
	}


	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	//getters setters association Personne
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_personne")
	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	//getters setters association Voiture
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_voiture")
	public Voiture getVoiture() {
		return voiture;
	}


	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}


	//toString
	@Override
	public String toString() {
		return "Reservation [id_reservation=" + id_reservation + ", date_debut=" + date_debut + ", date_fin=" + date_fin
				+ "]";
	}
	
	
	
	
	
}
