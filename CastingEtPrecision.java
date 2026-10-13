public class CastingEtPrecision {
    public static void main(String[] args) {
        double centimetres = 254.0 ;
        double pouces = centimetres /2.54 ;
        System.out.println("Conversion en double:" + pouces);
        int  poucesenint = (int)pouces ;
        System.out.println("Conversion en int:" + poucesenint);
        long poucesarrondi  = Math.round (pouces);
        System.out.println("Conversion arrondie :"+ poucesarrondi);
        float prixArticle = 12.99f;
        int quantite = 3;
        double total = prixArticle * quantite ;
        System.out.printf( "Total: %.2f%n ", total);
        int grandNombre =  2_000_000_000;
        byte petitNombre = (byte) grandNombre;
        System.out.println("Casting de int vers byte :"+ petitNombre);



    }

}
