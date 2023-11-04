import java.util.Scanner;
public class TabladeMultiplicar_3 {
    public static void main(String[] args) {
        int numUsuario;
        int tablaMultiplicar;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar un numero entre el 2 y 6");
        numUsuario = teclado.nextInt();
        for (int i = 1; i <=10; i++) {
        //numero * i = (numero * i);
        tablaMultiplicar = (numUsuario * i);
        System.out.println("Tabla de Multiplicar es: " + tablaMultiplicar);
        }
    }
    
}
