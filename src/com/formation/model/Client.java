package com.formation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Client extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6483057433868137533L;

	private String numero_permis;
	private int telephone;
	private Date annee_permis;
	private boolean utilisateur;
	private boolean editable;

	// constructeur paramétré
	public Client(Long id_personne, String nom, String prenom, String login, String password, String email,
			boolean editable, String numero_permis, int telephone, Date annee_permis, boolean utilisateur,
			boolean editable2) {
		super(id_personne, nom, prenom, login, password, email, editable);
		this.numero_permis = numero_permis;
		this.telephone = telephone;
		this.annee_permis = annee_permis;
		this.utilisateur = utilisateur;
		editable = editable;
	}

	// constructeur par défaut
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id_personne, String nom, String prenom, String login, String password, String email,
			boolean editable) {
		super(id_personne, nom, prenom, login, password, email, editable);
		// TODO Auto-generated constructor stub
	}

	// getters setters
	@Column(name = "numero_permis")
	public String getNumero_permis() {
		return numero_permis;
	}



	public void setNumero_permis(String numero_permis) {
		this.numero_permis = numero_permis;
	}

	@Column(name = "telephone")
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	@Column(name = "annee_permis")
	public Date getAnnee_permis() {
		return annee_permis;
	}

	public void setAnnee_permis(Date annee_permis) {
		this.annee_permis = annee_permis;
	}

	@Column(name = "utilisateur")
	public boolean isUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(boolean utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	@Column(name = "editable")
	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	// toString
	@Override
	public String toString() {
		return "Client [numero_permis=" + numero_permis + ", telephone=" + telephone + ", annee_permis=" + annee_permis
				+ ", utilisateur=" + utilisateur + ", editable=" + editable + "]";
	}

}
