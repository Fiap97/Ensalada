package conociendoNuestroAmbiente;

import java.util.Scanner;

public class IngresoContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="hesoyam",claveIngresada;
		
		Scanner sca = new Scanner(System.in);
		int i=0;
		
		do {
			
			
			System.out.println("Ingrese clave: ");
			claveIngresada= sca.nextLine();
			if(claveIngresada.equals(clave)) {
				System.out.println("La clave ingresada es correcta");
				break;
			}
			else {
				System.out.println("Clave incorrecta");
			}
			if(i==2) {
				System.out.println("Terminaron sus intentos");
			}
			i++;
			
		}while(i<3);
			
		
		
		sca.close();
		
		
	}

}
