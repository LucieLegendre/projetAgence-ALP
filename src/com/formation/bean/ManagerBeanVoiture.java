package com.formation.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.formation.model.Personne;
import com.formation.model.Voiture;
import com.formation.service.impl.VoitureService;

import javafx.scene.control.TableColumn.CellEditEvent;

@ManagedBean(name = "managerVoiture")
public class ManagerBeanVoiture {

	// Gestion voiture
	@ManagedProperty(value = "#{vService}")
	private VoitureService voitureService;

	public VoitureService getVoitureService() {
		return voitureService;
	}

	public void setVoitureService(VoitureService voitureService) {
		this.voitureService = voitureService;
	}
	
	private Voiture voiture = new Voiture();

	@ManagedProperty(value = "#{singletonV}")
	SingletonV singletonV;

	/**
	 * @return the singletonV
	 */
	public SingletonV getSingletonV() {
		return singletonV;
	}

	/**
	 * @param singletonV the singletonV to set
	 */
	public void setSingletonV(SingletonV singletonV) {
		this.singletonV = singletonV;
	}

 

	private Voiture selectedVoiture;
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

	public void save() {
		singletonV.put(marque, immatriculation, categorie, nb_place, couleur, kilometrage, prix, etat, disponibilite,
				editable);
	}

	public String delete(Voiture voiture) {
		voitureService.delete(voiture);
		return null;
	}

	public String editVoiture(Voiture voiture) {
		voiture.setEditable(true);
		return null;
	}

	public void editVoiture(RowEditEvent event) {

		voitureService.editVoiture((Voiture)event.getObject());
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
	public List<Voiture> getCacheList2() {
		return singletonV.getCache2();
	}

	public Voiture getSelectedVoiture() {
		return selectedVoiture;
	}

	public void setSelectedVoiture(Voiture selectedVoiture) {
		this.selectedVoiture = selectedVoiture;
	}

	public Long getId_voiture() {
		return id_voiture;
	}

	public void setId_voiture(Long id_voiture) {
		this.id_voiture = id_voiture;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getNb_place() {
		return nb_place;
	}

	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

}
