package fr.eni.poo.tp.transporteur.application;

import fr.eni.poo.tp.transporteur.bo.Colis;

public class TestLivraison {

	public static void main(String[] args) {

		Colis col1 = new Colis("A001", 128);
		Colis col2 = new Colis("B002", 2200);
		Colis col3 = new Colis("C003", 33003);
	
		System.out.println("Le prix de la livraison du colis A001" + col1.getTarifLivraison());
		System.out.println("Le prix de la livraison du colis B002" + col2.getTarifLivraison());
		System.out.println("Le prix de la livraison du colis C003" + col3.getTarifLivraison());
		
	}

}
