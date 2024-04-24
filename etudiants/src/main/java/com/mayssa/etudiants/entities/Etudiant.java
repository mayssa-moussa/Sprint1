package com.mayssa.etudiants.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idEtudiant;
	private String nom;
	private String prenom;
	private Date dateNaiss;
	private String adresse;
	private String email;
	private int anneeEtudes;
	private String dep;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(String nom, String prenom, Date dateNaiss, String adresse, String email, int anneeEtudes,
			String dep) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.adresse = adresse;
		this.email = email;
		this.anneeEtudes = anneeEtudes;
		this.dep = dep;
	}

	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAnneeEtudes() {
		return anneeEtudes;
	}
	public void setAnneeEtudes(int anneeEtudes) {
		this.anneeEtudes = anneeEtudes;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
				+ ", adresse=" + adresse + ", email=" + email + ", anneeEtudes=" + anneeEtudes + ", dep=" + dep + "]";
	}
	
}
