package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Pays {

	private String nom;
	private long nbHabitant;
	private double pibParHabitant;
	
//	CONSTRUCTOR
	public Pays(String nom, long nbHabitant, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}

//	METHODS
	@Override
	public String toString() {
		return "Pays :"
				+ "\r Nom : " + nom 
				+ "\r Nombre d'habitants : " + nbHabitant 
				+ "\r PIB parhabitant : " + pibParHabitant;
	}
	
	@Override
	public boolean equals(Object object) {
		
//		Si l'objet en param n'est pas une instance de pays
		if (!(object instanceof Pays)) {
//			Pas d'égalité possible donc false
			return false;
			
		}
		
//		Cast de l'objet en parm en un objet pays
		Pays paysDeTestEgalite = (Pays)object;
		
//		Retourne le resultat de la vérification de chaque attributs des deux objet Pays
		return new EqualsBuilder().append(nom, paysDeTestEgalite.getNom())
								  .append(nbHabitant, paysDeTestEgalite.getNbHabitant())
								  .append(pibParHabitant, paysDeTestEgalite.getPibParHabitant())
								  .isEquals();
		
	}

//	GETTERS & SETTERS	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public long getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return the pibParHabitant
	 */
	public double getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	
}
