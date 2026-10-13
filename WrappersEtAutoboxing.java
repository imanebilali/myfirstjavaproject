import java.util.ArrayList;

public class WrappersEtAutoboxing {
    public static void main(String[] args) {
        // Création d'une ArrayList de Integer
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(12);
        liste.add(-3);
        liste.add(8);
        liste.add(0);

        // Parcours et affichage des éléments
        System.out.println("Éléments de la liste :");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        // Recherche du min et du max manuellement
        int min = liste.get(0);
        int max = liste.get(0);
        for (int i = 0; i < liste.size(); i++) {
            int val = liste.get(i); // unboxing automatique
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Calcul de la moyenne
        double somme = 0;
        for (int i = 0; i < liste.size(); i++) {
            somme += liste.get(i); // Integer → int automatiquement
        }
        double moyenne = somme / liste.size();
        System.out.println("Moyenne: " + moyenne);

        // Autoboxing et unboxing
        Integer objInt = 20;   // autoboxing : int → Integer
        int primInt = objInt;  // unboxing : Integer → int
        System.out.println("objInt (Integer): " + objInt);
        System.out.println("primInt (int): " + primInt);
    }
}

