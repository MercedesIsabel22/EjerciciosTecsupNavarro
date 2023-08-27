package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int pagfijo=10;
        double pagos=0;
        
        System.out.println("Ingrese los litros de agua");
        
        int litrosAgua=scanner.nextInt();
        if (litrosAgua <= 50){
            pagos = pagfijo;
        } else if (litrosAgua<= 200 && litrosAgua >= 51) {
            pagos = pagfijo+0.5 * (litrosAgua-50);
        } else if (litrosAgua > 200) {
            pagos = pagfijo + 0.5 * (litrosAgua-50)+ 1.5*(litrosAgua-200);
        }
        System.out.println("$ "+pagos);
    }
}
