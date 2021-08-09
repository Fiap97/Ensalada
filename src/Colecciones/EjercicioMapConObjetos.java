package Colecciones;

import java.util.HashMap;
import java.util.Map;



public class EjercicioMapConObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Persona> lista = new HashMap<String,Persona>();

		Persona p1 = new Persona("A",11,"Ciudad 1");
		Persona p2 = new Persona("B",22,"Ciudad 2");
		Persona p3 = new Persona("C",33,"Ciudad 3");

		lista.put("1-9", p1);
		lista.put("2-7", p2);
		lista.put("3-5", p3);

		//Muestro los datos del HashMap
		System.out.println(lista);

		//Obtengo un elemento específico según key
		System.out.println(lista.get("2-7"));



		//Consulto si la clave está en la lista
		System.out.println(lista.containsKey("1-9"));
		System.out.println(lista.containsKey("4-3"));

		//Busco todas las claves del HashMap y las muestro
		System.out.println("\nListado de claves");
		lista.keySet().forEach(System.out::println);

		//Filtro las personas que sean menores o iguales a 15 años
		System.out.println("\nPersonas mayores a 15 años");
		lista.entrySet().stream().filter(persona->
		persona.getValue().getEdad()>15).forEach(System.out::println);
		
		
	}

}
