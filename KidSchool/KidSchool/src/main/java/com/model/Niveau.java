package com.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;


/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
@Entity

@Table(name = "NIVEAU")
public class Niveau implements Serializable{
	/**
	 * 
	 */

	//private Set<Enfant> enfants;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Niv_id")
	private int id;
	@Column
	private char Descirption;
	//Avec Eleve
	@OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "niveau")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
    private Set<Enfant> eleve;
	//Avec Matiere
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "niveau")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Matiere> matiere;
	public Niveau(){

	}

}
