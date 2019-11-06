package com.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:13
 */
@Entity

@Table(name = "TEST")
public class Test {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Tes_id")
	private int id;
	@Column
	private char Matiere;
	@Column
	private int NumT;
	@Column
	private char Titre;
	//Avec Question
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "test")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Question> question;
	//avec Matiere
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "matiere_Mat_id")
	private Matiere matiere;	

	public Test(){

	}

	public void finalize() throws Throwable {

	}

	public char getMatiere(){
		return 0;
	}

	public int getNum(){
		return 0;
	}

	public char getTitre(){
		return 0;
	}

	/**
	 * 
	 * @param matiere
	 */
	public  void setMatiere(char matiere){

	}

	/**
	 * 
	 * @param num
	 */
	public  void setNum(int num){

	}

	/**
	 * 
	 * @param titre
	 */
	public  void setTitre(char titre){

	}

}