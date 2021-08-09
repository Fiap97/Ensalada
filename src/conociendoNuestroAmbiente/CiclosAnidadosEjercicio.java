package conociendoNuestroAmbiente;

import java.util.Scanner;

public class CiclosAnidadosEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Ingrese cantidad de líneas: ");
		n = sc.nextInt();

		for (int i=0;i<=n;i++) {
			for (int j=1;j<(i+1);j++) {
				System.out.printf("%d",j);
			}
			System.out.print("\n");
		}

		sc.close();
	}

}
