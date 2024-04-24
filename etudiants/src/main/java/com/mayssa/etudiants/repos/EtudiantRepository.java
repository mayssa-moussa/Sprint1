package com.mayssa.etudiants.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayssa.etudiants.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
