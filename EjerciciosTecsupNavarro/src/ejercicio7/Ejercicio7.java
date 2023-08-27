package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Ingrese el valor del numero");
            int numero=scanner.nextInt();
            System.out.println(resolverFactorial(numero));
    }
    
    
    public static int resolverFactorial(int n){
        int contador=1;
        for (int i=1;i<=n;i++){
        	contador=i*contador;
        }
        return contador;
    }
}
