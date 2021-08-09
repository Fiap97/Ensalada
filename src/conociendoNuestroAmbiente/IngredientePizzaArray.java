package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Scanner;

public class IngredientePizzaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub






		Scanner scan = new Scanner(System.in);

		ArrayList<String> pizza = new ArrayList<String>();
		pizza.add("queso");
		pizza.add("piña");
		pizza.add("salame");
		pizza.add("cebolla");
		pizza.add("salsa");



		String valor = scan.nextLine();

		if(pizza.contains(valor)) {
			System.out.println("Se encuentra en la pizza");
		} else {
			pizza.add(valor);
			System.out.println("Se agregó correctamente");
		}

		for (String ingredientes : pizza) {
			System.out.println(ingredientes);
		}

		scan.close();

	}







}
