import java.util.Scanner;
public class PlanilladeLuz_7 {
    public static void main(String[] args) {
        double costokilovatioHora;
        double consumokilovatioMes;
        double costoPlanilladeLuz;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo de los Kilovatios por hora");
        costokilovatioHora = teclado.nextDouble();
        System.out.println("Ingrese el consumo de los Kilovatios por mes");
        consumokilovatioMes = teclado.nextDouble();
        System.out.println("Ingrese el descuento de las personas mayores a 65 anios");
        costoPlanilladeLuz = (costokilovatioHora * consumokilovatioMes);
        System.out.println("El costo de la planilla de Luz a cancelar es: " + costoPlanilladeLuz);
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        if (edad > 65){
            costoPlanilladeLuz *= 0.9;
            System.out.println("Se aplica el descuento de 10% por ser mayor a 65 anios");
            System.out.println("El costo de la planilla de luz a cancelar es: " + costoPlanilladeLuz);
        }
    }
}
