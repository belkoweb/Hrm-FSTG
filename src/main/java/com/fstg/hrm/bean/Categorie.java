package com.fstg.hrm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String lib;
		public Categorie(Long id, String lib) {
			super();
			this.id = id;
			this.lib = lib;
		}

		public Categorie() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLib() {
			return lib;
		}

		public void setLibelle(String lib) {
			this.lib = lib;
		}



}
