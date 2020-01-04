package com.fstg.hrm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		   private String nom;
		   private String prenom;
		   private String cne;
		   @ManyToOne
		   private EntiteAdministratif entiteAdministratif ;
		public Employe(String nom, String prenom, String cne, EntiteAdministratif entiteAdministratif) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.cne = cne;
			this.entiteAdministratif = entiteAdministratif;
		}
		public Employe() {
			super();
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
		public String getCne() {
			return cne;
		}
		public void setCne(String cne) {
			this.cne = cne;
		}
		public EntiteAdministratif getEntiteAdministratif() {
			return entiteAdministratif;
		}
		public void setEntiteAdministratif(EntiteAdministratif entiteAdministratif) {
			this.entiteAdministratif = entiteAdministratif;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
}
