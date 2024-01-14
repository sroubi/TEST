package personnePackage;

import java.util.Date;

public class Personne {
	
	private String nom, prenom;
	
	private Date dateDeNaissance;
	
	Personne(String lenom, String prenom, Date dateDeNaissance){
		nom = lenom ;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	protected String getNom() {
		return this.nom ;
	}
	
	protected void setNom(String nom) {
		this.nom = nom ;
	}
	
	protected String getPrenom() {
		return this.prenom ;
	}
	
	protected void setPrenom(String prenom) {
		this.prenom = prenom ;
	}
	
	protected Date getDateDeNaissance() {
		return this.dateDeNaissance ;
	}
	
	protected void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance ;
	}

}
