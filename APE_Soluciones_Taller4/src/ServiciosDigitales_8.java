import java.util.Scanner;
public class ServiciosDigitales_8 {
    public static void main(String[] args) {
        double valorNetflix, valorYoutube, valorDropbox, valorSpotify;
        double serviciosDigitales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de Netflix");
        valorNetflix = teclado.nextDouble();
        System.out.println("Ingrese el valor de Youtube");
        valorYoutube = teclado.nextDouble();
        System.out.println("Ingrese el valor de Dropbox");
        valorDropbox = teclado.nextDouble();
        System.out.println("Ingrese el valor de Spotify");
        valorSpotify = teclado.nextDouble();
        serviciosDigitales = (valorNetflix + valorYoutube + valorDropbox + valorSpotify);
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        if (edad > 30);
        serviciosDigitales *= 2.0;
        System.out.println("Se aplica el descuento de 20% a las personas menores de 30 anios");
        System.out.println("El costo de los servicios digitales es: " + serviciosDigitales);
    }
      
}