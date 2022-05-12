package org.sid.springmvc;

import java.util.Date;

import org.sid.springmvc.dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sid.springmvc.entities.*;


@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "hassan", new Date(), 2300, true));
        patientRepository.save(new Patient(null, "achraf", new Date(), 2300, false));
        patientRepository.save(new Patient(null, "nabil", new Date(), 2300, false));
        patientRepository.save(new Patient(null, "yassin", new Date(), 2300, false));

        patientRepository.findAll().forEach(p -> {
            System.out.println(p.getNom());
        });

    }

}
