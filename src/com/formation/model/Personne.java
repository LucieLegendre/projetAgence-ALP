package com.formation.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Personne")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1762696620951697525L;
    
    private Long id_personne;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String email;
    private boolean editable;
    
    List<Reservation> reservations = new ArrayList<>();
    
    
    //constructeur paramétré
    public Personne(Long id_personne, String nom, String prenom, String login, String password, String email, boolean editable) {
        super();
        this.id_personne = id_personne;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.email = email;
        this.editable = editable;
    }

    //constructeur par défaut
    public Personne() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    //getters setters
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id")
    public Long getId_personne() {
        return id_personne;
    }

    public void setId_personne(Long id_personne) {
        this.id_personne = id_personne;
    }

    @Column(name="nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name="prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Column(name="login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="editable")
    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    //getters setters association Reservation
    @OneToMany(mappedBy = "personne")
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    //toString
    @Override
    public String toString() {
        return "Personne [id_personne=" + id_personne + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
                + ", password=" + password + ", email=" + email + ", editable=" + editable + "]";
    }
    
    
    
    
    
}