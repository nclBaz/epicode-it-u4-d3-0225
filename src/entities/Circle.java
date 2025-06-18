package entities;

public class Circle {
	// ATTRIBUTI
	public double radius;

	// COSTRUTTORI
	// Se la lista costruttori è vuota ho comunque a disposizione almeno il costruttore vuoto
	// creato automaticamente da Java
	/*
	public Circle() {
		this.radius = 20;
	}*/

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String radius) {
		this.radius = Double.parseDouble(radius);
	}

	// METODI
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
