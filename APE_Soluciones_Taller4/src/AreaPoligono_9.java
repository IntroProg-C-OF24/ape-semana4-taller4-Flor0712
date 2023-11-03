import java.util.Scanner;
public class AreaPoligono_9 {
    public static void main(String[] args) {
        double alturaTriangulo;
        double ladoCuadrado;
        double areaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        ladoCuadrado = teclado.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        alturaTriangulo = teclado.nextDouble();
        areaTotal = (Math.pow(ladoCuadrado, 2)) + (ladoCuadrado * alturaTriangulo) + ((ladoCuadrado * alturaTriangulo)/2)*3;
        System.out.println("El area total del poligono es: " + areaTotal);
    }
}
