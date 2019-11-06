package com.controller;
import com.model.*;
/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
public class CompteController {

	public CompteController(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param mdp
	 * @param Type
	 */
	public Utilisateur AjouterCompte(char nom, char prenom, char email, char mdp, Utilisateur Type){
		return null;
	}

	/**
	 * 
	 * @param enfant
	 * @param enseignant
	 */
	/*public boolean AjouterEleveListe(Enfant enfant, Enseignat enseignant){
		return false;
	}

	/**
	 * 
	 * @param enfant
	 * @param parent
	 */
	public boolean AjouterEnfantListe(Enfant enfant, Parent parent){
		return false;
	}

	/**
	 * 
	 * @param numU
	 */
	public Utilisateur ModifierProfile(int numU){
		return null;
	}

	/**
	 * 
	 * @param numU
	 */
	public boolean SupprimerCompte(int numU){
		return false;
	}

	/**
	 * 
	 * @param enfant
	 * @param enseignant
	 */
	/*public boolean SupprimerEleveListe(Enfant enfant, Enseignat enseignant){
		return false;
	}

	/**
	 * 
	 * @param enfant
	 * @param parent
	 */
	public boolean SupprimerEnfantListe(Enfant enfant, Parent parent){
		return false;
	}

}