package conociendoNuestroAmbiente;

import java.util.Scanner;

public class Calculadora {

	static double num1;
	static double num2;
	static Scanner sca;

	static void asignarNumeros() {
		System.out.println("Ingrese primer n�mero: ");
		num1 = sca.nextDouble();
		System.out.println("Ingrese segundo n�mero: ");
		num2 = sca.nextDouble();
	}



	static double sumarNumeros() {
		double suma = num1 + num2;
		return suma;
	}



	static double restarNumeros() {
		double resta = num1 - num2;
		return resta;
	}

	static double multiplicarNumeros() {
		double multi = num1 * num2;
		return multi;
	}

	static double dividirNumeros() {
		double divicion = num1 / num2;
		return divicion;
	}



	public static void main(String[] args) {

		boolean hayNumeros=false;

		sca = new Scanner(System.in);
		int opcion;



		do {

			do {


				System.out.println("Bienvenidos!");
				System.out.println("1.- Asignar n�meros");
				System.out.println("2.- Sumar");
				System.out.println("3.- Restar");
				System.out.println("4.- Multiplicar");
				System.out.println("5.- Dividir");
				System.out.println("6.- Salir");

				System.out.println("Ingrese una opci�n: ");
				opcion = sca.nextInt();
				if(opcion!=1) {
					System.out.println("Primero debe asignar los numeros");
				}
			}while(opcion!=1);
			
			switch(opcion) {
			case 1:
				System.out.println("Asignar variables");
				asignarNumeros();
				hayNumeros=true;
				
			case 2:	
				if(hayNumeros) {
					System.out.println("Sumar");
					System.out.println("La suma de los n�meros es: " + sumarNumeros());
					break;
				}
				
			
			case 3:
				if(hayNumeros) {
					System.out.println("Restar");
					System.out.println("La resta de los n�meros es: " + restarNumeros());
					break;
				}
				
				
			case 4:
				if(hayNumeros) {
					System.out.println("Multiplicar");
					System.out.println("La multiplicacion de los n�meros es: " + multiplicarNumeros());
					break;
				}
				
				
			case 5:
				if(hayNumeros) {
					System.out.println("Dividir");
					System.out.println("La divicion de los n�meros es: " + dividirNumeros());
					break;
				}
				
				
			case 6:	
				System.out.println("Hasta pronto!");
				break;
				
			default:
				System.out.println("Por favor ingrese una opci�n v�lida.");
				
			}
			

		}while(opcion != 6);

		sca.close();

	}

}


/*


static double num1;
static double num2;
static Scanner sca;

static void asignarnumeros() {
System.out.println("Ingrese primer n�mero: ");
num1 = sca.nextDouble();
System.out.println("Ingrese segundo n�mero: ");
num2 = sca.nextDouble();
}



static double sumarnumeros() {
double suma = num1 + num2;
return suma;
}



static double restarnumeros() {
double resta = num1 - num2;
return resta;
}

public static void main(String[] args) {



sca = new Scanner(System.in);
int opcion;



do {

System.out.println("Bienvenidos!");
System.out.println("1.- Asignar n�meros");
System.out.println("2.- Sumar");
System.out.println("3.- Restar");
System.out.println("4.- Multiplicar");
System.out.println("5.- Dividir");
System.out.println("6.- Salir");

System.out.println("Ingrese una opci�n: ");
opcion = sca.nextInt();

if (opcion == 1) {
System.out.println("Asignar variables");
asignarnumeros();
}
else if (opcion == 2) {
System.out.println("Sumar");
System.out.println("La suma de los n�meros es: " + sumarnumeros());
}
else if (opcion == 3) {
System.out.println("Restar");
System.out.println("La resta de los n�meros es: " + restarnumeros());
}
else if (opcion == 4) {
System.out.println("Multiplicar");
}
else if (opcion == 5) {
System.out.println("Dividir");
}
else if (opcion == 6) {
System.out.println("Hasta pronto!");
}
else {
System.out.println("Por favor ingrese una opci�n v�lida.");
}

}while(opcion != 6);

sca.close();
 */