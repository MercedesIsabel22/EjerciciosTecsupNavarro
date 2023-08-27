package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cadena="";
        System.out.println("Ingrese el valor del numero");
        int numero=scanner.nextInt();
        
        for (int i=0;i<numero;i++){
        	cadena+="*";
            System.out.println(cadena);
        }
    }
}
