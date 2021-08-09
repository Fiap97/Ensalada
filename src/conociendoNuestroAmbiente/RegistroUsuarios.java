package conociendoNuestroAmbiente;

import java.util.Scanner;

public class RegistroUsuarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = "";
		String fechaNac = "";
		String RUN = "";
		String direccion = "";
		String telefono = "";
		String email = "";
		String especialidad = "";
		String nivel = "";
		String funcion = "";

		int aniosExp = -1;
		int diaLibre = -1;
		int perfil = -1;

		String mensaje = "El dato no ha sido ingresado";

		System.out.println("Ingrese su nombre");

		nombre = sc.nextLine().trim();

		System.out.println("Ingrese fecha de nacimiento");

		fechaNac = sc.nextLine().trim();

		System.out.println("Ingrese el RUN");

		RUN = sc.nextLine().trim();

		System.out.println("Seleccione el perfil");
		System.out.println("1. Cliente");
		System.out.println("2. Chef");
		System.out.println("3. Administrativo");

		perfil = sc.nextInt();
		sc.nextLine();

		if (perfil <= 3 && perfil > 0) {

			if (perfil == 1) {

				System.out.println("Ingrese la dirección");

				direccion = sc.nextLine().trim();

				System.out.println("Ingrese el teléfono");

				telefono = sc.nextLine().trim();

				System.out.println("Ingrese el correo electrónico");

				email = sc.nextLine().trim();

				System.out.println("");
				
				System.out.println("Tipo de usuario: Cliente");

				if (nombre != "") {
					System.out.println("Nombre: " + nombre);
				} else {
					System.out.println("Nombre: " + mensaje);
				}

				if (fechaNac != "") {
					System.out.println("Fecha de nacimiento: " + fechaNac);
				} else {
					System.out.println("Fecha de nacimiento: " + mensaje);
				}

				if (RUN != "") {
					System.out.println("RUN: " + RUN);
				} else {
					System.out.println("RUN: " + mensaje);
				}

				if (direccion != "") {
					System.out.println("Dirección: " + direccion);
				} else {
					System.out.println("Dirección: " + mensaje);
				}

				if (telefono != "") {
					System.out.println("Telefono: " + telefono);
				} else {
					System.out.println("Telefono: " + mensaje);
				}

				if (email != "") {
					System.out.println("Correo electrónico: " + email);
				} else {
					System.out.println("Correo electrónico: " + mensaje);
				}

			} else if (perfil == 2) {

				System.out.println("Ingrese los años de experiencia");

				aniosExp = sc.nextInt();
				sc.nextLine();

				System.out.println("Ingrese la especialidad del chef");

				especialidad = sc.nextLine().trim();

				System.out.println("Ingrese el nivel de experiencia");

				System.out.println("1. Aprendiz");
				System.out.println("2. Intermedio");
				System.out.println("3. Avanzado");

				int lvl = sc.nextInt();
				sc.nextLine();

				if (lvl <= 3 && lvl > 0) {

					if (lvl == 1) {

						nivel = "Aprendiz";

					} else if (lvl == 2) {

						nivel = "Intermedio";

					} else {

						nivel = "Avanzado";

					}

				}

				System.out.println("");
				
				System.out.println("Tipo de usuario: Chef");

				if (nombre != "") {
					System.out.println("Nombre: " + nombre);
				} else {
					System.out.println("Nombre: " + mensaje);
				}

				if (fechaNac != "") {
					System.out.println("Fecha de nacimiento: " + fechaNac);
				} else {
					System.out.println("Fecha de nacimiento: " + mensaje);
				}

				if (RUN != "") {
					System.out.println("RUN: " + RUN);
				} else {
					System.out.println("RUN: " + mensaje);
				}

				if (aniosExp != -1) {
					System.out.println("Años de experiencia: " + aniosExp);

				} else {
					System.out.println("Años de experiencia: : " + mensaje);
				}
				
				if (especialidad != "") {
					System.out.println("Especialidad: " + especialidad);
				} else {
					System.out.println("Especialidad: " + mensaje);
				}
				
				if (nivel != "") {
					System.out.println("Nivel de experiencia: " + nivel);
				} else {
					System.out.println("Nivel de experiencia: " + mensaje);
				}
				
			} else {
				
				System.out.println("Ingrese la función del administrativo");

				funcion = sc.nextLine().trim();


				System.out.println("Ingrese el día libre del administrativo");

				diaLibre = sc.nextInt();
				
				
				System.out.println("");
				
				System.out.println("Tipo de usuario: Administrativo");

				if (nombre != "") {
					System.out.println("Nombre: " + nombre);
				} else {
					System.out.println("Nombre: " + mensaje);
				}

				if (fechaNac != "") {
					System.out.println("Fecha de nacimiento: " + fechaNac);
				} else {
					System.out.println("Fecha de nacimiento: " + mensaje);
				}

				if (RUN != "") {
					System.out.println("RUN: " + RUN);
				} else {
					System.out.println("RUN: " + mensaje);
				}

				if (funcion != "") {
					System.out.println("Función: " + funcion);

				} else {
					System.out.println("Función: : " + mensaje);
				}
				
				if (diaLibre != -1) {
					System.out.println("Día libre solicitado: " + diaLibre);
				} else {
					System.out.println("Día libre solicitado: " + mensaje);
				}
				

				
			}
			
			
			
			
			
			

		} else {
			System.out.println("No ha seleccionado el perfil");
		}
		
		sc.close();

	}

}

