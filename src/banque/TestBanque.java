package banque;

import banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 1500.75);

        System.out.println(compte);

        System.out.println("Numéro de compte : " + compte.getNumeroCompte());
        System.out.println("Solde : " + compte.getSolde() + " €");
    }
}
