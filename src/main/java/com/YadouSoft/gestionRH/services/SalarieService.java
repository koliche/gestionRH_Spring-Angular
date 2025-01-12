package com.YadouSoft.gestionRH.services;

import com.YadouSoft.gestionRH.models.Contrat;
import com.YadouSoft.gestionRH.models.Salarie;
import com.YadouSoft.gestionRH.repositories.ContratRepository;
import com.YadouSoft.gestionRH.repositories.SalarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalarieService {
    @Autowired
    SalarieRepository salarieRepository;
    public Salarie getSalarieById(long id){

        return salarieRepository.findById(id).get();
    }
    public Salarie getSalarieByCINE(String cine){

        return salarieRepository.getSalarieByCINE(cine);
    }
    public List<Salarie> getAllSalaries(){

        return salarieRepository.findAll();
    }
}
