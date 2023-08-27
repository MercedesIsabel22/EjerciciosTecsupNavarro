package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int aleatorio=(int)Math.floor(Math.random()*100+1);
        System.out.println(aleatorio);
        int contador=0,numero=0;
        do{

            System.out.println("Ingrese numero");
            numero=scanner.nextInt();
            if (numero < aleatorio){
                System.out.println("Numero demasiado bajo, intenta nuevamente");
            } else if (numero > aleatorio) {
                System.out.println("NÃºmero demasiado alto, intenta nuevamente.");
            }
            contador++;
        }while (aleatorio != numero);
        System.out.println("¡Felicidades! ¡Haz adivinado el numero!");
        System.out.println("Usted hizo " + contador+ " intentos");
    }
}
