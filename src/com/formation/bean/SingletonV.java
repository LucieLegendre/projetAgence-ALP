package com.formation.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import com.formation.model.Voiture;

@ManagedBean(name="singletonV")
@ApplicationScoped
public class SingletonV {
    
    private List<Voiture> cache2;
     
    @PostConstruct
    public void initCache() {
 
        cache2 = new ArrayList<Voiture>();
    }
 
    public void delete(Voiture voit) {
 
        this.cache2.remove(voit);
    }
 
    public void put(String marque, String immatriculation, String categorie, int nb_place, String couleur, int kilometrage, double prix, boolean etat, boolean disponibilite, boolean editable) {
        Voiture v = new Voiture();      
        v.setMarque(marque);
        v.setImmatriculation(immatriculation);
        v.setCategorie(categorie);
        v.isEtat();
        v.setNb_place(nb_place);
        v.setCouleur(couleur);
        v.isDisponibilite();
        v.setKilometrage(kilometrage);
        v.setPrix(prix);
        v.isEditable();
        
 
        this.cache2.add(v);
    }
 
    public List<Voiture> getCache2() {
        return cache2;
    }
    
    
    
    
    
    
    
}
