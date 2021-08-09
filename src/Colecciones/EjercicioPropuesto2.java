package Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioPropuesto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> clientes = new LinkedList<>();
		
		clientes.add("Armando Casas");
		clientes.add("Pedro Del Campo");
		clientes.add("Silvana Susana");
		clientes.add("Natalia Ivanovic");
		clientes.add("Roger Federer");
		clientes.add("Dominic Toretto");
		
		System.out.println(clientes);
		
		clientes.remove("Roger Federer");
		
		System.out.println(clientes);
		
		System.out.println(clientes.size());
		
		
	}

}
