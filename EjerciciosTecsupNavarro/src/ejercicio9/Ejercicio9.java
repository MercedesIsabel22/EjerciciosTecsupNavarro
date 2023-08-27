package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor del numero");
        int numero=scanner.nextInt();
        String cadena="";
        int[] numero2=new int[numero];
        for (int indice=0;indice<numero;indice++){

            System.out.println("Ingrese dato que insertara en la posicion " + indice + " del array" );
            numero2[indice]=scanner.nextInt();
        }
        for (int indice = numero - 1; indice >= 0; indice--) {
        	cadena += numero2[indice] + " ";
        }
        System.out.println("La salida es");
        System.out.println(cadena);
    }
}
