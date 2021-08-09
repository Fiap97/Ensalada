package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Float> notas = new ArrayList<Float>();

		notas.add(6.9f);
		notas.add(6.7f);
		notas.add(4.5f);
		notas.add(5.5f);
		notas.add(5.8f);
		notas.add(6.1f);
		notas.add(7.0f);

		System.out.println(notas + " " + notas.size() + " elementos.");

		float notaMasBaja = Collections.min(notas);


		System.out.println("La nota más baja es: " + notaMasBaja);
		notas.remove(notaMasBaja);

		System.out.println(notas+ " " + notas.size() + " elementos.");

		float suma = 0f, promedio;
		for (Float nota : notas) {
		suma+=nota;
		}

		promedio = suma/notas.size();

		System.out.println("El promedio final es : " + promedio);
		
	}
	

}
