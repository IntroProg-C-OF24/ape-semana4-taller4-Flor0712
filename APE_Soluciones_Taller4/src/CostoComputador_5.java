import java.util.Scanner;
public class CostoComputador_5 {
    public static void main(String[] args) {
        double costoCPU;
        double costoTeclado;
        double costoPantalla;
        double costoRaton;
        double costoComputador;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo del CPU");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        costoTeclado = teclado.nextDouble();
        System.out.println("Ingrese el costo del raton");
        costoRaton = teclado.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        costoPantalla = teclado.nextDouble();
        costoComputador = (costoCPU + costoTeclado + costoRaton + costoPantalla);
        System.out.println("El costo del computador de escritorio es: " + costoComputador);
    }
}
