package com.YadouSoft.gestionRH.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomEtablissement;
    private String typeContrat;
    private Date dateEmbauche;
    private Date dateAnciennete;
    private String intitulePoste;
    private String categorie;
    private String direction;
    private String service;
    private double salaireDeBase;
    private String typeRemuneration;

    public Contrat(String nomEtablissement, String typeContrat, Date dateEmbauche, Date dateAnciennete, String intitulePoste, String categorie, String direction, String service, double salaireDeBase, String typeRemuneration) {
        this.nomEtablissement = nomEtablissement;
        this.typeContrat = typeContrat;
        this.dateEmbauche = dateEmbauche;
        this.dateAnciennete = dateAnciennete;
        this.intitulePoste = intitulePoste;
        this.categorie = categorie;
        this.direction = direction;
        this.service = service;
        this.salaireDeBase = salaireDeBase;
        this.typeRemuneration = typeRemuneration;
    }
}
