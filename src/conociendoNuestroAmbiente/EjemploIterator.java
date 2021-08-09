package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		ArrayList<String> argumentos = new ArrayList<String>();

		System.out.println("Inicio lectura de argumentos: ");
		for (int i=0;i<args.length;i++) {
			argumentos.add(args[i]);
			System.out.printf("Leo argumento %d",(i+1));
		}



		Iterator<String> itargumentos = argumentos.iterator();

		System.out.println("Estos son los argumentos recibidos: ");
		while(itargumentos.hasNext()) {
			String animal = itargumentos.next();
			System.out.println("Animal: " + animal);
		}

	}
}