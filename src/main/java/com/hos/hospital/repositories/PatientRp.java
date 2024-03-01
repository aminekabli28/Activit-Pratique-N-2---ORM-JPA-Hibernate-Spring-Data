package com.hos.hospital.repositories;

import com.hos.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRp extends JpaRepository<Patient,Long> {
    void  updateById(Long id);
}
