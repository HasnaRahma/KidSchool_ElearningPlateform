package com.model;



import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
@Entity

@Table(name = "ELEVE")
public class Enfant  {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Enf_id")
	private int id;
	@Column
	private String Nom;
	@Column
	private String Prenom;
	@Column
	private int Num;
	@Column
	private int Score;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "niveau_Niv_id")
	private Niveau niveau;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_Par_id")
	private Parent parent;	
	public Enfant(){

	}

	 public Niveau getLang() {
	        return niveau;
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
	public void setPrenom(char prenom){

	}

	
	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getBonus(){
		return 0;
	}

	public int getNiveauScolaire(){
		return 0;
	}

	

	/**
	 * 
	 * @param bn
	 */
	public  void setBonus(int bn){

	}

	/**
	 * 
	 * @param ns
	 */
	public  void setNiveauScolaire(int ns){

	}

	/**
	 * 
	 * @param nom
	 */


}