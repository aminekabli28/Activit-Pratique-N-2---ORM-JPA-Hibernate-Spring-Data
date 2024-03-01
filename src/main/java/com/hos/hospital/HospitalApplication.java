package com.hos.hospital;

import com.hos.hospital.entities.Medecin;
import com.hos.hospital.entities.Patient;
import com.hos.hospital.entities.RendezVous;
import com.hos.hospital.repositories.MedecinRp;
import com.hos.hospital.repositories.PatientRp;
import com.hos.hospital.repositories.RdvRp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalApplication  {


    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
 @Bean
   CommandLineRunner start(PatientRp pRp, MedecinRp mRp, RdvRp rdvRp){

     return args -> {

         Patient patient=new  Patient();
         Medecin medecin=new Medecin();
         RendezVous rendezVous=new RendezVous();


             patient.setNom("amine");
             patient.setDateNaissance(new Date("12/24/2000"));
             pRp.save(patient);

             medecin.setNom("reda");
             medecin.setEmail("reda@gmail.com");
             medecin.setSpecialite("dentiste");
             mRp.save(medecin);

             rendezVous.setDateRDV(new Date());
             rendezVous.setPatient(patient);
             rendezVous.setMedecin(medecin);

             rdvRp.save(rendezVous);

             List<Patient> listPatients =pRp.findAll();
         System.out.println(listPatients);
             pRp.deleteById(1L);




     };
 };
}
