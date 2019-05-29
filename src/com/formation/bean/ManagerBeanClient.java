package com.formation.bean;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.formation.model.Client;
import com.formation.model.Personne;
import com.formation.service.impl.PersonneService;

import javafx.scene.control.TableColumn.CellEditEvent;

@ManagedBean(name = "managerClient")
public class ManagerBeanClient {

	// Gestion Client
	@ManagedProperty(value = "#{pService}")
	private PersonneService personneService;

	public PersonneService getPersonneService() {
		return personneService;
	}

	public void setPersonneService(PersonneService personneService) {
		this.personneService = personneService;
	}

	private Personne personne = new Personne();

	@ManagedProperty(value = "#{singleton}")
	SingletonBean singleton;

	public void setSingleton(SingletonBean singleton) {
		this.singleton = singleton;
	}

	private Personne selectedPers;
	private Long id_personne;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String numero_permis;
	private Date annee_permis;
	private int telephone;

	public void save() {
		singleton.put(id_personne, nom, prenom, login, password, numero_permis, annee_permis, telephone);
	}

	public String delete() {
		personneService.delete(selectedPers);
		return null;
	}

	public void editPersonne(RowEditEvent event) {

personneService.editPersonne((Personne)event.getObject());
	}
	
 

 

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCellEdit(CellEditEvent event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();

		if (newValue != null && !newValue.equals(oldValue)) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed",
					"Old: " + oldValue + ", New:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public List<Personne> getCacheList() {
		return singleton.getCache();
	}

	public Personne getSelectedPers() {
		return selectedPers;
	}

	public void setSelectedPers(Personne selectedPers) {
		this.selectedPers = selectedPers;
	}

	public Long getId_personne() {
		return id_personne;
	}

	public void setId_personne(Long id_personne) {
		this.id_personne = id_personne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumero_permis() {
		return numero_permis;
	}

	public void setNumero_permis(String numero_permis) {
		this.numero_permis = numero_permis;
	}

	public Date getAnnee_permis() {
		return annee_permis;
	}

	public void setAnnee_permis(Date annee_permis) {
		this.annee_permis = annee_permis;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
}
