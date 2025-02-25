package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        // Instances d'AdressePostale
        AdressePostale adresse1 = new AdressePostale(10, "Rue disponible", "37000", "Tours");
        AdressePostale adresse2 = new AdressePostale(25, "Avenue bienvenue", "75001", "Paris");

        // Instances de Personne
        Personne personne1 = new Personne("Dupuy", "Jeanne", adresse1);
        Personne personne2 = new Personne("Dupont", "Jean", adresse2);

        // Affichage
        System.out.println(personne1.nom + " " + personne1.prenom + " habite au " + personne1.adresse.numeroRue + " " + personne1.adresse.libelleRue);
        System.out.println(personne2.nom + " " + personne2.prenom + " habite au " + personne2.adresse.numeroRue + " " + personne2.adresse.libelleRue);
    }
}
