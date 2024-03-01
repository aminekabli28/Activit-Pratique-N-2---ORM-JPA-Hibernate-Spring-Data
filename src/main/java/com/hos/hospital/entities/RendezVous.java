package com.hos.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class RendezVous {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;
    @ManyToOne
    private  Patient patient;
    @ManyToOne
    private Medecin medecin;
}
