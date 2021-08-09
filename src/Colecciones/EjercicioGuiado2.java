package Colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioGuiado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> capitales = new TreeSet<>();
		capitales.add("Buenos Aires");
		capitales.add("Santiago");
		capitales.add("Bogotá");
		capitales.add("Brasilia");

		System.out.println(capitales);

		Set<String> capitales2 = new HashSet<>();
		capitales2.add("Caracas");
		capitales2.add("Lima");
		capitales2.add("Brasilia");
		capitales2.add("Santiago");
		capitales2.add("La Paz");

		System.out.println(capitales2);



		capitales.addAll(capitales2);
		System.out.println(capitales);

		capitales2.remove("Caracas");
		System.out.println(capitales2);

		capitales.removeAll(capitales2);
		System.out.println(capitales);

		capitales.add("La Paz");
		capitales.add("Bogotá");

		Set<String> interseccion = new HashSet<>(capitales);
		interseccion.retainAll(capitales2);
		System.out.println(interseccion);


		
	}

}
