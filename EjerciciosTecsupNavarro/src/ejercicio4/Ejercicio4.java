package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor del numero");
        int numero=scanner.nextInt();
        
        for (int indice=0;indice<numero;indice++){
            if (indice%2!=0){
            	
                System.out.println(indice);
            }
        }
    }
}
