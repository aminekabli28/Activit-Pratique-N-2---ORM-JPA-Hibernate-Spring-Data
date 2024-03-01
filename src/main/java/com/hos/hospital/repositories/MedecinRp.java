package com.hos.hospital.repositories;

import com.hos.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRp extends JpaRepository<Medecin,Long> {
}
