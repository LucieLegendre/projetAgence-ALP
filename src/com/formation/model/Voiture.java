package com.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Voiture")
public class Voiture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4235180989626069494L;

	private Long id_voiture;
	private String marque;
	private String immatriculation;
	private String categorie;
	private boolean etat;
	private int nb_place;
	private String couleur;
	private boolean disponibilite;
	private int kilometrage;
	private double prix;
	private boolean editable;

	private Reservation reservation;

	// constructeur paramétré
	public Voiture(Long id_voiture, String marque, String immatriculation, String categorie, boolean etat, int nb_place,
			String couleur, boolean disponibilite, int kilometrage, double prix, boolean editable) {
		super();
		this.id_voiture = id_voiture;
		this.marque = marque;
		this.immatriculation = immatriculation;
		this.categorie = categorie;
		this.etat = etat;
		this.nb_place = nb_place;
		this.couleur = couleur;
		this.disponibilite = disponibilite;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.editable = editable;
	}

	// constructeur par défaut
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_voiture")
	public Long getId_voiture() {
		return id_voiture;
	}

	public void setId_voiture(Long id_voiture) {
		this.id_voiture = id_voiture;
	}

	@Column(name = "marque")
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Column(name = "immatriculation")
	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	@Column(name = "categorie")
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Column(name = "etat")
	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Column(name = "nb_place")
	public int getNb_place() {
		return nb_place;
	}

	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}

	@Column(name = "couleur")
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Column(name = "disponibilite")
	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	@Column(name = "kilometrage")
	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	@Column(name = "prix")
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Column(name = "editable")
	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	// getters setters association Reservation
	@OneToOne(mappedBy = "voiture")
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	// toString
	@Override
	public String toString() {
		return "Voiture [id_voiture=" + id_voiture + ", marque=" + marque + ", immatriculation=" + immatriculation
				+ ", categorie=" + categorie + ", etat=" + etat + ", nb_place=" + nb_place + ", couleur=" + couleur
				+ ", disponibilite=" + disponibilite + ", kilometrage=" + kilometrage + ", prix=" + prix + ", editable="
				+ editable + "]";
	}

}
