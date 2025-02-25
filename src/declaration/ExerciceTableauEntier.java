package declaration;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Affichez le premier élément du tableau
        System.out.println("Premier élément : " + tableau[0]);

        // Affichez la longueur du tableau
        System.out.println("Longueur du tableau : " + tableau.length);

        // Affichez le dernier élément du tableau
        System.out.println("Dernier élément : " + tableau[tableau.length - 1]);

        // Modifier la valeur de l’élément d’index 4 à 8
        tableau[4] = 8;
        System.out.println("Élément d'index 4 après modification : " + tableau[4]);
    }
}
