package com.fstg.hrm.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class ExpressionBesoinItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Produit produit;
	private int quantite;
	@ManyToOne
	private ExpressionBesoin expressionBesoin;

	public ExpressionBesoinItem(Produit produit, int quantite, ExpressionBesoin expressionBesoin) {
		super();
		this.produit = produit;
		this.quantite = quantite;
		this.expressionBesoin = expressionBesoin;
	}

	public ExpressionBesoinItem(Produit produit, int quantite) {
		super();
		this.produit = produit;
		this.quantite = quantite;
	}

	public ExpressionBesoinItem() {
		super();
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public ExpressionBesoin getExpressionBesoin() {
		return expressionBesoin;
	}

	public void setExpressionBesoin(ExpressionBesoin expressionBesoin) {
		this.expressionBesoin = expressionBesoin;
	}
}
