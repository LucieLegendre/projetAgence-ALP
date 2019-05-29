package com.formation.service.impl;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.formation.dao.IVoitureDao;
import com.formation.model.Voiture;
import com.formation.service.IVoitureService;

@ManagedBean(name = "vService")
@ApplicationScoped
public class VoitureService implements IVoitureService {

    private IVoitureDao ivd;
    private Voiture voiture = new Voiture();


    @Override
    public Voiture createVoiture(Voiture voiture) {
        ivd.createVoiture(voiture);
        return null;
    }

    @Override
    public void delete(Voiture voiture) {
        ivd.delete(voiture);        
    }

    @Override
    public List<Voiture> findVoitures() {
        return ivd.findVoitures();
    }
    
    public String editVoiture(Voiture voiture) {
        voiture.setEditable(true);
        return null;
    }
    
    
    //getters setters
        public IVoitureDao getIvd() {
            return ivd;
        }

        public void setIvd(IVoitureDao ivd) {
            this.ivd = ivd;
        }

        public Voiture getVoiture() {
            return voiture;
        }

        public void setVoiture(Voiture voiture) {
            this.voiture = voiture;
        }
}
