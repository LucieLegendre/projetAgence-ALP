package com.formation.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="radioView")
public class RadioView {
    private String categorie;
    private String couleur;
    private String nombrePlace;
    
    
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String getNombrePlace() {
        return nombrePlace;
    }
    public void setNombrePlace(String nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
    
    private boolean value1;  
    private boolean value2;
 
    public boolean isValue1() {
        return value1;
    }
 
    public void setValue1(boolean value1) {
        this.value1 = value1;
    }
 
    public boolean isValue2() {
        return value2;
    }
 
    public void setValue2(boolean value2) {
        this.value2 = value2;
    }
    
}