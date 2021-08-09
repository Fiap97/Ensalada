package conociendoNuestroAmbiente;

import java.util.Scanner;

public class SumaNumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sca = new Scanner(System.in);
		
		int n;

		System.out.println("Ingrese el numero termino");
		
		n=sca.nextInt();
		int c=0;
		
		for(int i=1 ; i<=n ; i++) {
			if(i%2==0) {
				c=c+i;
			}
			
		}
		System.out.printf("La suma es: %d",c);
		sca.close();
	}

}
