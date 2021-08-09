package conociendoNuestroAmbiente;

import java.util.Scanner;

public class CalculoHipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cateto1, cateto2, hipotenusa;
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Ingrese valor cateto1: ");
		cateto1=sca.nextFloat();
		
		System.out.println("Ingrese valor cateto2: ");
		cateto2=sca.nextFloat();
		
		sca.close();
		
		
		hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
		
		System.out.println("El valor de la hipotenusa es: "+ hipotenusa);
	}

}
