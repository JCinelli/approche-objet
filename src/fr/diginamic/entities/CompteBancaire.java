package fr.diginamic.entities;

import entites.Personne;

public class CompteBancaire {

	
	private String numCompte;
	private double solde;
	private Personne proprio;
	
//	CONSTRUCTOR
	public CompteBancaire(String numCompte, double solde, Personne proprio) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.proprio = proprio;
	}

//	METHODS
	@Override
	public String toString() {
		return "Numéro de compte --> " + numCompte + "\rSolde --> " + solde + "\rPropriétaire --> " + proprio;
	}
	
	public void crediterMontant(double montant) {
		solde += montant;
	}
	
	public void debiterMontant(double montant) {
		solde -= montant;
	}

	
//	GETTERS & SETTERS
	/**
	 * @return the numCompte
	 */
	public String getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the proprio
	 */
	public Personne getProprio() {
		return proprio;
	}

	/**
	 * @param proprio the proprio to set
	 */
	public void setProprio(Personne proprio) {
		this.proprio = proprio;
	}
	
	
}
