package personnePackage;

import java.util.Date;

public class TestPersonne {

	public static void main(String[] args) {
	
		Personne p1 = new Personne("Ahmed", "Alami", new Date());
		
		System.out.println("la personne a pour nom :"
				+p1.getNom()
				+ " et pour prénom : "
				+ p1.getPrenom()
				+ " et sa date de naissance est : "
				+ p1.getDateDeNaissance());
		
		
		
		

	}

}
