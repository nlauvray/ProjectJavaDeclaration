package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue disponible", "37000", "Tours");

        Personne personne1 = new Personne("Dupuy", "Jeanne");

        personne1.setAdresse(adresse1);

        personne1.afficherIdentite();

        System.out.println("Nom : " + personne1.getNom());
        System.out.println("Prénom : " + personne1.getPrenom());
        System.out.println("Adresse : " + personne1.getAdresse());
    }
}
