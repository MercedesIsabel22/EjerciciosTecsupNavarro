package Ejercicio11;

public class Principal {
	public static void main(String[] args) {
		Triangulo triang = new Triangulo("Negro", true, 3.0, 4.0, 5.0);
		Rectangulo rectang = new Rectangulo("Amarillo", false, 4.0, 6.0);
		Circulo circ = new Circulo("Verde", true, 5.0);

		Figura[] fig = { circ, rectang, triang };

		for (Figura figura : fig) {
			System.out.println("La Figura es: " +figura.getClass().getSimpleName());
			System.out.println("El Color es: " +figura.getColor());
			System.out.println("El Área: es" + figura.calcularArea());
			System.out.println("El Perímetro es: " + figura.calcularPerimetro());
			System.out.println("¿Se encuentra llena?: " + figura.isEstaLlena()+ "\n");
		}

	}
}
