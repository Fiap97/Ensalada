package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sca = new Scanner(System.in);
		ArrayList <Integer> numero = new ArrayList<Integer>();
		int num;

		do {
			System.out.println("Ingrese un número: ");
			num = sca.nextInt();

			if (num < 0) {
				System.out.println("Salgo del ciclo ...");
			}
			else if (num%2 == 0){
				numero.add(num);
			}
			else {
				System.out.println("No agrego el número a la lista");
			}
		}while(num >= 0);

		System.out.println("La lista obtenida es: ");
		System.out.println(numero);

		System.out.println("Vamos eliminando");
		do {
			System.out.println("Ingrese un número a eliminar: ");
			num = sca.nextInt();

			if (num < 0) {
				System.out.println("Salgo del ciclo ...");
			}
			else {
				Integer numobj = num;
				numero.remove(numobj);
				System.out.println(numero);
			}
		}while(num >= 0);

		System.out.println("Eliminamos todo: ");
		numero.clear();
		System.out.println(numero);

		sca.close();

	}

}
