package com.model;

import java.util.Set;

import javax.persistence.*;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:13
 */
@Entity

@Table(name = "QUESTION")
public class Question {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Que_id")
	private int id;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "test_Tes_id")
	private Test test;	
	//Avec Reponses
		@OneToMany(cascade = CascadeType.ALL,
		            fetch = FetchType.LAZY,
		            mappedBy = "question")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	    private Set<Reponses> reponses;
	@Column
	private int NumQ;
	@Column
	private char Contenu;
	@Column
	private char Reponse;
	public Question(){

	}
}
