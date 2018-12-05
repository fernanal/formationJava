package fr.uga.projet1.explambda;

public class Etudiant {
	
	
	private String nom;
	
	private String prenom;
	
	private double moyenne;


	public Etudiant(String nom, String prenom, double moyenne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
	}

	public Etudiant() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "]";
	}
	
	public String getMention() {
		if(moyenne >= 10 && moyenne <= 12) {
			return "passable";
		}
		else if (moyenne >= 12 && moyenne <= 14) {
			return "bien";
		}
		return "tres bien";
	}


	

}
