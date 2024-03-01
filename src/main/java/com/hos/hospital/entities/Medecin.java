package com.hos.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Collections;
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    private  String email;
    private  String specialite;
    @OneToMany(mappedBy ="medecin",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous ;
}
