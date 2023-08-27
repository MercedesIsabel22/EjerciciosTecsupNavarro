package ejercicio5;

import java.util.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor del numero");
		int numero = scanner.nextInt();

		int[] numero2 = new int[numero];

		for (int indice = 0; indice < numero; indice++) {
			numero2[indice] = (int) Math.floor(Math.random() * 1000 + 1);
			;
			System.out.println("El elemento " + indice + " es: " + numero2[indice]);
		}
	}
}
