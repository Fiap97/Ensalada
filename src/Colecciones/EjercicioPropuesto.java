package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjercicioPropuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Set<Integer> precios = new HashSet<>();

		precios.add(100);
		precios.add(200);
		precios.add(100);
		precios.add(500);
		precios.add(400);
		System.out.println(precios);
		Set<Integer> precios2 = new HashSet<>();

		precios2.add(200);
		precios2.add(400);
		precios2.add(30000);
		System.out.println(precios2);
		precios.addAll(precios2);

		precios.remove(30000);

		System.out.println(precios);


	}

}
