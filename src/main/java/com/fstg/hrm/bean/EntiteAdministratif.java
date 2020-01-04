package com.fstg.hrm.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class EntiteAdministratif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	  private String reference;
	  private String nom;
	  @ManyToOne
	  private Employe chef;
	  @OneToMany
	  private List<Employe> employes;
	  
	  
	public EntiteAdministratif(long id, String reference, String nom, Employe chef) {
		super();
		this.id = id;
		this.reference = reference;
		this.nom = nom;
		this.chef = chef;
	}
	public EntiteAdministratif(Long id, String reference, String nom, Employe chef, List<Employe> employes) {
		super();
		this.id = id;
		this.reference = reference;
		this.nom = nom;
		this.chef = chef;
		this.employes = employes;
	}
	public EntiteAdministratif() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Employe getChef() {
		return chef;
	}
	public void setChef(Employe chef) {
		this.chef = chef;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	  
}
