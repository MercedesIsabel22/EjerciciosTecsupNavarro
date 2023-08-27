package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int valorCondicional,edad;
        
        System.out.println("Ingrese la edad del usuario");
        
        edad=scanner.nextInt();
        if (edad>=15){
        	
            System.out.println("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:");
            valorCondicional=scanner.nextInt();
            if (valorCondicional==1){
                System.out.println("El invitado si puede ingresar a la fiesta");
            } else if (valorCondicional==0) {
                System.out.println("El invitado no puede ingresar a la fiesta");
            }else{
                System.out.println("Se debe ingresar del 1 o 0");
            }
        } else if (edad<15) {
            System.out.println("El invitado si puede ingresar a la fiesta");
        }
    }
}
