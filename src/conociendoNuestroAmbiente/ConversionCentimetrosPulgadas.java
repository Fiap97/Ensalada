package conociendoNuestroAmbiente;

import java.util.Scanner;

public class ConversionCentimetrosPulgadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner scan = new Scanner(System.in);
				final double pulgada = 2.54;
				double centimetros, res;
				String formato;
				
				System.out.println("Ingrese longitud (en cm)");
				centimetros =  scan.nextDouble();
				
				res = centimetros/pulgada;
				
				formato = (String) String.format("%.4f", res);
				Double newRes = Double.parseDouble(formato);
				
				System.out.println((int)centimetros + " cm = " + newRes + " in");
				
				scan.close();	
				
			
		

	}

}
