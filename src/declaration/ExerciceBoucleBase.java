package declaration;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        // Affichez tous les nombres de 1 à 10
        System.out.println("Nombres de 1 à 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Affichez 20 fois votre nom et votre prénom
        System.out.println("Votre nom et prénom 20 fois :");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ". Test Exo");
        }

        // Affichez les éléments pairs de 2 à 100
        System.out.println("\nNombres pairs de 2 à 100 :");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Affichez les éléments impairs de 1 à 99
        System.out.println("Nombres impairs de 1 à 99 :");
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
    }
}
