public class Meteo{
    public static void main(String[] args) {

        String ligneMeteo = "25.5,70,1012.3";


        String[] donnees = ligneMeteo.split(",");

        try {

            double temperature = Double.parseDouble(donnees[0]);
            int humidite = Integer.parseInt(donnees[1]);
            double pression = Double.parseDouble(donnees[2]);


            System.out.println("Température: " + temperature + " °C");
            System.out.println("Humidité: " + humidite + " %");
            System.out.println("Pression: " + pression + " hPa");


            double tempFahrenheit = (temperature * 9/5) + 32;
            System.out.println("Température en Fahrenheit: " + tempFahrenheit + " °F");

            double indiceConfort = (temperature * humidite) / 100;
            System.out.println("Indice de confort: " + indiceConfort);


            double temp1 = 24.0, temp2 = 26.0, temp3 = 25.5;
            double moyenne = (temp1 + temp2 + temp3) / 3;
            System.out.println("Moyenne glissante (3 mesures): " + moyenne + " °C");

        } catch (NumberFormatException e) {
            System.out.println("Erreur de format dans les données météo !");
        }
    }
}
