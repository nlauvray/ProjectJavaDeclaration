package banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte("12345A", 1500.00);

        comptes[1] = new CompteTaux("67890B", 2500.00, 2.5);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
