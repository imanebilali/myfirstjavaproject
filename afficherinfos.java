import java.util.Scanner;
public class afficherinfos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom:");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre prenom:");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre matricule:");
        int matricule = scanner.nextInt();
        System.out.print("Entrez votre age:");
        int age = scanner.nextInt();
        System.out.println("Nom:" + nom) ;
        System.out.println("Prénom:" + prenom);
        System.out.println("Matricule:" + matricule);
        System.out.println("Age:" + age);




    }
}
