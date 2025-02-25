package declaration;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher tous les éléments du tableau
        System.out.println("Tous les éléments du tableau :");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Afficher les éléments en ordre inverse
        System.out.println("Éléments en ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        // Afficher les entiers supérieurs à 3
        System.out.println("Entiers supérieurs à 3 :");
        for (int num : array) {
            if (num > 3) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        // Afficher les entiers pairs
        System.out.println("Entiers pairs :");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        // Afficher les valeurs des index pairs
        System.out.println("Valeurs des index pairs :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        // Afficher les entiers impairs
        System.out.println("Entiers impairs :");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
