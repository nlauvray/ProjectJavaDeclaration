package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        // Instances
        AdressePostale adresse1 = new AdressePostale(10, "Rue du voilà", "44200", "Nantes");
        AdressePostale adresse2 = new AdressePostale(25, "Avenue de ici", "75000", "Paris");

        // Affichage
        System.out.println("Adresse 1 : " + adresse1.numeroRue + " " + adresse1.libelleRue + ", " + adresse1.codePostal + " " + adresse1.ville);
        System.out.println("Adresse 2 : " + adresse2.numeroRue + " " + adresse2.libelleRue + ", " + adresse2.codePostal + " " + adresse2.ville);
    }
}
