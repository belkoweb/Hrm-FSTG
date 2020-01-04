package com.fstg.hrm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CommandeItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Produit produit;
	private double prix;
	private int quantite;
	@ManyToOne
	private Commande commande ;
	

	public CommandeItem(Produit produit, double prix, int quantite) {
		super();
		this.produit = produit;
		this.prix = prix;
		this.quantite = quantite;
	}

	public CommandeItem(Produit produit, double prix, int quantite, Commande commande) {
		super();
		this.produit = produit;
		this.prix = prix;
		this.quantite = quantite;
		this.commande = commande;
	}

	public CommandeItem() {
		super();
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
