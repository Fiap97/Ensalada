package Colecciones;

import java.util.ArrayList;
import java.util.ListIterator;

public class EjercicioGuiado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parte 1
		ArrayList<String> ciudades = new ArrayList<String>();
		ciudades.add("Valpara�so");
		ciudades.add("Quilpu�");
		ciudades.add("Vi�a del Mar");
		ciudades.add("Casablanca");
		ciudades.add("Placilla");
		ciudades.add("Playa Ancha");

		System.out.println(ciudades);

		ArrayList<String> otras = new ArrayList<String>();
		otras.add("San Felipe");
		otras.add("Quillota");
		otras.add("La Ligua");
		otras.add("Llay Llay");

		ciudades.addAll(otras);

		System.out.println(ciudades);

		System.out.println("\n�Cu�l es el elemento en la posici�n 3?");
		String ciudad = ciudades.get(3);
		System.out.println("La ciudad obtenida es: " + ciudad);

		System.out.println("\n�Cu�l es el elemento en la posici�n 6?");
		String ciudad2 = ciudades.get(6);
		System.out.println("La ciudad obtenida es: " + ciudad2);



		ciudades.add("San Antonio");
		System.out.println(ciudades);
		System.out.println(otras);

		System.out.println("\nElimino Casablanca");
		boolean res0 = ciudades.remove("Casablanca");
		System.out.println(ciudades);
		System.out.println("�Elimino?" + res0);

		System.out.println("\nElimino El Tabo");
		boolean res1 = ciudades.remove("El Tabo");
		System.out.println(ciudades);
		System.out.println("�Elimino?" + res1);



		System.out.println("\nActualizo registro");
		String modificado = ciudades.set(5, "Santo Domingo");
		System.out.println("El elemento modificado es: " + modificado);
		System.out.println(ciudades);

		System.out.println("\nTama�o de la lista: " + ciudades.size());



		ciudades.add("Vi�a del Mar");
		ciudades.add("Vi�a del Mar");
		ciudades.add("Vi�a del Mar");
		System.out.println(ciudades);



		//Parte 2
		System.out.println("\nBuscamos un elemento");
		System.out.println("Posici�n de Vi�a del Mar: " + ciudades.indexOf("Vi�a del Mar"));

		System.out.println("\nBuscamos un elemento");
		System.out.println("Posici�n de El Belloto: " + ciudades.indexOf("El Belloto"));

		System.out.println("\nBuscamos �ltimo �ndice");
		System.out.println("Ult �ndice de Vi�a del Mar: " + ciudades.lastIndexOf("Vi�a del Mar"));



		System.out.println("\nBuscamos �ltimo �ndice");
		System.out.println("Ult �ndice de San Felipe: " + ciudades.lastIndexOf("San Felipe"));

		//Parte 3



		ListIterator<String> iter = ciudades.listIterator();
		System.out.println("\nTiene elementos: " + iter.hasNext());

		String primera = iter.next();
		System.out.println(primera);
		String segunda = iter.next();
		System.out.println(segunda);
		String tercera = iter.next();
		System.out.println(tercera);



		String otra = iter.next();
		System.out.println("\n" + otra);
		String otra2 = iter.previous();
		System.out.println(otra2);
		String otra3 = iter.previous();
		System.out.println(otra3);

	}

}
