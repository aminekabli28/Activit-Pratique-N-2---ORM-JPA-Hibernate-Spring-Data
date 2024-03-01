package com.hos.hospital.repositories;

import com.hos.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRp extends JpaRepository<RendezVous,Long> {
}
