package com.fstg.hrm.bean;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande {//yoyoyo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double total;
	private String ref;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	@OneToMany(mappedBy = "commande")
	private List<CommandeItem> commandeItems = new ArrayList<CommandeItem>();

	public Commande( double d, String ref, Date dateCommande) {
		super();
		this.total = d;
		this.ref = ref;
		this.dateCommande = dateCommande;
	}

	public Commande(Long id, double total, String ref, Date dateCommande, List<CommandeItem> commandeItems) {
		super();
		this.id = id;
		this.total = total;
		this.ref = ref;
		this.dateCommande = dateCommande;
		this.commandeItems = commandeItems;
	}

	public Commande() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref= ref;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<CommandeItem> getCommandeItems() {
		return commandeItems;
	}

	public void setCommandeItems(List<CommandeItem> commandeItems) {
		this.commandeItems = commandeItems;
	}

}
