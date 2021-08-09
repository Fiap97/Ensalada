package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> colores = new ArrayList<String>();

		colores.add("Verde");
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Amarillo");
		colores.add("Blanco");

		Iterator<String> itcolores = colores.iterator();

		while(itcolores.hasNext()) {
			String color = itcolores.next();
			System.out.println("Valor: " + color);
		}
	}

}
