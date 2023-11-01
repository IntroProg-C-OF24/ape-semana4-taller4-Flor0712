package ape_semana4_soluciones;
import java.util.Scanner;
public class ValordePlanilla_4 {
    public static void main(String[] args) {
        double costoMinutos;
        double minutosConsumidos;
        double costoPlanilla;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el costo de minutos");
        costoMinutos = teclado.nextDouble();
        System.out.println("Ingrese los minutos consumidos");
        minutosConsumidos = teclado.nextDouble();
        costoPlanilla = (costoMinutos * minutosConsumidos);
        System.out.println("El costo de la planilla es: " + costoPlanilla);
    }
}
