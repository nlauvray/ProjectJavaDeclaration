package utils;

public class ConversionNombre {
    public static void main(String[] args) {
        // Déclare une chaîne de caractères contenant un nombre entier
        String nombreTexte = "42";
        
        // Convertit la chaîne en nombre entier (méthode parseInt de Integer)
        int nombre = Integer.parseInt(nombreTexte);
        System.out.println("Nombre converti : " + nombre);

        // Déclare deux variables de type int
        int a = 15;
        int b = 25;

        // Calcule le nombre maximum entre a et b (méthode max de Integer)
        int max = Integer.max(a, b);
        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
    }
}
