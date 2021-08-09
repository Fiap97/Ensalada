package conociendoNuestroAmbiente;

import java.util.Scanner;

public class MenuOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sca = new Scanner(System.in);
		
		float a,b,op;
		
		System.out.println("Ingrese primer numero");
		a= sca.nextFloat();
		System.out.println("Ingrese segundo numero");
		b= sca.nextFloat();
		String opcion="";
		
		
		do {
			System.out.println("¿Que desea hacer?");
			System.out.println("sumar");
			System.out.println("restar");
			System.out.println("multiplicar");
			System.out.println("dividir");
			System.out.println("salir");
			
			opcion=sca.nextLine().trim();
		
			if(opcion.compareTo("sumar")==0) {
				op=a+b;
				System.out.printf("El resultado de la operacion "+opcion+" es: %f",op);
				
			}else if(opcion.compareTo("restar")==0) {
				op=a-b;
				System.out.printf("El resultado de la operacion "+opcion+" es: %f",op);
				
			}else if(opcion.compareTo("multiplicar")==0) {
				op=a*b;
				System.out.printf("El resultado de la operacion "+opcion+" es: %f",op);
				
			}else if(opcion.compareTo("dividir")==0) {
				op=a/b;
				System.out.printf("El resultado de la operacion "+opcion+" es: %f",op);
				
			}else if(opcion.compareTo("salir")==0) {
				
				System.out.printf("Ha salido del programa");
				
			}else {
				System.out.println("Opcion no valida");
			}
			
			sca.nextLine();
			
		}while(opcion.compareTo("Salir")!=0);
		
		
		
		sca.close();
	}

}






