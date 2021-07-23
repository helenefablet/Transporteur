package fr.eni.poo.tp.transporteur.bo;

// MODIFICATION AVEC IMPLEMENTS POUR RELIER LIVRABLE ET COLIS
public class Colis implements Livrable {
	
	private String reference;
	private int poids; // en grammes
	
	public Colis(String pReference, int pPoids) {
		reference = pReference;
		poids = pPoids;
	}

	public String getReference() {
		return reference;
	}

	public int getPoids() {
		return poids;
	}

	
	
	// LA CLASSE COLIS IMPLEMENTE LIVRABLE  
	// TARIF COLIS DEPENDS DE SON POIDS
	@Override
	public float getTarifLivraison() {
		float tarif = 0;

		int poids = getPoids();

		if (poids <= 250) {
			tarif = 4.95f;
			
			
		} else if (poids <= 500) {
			tarif = 6.45f;
			
			
		} else if (poids <= 1000) {
			tarif = 7.99f;
			
			
		} else if (poids <= 2000) {
			tarif = 9.15f;
			
			
		} else if (poids <= 5000) {
			tarif = 14.10f;
			
			
		} else if (poids <= 10000) {
			tarif = 20.50f;
			
			
		} else {
			tarif = poids * 2 / 1000;
		}

		return tarif;
	}
}
