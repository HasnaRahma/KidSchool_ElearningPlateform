package com.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "Parent")
public class Parent  {

	//public Enfant m_Enfant; hadhi telli join vc Enfant

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Par_id")
	private int id;
	@Column
	private char Nom;
	@Column
	private char Prenom;
	@Column
	private int Num;
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "parent")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Enfant> eleve;
	public Parent(){

	}

	
	public char getNom(){
		return 0;
	}

	public char getPrenom(){
		return 0;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(char nom){

	}

	/**
	 * 
	 * @param prenom
	 */
	public  void setPrenom(char prenom){

	}

}