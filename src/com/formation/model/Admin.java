package com.formation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Admin extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1692731782052673161L;

	private boolean admin;

	// constructeur paramétré
	public Admin(Long id_personne, String nom, String prenom, String login, String password, String email,
			boolean admin) {
		super(id_personne, nom, prenom, login, password, email, admin);
		this.admin = admin;
	}

	// constructeur par défaut
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	// getters setters
	@Column(name = "admin")
	public boolean isAdmin() {
		return admin;
	}



	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	// toString
	@Override
	public String toString() {
		return "Admin [admin=" + admin + "]";
	}

}
