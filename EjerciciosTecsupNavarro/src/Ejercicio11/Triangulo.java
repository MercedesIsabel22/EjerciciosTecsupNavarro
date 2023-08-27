package Ejercicio11;

public class Triangulo extends Figura{

	private double a;
	private double b;
	private double c;

	public Triangulo(String color, boolean estaLlena, double a, double b, double c) {
		super(color, estaLlena);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public double calcularArea() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double calcularPerimetro() {
		return a + b + c;
	}
}
