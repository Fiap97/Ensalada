package conociendoNuestroAmbiente;

import java.util.Scanner;



public class PotenciasDe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exp;
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Ingrese valor exponente: ");
		
		exp=sca.nextInt();
		
		for(double i=0 ; i<=exp ; i++) {
			double potencias;
			potencias = Math.pow(2, i);
			System.out.println((int)potencias);
		}
		sca.close();
	}

}
