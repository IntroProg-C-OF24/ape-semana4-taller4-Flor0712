import java.util.Scanner;
public class PagoMensual_6 {
    public static void main(String[] args) {
        double montoPrestamo;
        double interesMensual;
        double pagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual del prestamo");
        interesMensual = teclado.nextDouble();
        pagoMensual = (montoPrestamo/12) + (interesMensual);
        System.out.println("El pago mensual del prestamo es: " + pagoMensual);
    }
    
}
