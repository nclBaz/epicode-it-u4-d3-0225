import entities.Student;
import entities.enums.TipoStudente;

public class Main {
	public static void main(String[] args) {
		/*Circle c1 = new Circle(100);
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		Circle c2 = new Circle(c1.radius);
		System.out.println(c2.radius);
		Circle c3 = new Circle("15.3");
		System.out.println(c3.radius);
		c3.radius = 9000;
		System.out.println(c3.radius);

		double x = Math.sqrt(20);
		System.out.println(Math.PI);

		Student aldo = new Student();
		Student giovanni = new Student("Giovanni", "Storti", true);
		Student giacomo = new Student("Giacomo", "Poretti", false);
		aldo.sayHello();
		giovanni.sayHello();
		giacomo.sayHello();

		System.out.println(Student.getNumStudentiCreati());*/

		Student giacomo = new Student("Giacomo", "Poretti", false, TipoStudente.CYBER);
		Student giacomo2 = new Student("Giacomo", "Poretti", false, TipoStudente.FRONTEND);
		Student giacomo3 = giacomo; // giacomo3 e giacomo punteranno alla stessa cella di memoria (MEGLIO EVITARE!)

		giacomo3.setName("Ajeje");
		giacomo.sayHello();

		// ------------------------------ COMPARAZIONE DI OGGETTI -------------------------

		// Anche se i 2 oggetti dovessero avere esattamente gli stessi attributi, quando effettuo
		// una comparazione dei 2 tramite ==, questo operatore confronta le celle di memoria
		// se esse sono diverse il risultato sarà false
	/*	if (giacomo == giacomo2) System.out.println("Gli oggetti sono uguali");
		else System.out.println("Sono diversi");

		if (giacomo == giacomo3) System.out.println("Gli oggetti sono uguali");
		else System.out.println("Sono diversi"); */

		// Di default il metodo equals compara le celle di memoria, se non mi va bene tale comportamento,
		// posso sovrascrivere quel metodo  tasto dx -> Generate -> equals per specificare che il mio
		// criterio di comparazione di 2 oggetti deve essere diverso (es. se 2 studenti hanno stesso nome&cognome li
		// voglio considerare uguali)
		if (giacomo.equals(giacomo2)) System.out.println("Gli oggetti sono uguali");
		else System.out.println("Sono diversi");

		// ------------------------------ STAMPA IN CONSOLE DI OGGETTI -------------------------
		// Il comportamento di default è quello di stampare l'oggetto rappresentandolo come nomepackage.nomeclasse@123123213
		// Se non ci piace questo comportamento posso sovrascrivere il metodo toString all'interno della classe
		// tasto dx -> Generate -> toString è la maniera più semplice per generarne uno già decente


		System.out.println(giacomo);
		System.out.println(giacomo2);
		System.out.println(giacomo3);
	}
}