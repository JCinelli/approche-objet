package entites;

public class AdressePostale {

	private int numRue;
	private String libelRue;
	private String codePostal;
	private String ville;
	
//	CONSTRUCTOR
	public AdressePostale(int numRue, String libelRue, String codePostal, String ville) {
		super();
		this.numRue = numRue;
		this.libelRue = libelRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return  numRue + " " + libelRue + " , " + codePostal + " , " + ville;
	}

//	GETTERS and SETTERS
	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getLibelRue() {
		return libelRue;
	}

	public void setLibelRue(String libelRue) {
		this.libelRue = libelRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
