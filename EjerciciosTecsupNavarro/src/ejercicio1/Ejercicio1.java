package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horas, horasextras1,horasextras2;
        double sueldofinal=0.0;
        System.out.println("Ingrese las horas trabajadas");
        
        horas = scanner.nextInt();
        if (horas > 40 && horas <= 48) {
        	horasextras1 = (horas - 40) * 80;
            sueldofinal = horasextras1 + (40 * 40);
        } else if (horas > 48) {
        	horasextras1 = (horas - 40);
            if (horasextras1 <= 8) {
            	horasextras1 = (horas - 40) * 80;
                sueldofinal = horasextras1 + (40 * 40);
            } else if (horasextras1 > 8) {
            	horasextras1 = (horas - 48) * 120;
                horasextras2 = 8 * 80;
                sueldofinal = (horasextras1 + horasextras2)+(40*40);
            }
        }else {
            sueldofinal=40*horas;
        }
        System.out.println("El sueldo final es: s/. "+sueldofinal);
    }
}
