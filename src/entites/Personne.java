package entites;

public class Personne {
    // Attributs
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
}
