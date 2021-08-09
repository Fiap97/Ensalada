package conociendoNuestroAmbiente;

import java.util.Scanner;

public class ComparacionDeCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cadena1, cadena2;
		
		Scanner sca = new Scanner (System.in);
		
		System.out.println("ingrese cadena 1");
		cadena1=sca.nextLine();
		
		System.out.println("Ingrese cadena 2");
		cadena2=sca.nextLine();
		
		if(cadena1.equals(cadena2)) {
			
			System.out.println("son cadenas iguales");
		}	
			
		else {
			System.out.println("Son cadenas distintas");
		}
		
		if(cadena1.compareTo(cadena2)==0) {
			System.out.println("son iguales");
		}
		else {
			if(cadena1.compareTo(cadena2)<=-1) {
				System.out.println("La cadena "+cadena1+" es menor");
			}
			else {
				if(cadena1.compareTo(cadena2)>=1) {
					System.out.println("La cadena "+cadena1+" es mayor");
				}
			}
		}
		sca.close();

	}

}
