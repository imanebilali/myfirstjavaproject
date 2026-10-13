import javax.swing.*;
import java.util.Scanner;
public class moyenne {
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
        System.out.print("Entrez votre premier module:");
    String module1 = scanner.nextLine();
     System.out.print("Entrez votre deuxième module:");
    String module2 = scanner.nextLine();
     System.out.print("Entrez votre troixième module:");
    String module3 = scanner.nextLine();
     System.out.print("Entrez votre quatrième module:");
    String module4 = scanner.nextLine();
     System.out.print("Entrez votre cinquième module:");
    String module5 = scanner.nextLine();
     System.out.print("Entrez votre sixième module:");
    String module6 = scanner.nextLine();
     System.out.print("Entrez note1 ");
     int note1 = scanner.nextInt();
     System.out.print("Entrez note2 " );
     int note2 = scanner.nextInt();
     System.out.print("Entrez note3 " );
     int note3 = scanner.nextInt();
     System.out.print("Entrez note4"  );
     int note4 = scanner.nextInt();
     System.out.print("Entrez note5 ");
     int note5 = scanner.nextInt();
     System.out.print("Entrez note6 ");
     int note6 = scanner.nextInt();
     double moyenne =(note1 + note2 + note3 + note4 + note5 + note6)/6 ;
    System.out.println("Moyenne est:" + moyenne )  ;
    if (moyenne >= 10){
        System.out.print("Semestre validé.");
    }
        else { System.out.print("Semestre non validé!");
    }




        }


}
