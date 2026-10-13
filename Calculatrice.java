public class Calculatrice {
    public static void main(String[] args) {

        double nombre1 = 15.0;
        double nombre2 = 4.0;

        System.out.println("Addition:"+ (nombre1 + nombre2));
        System.out.println("Soustraction:" + (nombre1 - nombre2));
        System.out.println("Multiplication:" + (nombre1 * nombre2));
        System.out.printf("Division: %.2f%n" , (nombre1 / nombre2));
        System.out.println("Modulo:" + (nombre1 % nombre2));

        double resultat1 = nombre1 + nombre2 * 2;
        double resultat2 = (nombre1 + nombre2) * 2;

        int a = 10;
        System.out.println(a++);
        System.out.println(++a);

    }
}



