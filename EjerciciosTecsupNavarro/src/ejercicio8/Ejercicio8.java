package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor del numero");
        String cadena="";
        int numero=scanner.nextInt();
        int mayor=0;
        int[] numero2=new int[numero];
        
        for (int i=0;i<numero;i++){
        	numero2[i]=(int)Math.floor(Math.random()*100+1);
            mayor=Math.max(numero2[i],mayor);
            cadena+=numero2[i]+",";
        }
        System.out.println("{"+cadena+"}");
        System.out.printf("El numero mayor es : " + mayor);
    }
}
