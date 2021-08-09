package conociendoNuestroAmbiente;

import java.util.Scanner;

public class RegistroUsuariosM2 {


		static Scanner sc = new Scanner(System.in);
		static String[][] usuarios = new String[100][12];
		static int usuarioRegistrado = 0;

		public static void registrarUsuario() {

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

		//	String mensaje = "El dato no ha sido ingresado";

			do {

				System.out.println("Ingrese el nombre");

				nombre = sc.nextLine().trim();

			} while (nombre.equals(""));

			System.out.println("Ingrese fecha de nacimiento");

			fechaNac = sc.nextLine().trim();

			do {

				System.out.println("Ingrese el RUN");

				RUN = sc.nextLine().trim();

			} while (RUN.equals(""));

			System.out.println("Seleccione el perfil de usuario");
			System.out.println("1. Cliente");
			System.out.println("2. Chef");
			System.out.println("3. Administrativo");

			int perfil = sc.nextInt();
			sc.nextLine();

			switch (perfil) {

			case 1:

				System.out.println("Ingrese la dirección");

				direccion = sc.nextLine().trim();

				do {

					System.out.println("Ingrese el teléfono");

					telefono = sc.nextLine().trim();

				} while (telefono.equals(""));

				do {

					System.out.println("Ingrese el correo electrónico");

					email = sc.nextLine().trim();

				} while (email.equals(""));

			case 2:

				System.out.println("Ingrese los años de experiencia");

				aniosExp = sc.nextInt();
				sc.nextLine();

				do {

					System.out.println("Ingrese la especialidad del chef");

					especialidad = sc.nextLine().trim();

				} while (especialidad.equals(""));

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
				break;

			case 3:
				do {
					System.out.println("Ingrese la función del administrativo");
					funcion = sc.nextLine().trim();
				} while (funcion.equals(""));
				System.out.println("Ingrese el día libre del administrativo");
				diaLibre = sc.nextInt();
				sc.nextLine();

				break;
			}
			usuarios[usuarioRegistrado][0] = nombre;
			usuarios[usuarioRegistrado][1] = fechaNac;
			usuarios[usuarioRegistrado][2] = RUN;
			usuarios[usuarioRegistrado][3] = direccion;
			usuarios[usuarioRegistrado][4] = telefono;
			usuarios[usuarioRegistrado][5] = email;
			usuarios[usuarioRegistrado][6] = String.valueOf(aniosExp);
			usuarios[usuarioRegistrado][7] = especialidad;
			usuarios[usuarioRegistrado][8] = nivel;
			usuarios[usuarioRegistrado][9] = funcion;
			usuarios[usuarioRegistrado][10] = String.valueOf(diaLibre);
			usuarios[usuarioRegistrado][11] = String.valueOf(perfil);
		}
		public static void listarUsuarios() {
			for (int i = 0; i < usuarioRegistrado; i++) {
				
					System.out.println("Datos del usuario: "+(i+1));
					System.out.println("Nombre: "+usuarios[i][0]);
					System.out.println("Fecha de Nacimiento: "+usuarios[i][1]);
					System.out.println("RUN: "+usuarios[i][2]);
					System.out.println("Direccion: "+usuarios[i][3]);
					System.out.println("Telefono: "+usuarios[i][4]);
					System.out.println("Email: "+usuarios[i][5]);
					System.out.println("Años de Experiencia: "+usuarios[i][6]);
					System.out.println("Especialidad: "+usuarios[i][7]);
					System.out.println("Nivel: "+usuarios[i][8]);
					System.out.println("Funcion: "+usuarios[i][9]);
					System.out.println("Dia libre: "+usuarios[i][10]);
					System.out.println("Perfil: "+usuarios[i][11]);
			
				
				
			}
		}
		public static void listarUsuarios(String categoria) {
			for (int i = 0; i < usuarioRegistrado; i++) {
				if(usuarios[i][11].equals(categoria)) {
					System.out.println("Datos del usuario: "+(i+1));
					System.out.println("Nombre: "+usuarios[i][0]);
					System.out.println("Fecha de Nacimiento: "+usuarios[i][1]);
					System.out.println("RUN: "+usuarios[i][2]);
					System.out.println("Direccion: "+usuarios[i][3]);
					System.out.println("Telefono: "+usuarios[i][4]);
					System.out.println("Email: "+usuarios[i][5]);
					System.out.println("Años de Experiencia: "+usuarios[i][6]);
					System.out.println("Especialidad: "+usuarios[i][7]);
					System.out.println("Nivel: "+usuarios[i][8]);
					System.out.println("Funcion: "+usuarios[i][9]);
					System.out.println("Dia libre: "+usuarios[i][10]);
					System.out.println("Perfil: "+usuarios[i][11]);
			
				}
				
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			boolean menu = true;

			String opcion, categoria;
			while (menu) {
				System.out.println("Seleccione una opcion: ");
				System.out.println(
						"Elija tipo de perfil: 1-Registrar usuario, 2-Mostrar Usuario, 3-Mostar Usuario por categoria, 4-Salir");
				opcion = sc.nextLine();
				switch (opcion) {
				case "1":
					if (usuarioRegistrado <= 98) {
						registrarUsuario();
						usuarioRegistrado++;
					} else {
						System.out.println("ya no quedan cupos para registrar");
					}
					break;

				case "2":
					
					listarUsuarios();

					break;
				case "3":
					
					System.out.println("Seleccione el perfil de usuario");
					System.out.println("1. Cliente");
					System.out.println("2. Chef");
					System.out.println("3. Administrativo");
					categoria=sc.nextLine();
					listarUsuarios(categoria);


					break;
				case "4":
					menu = false;
					break;
				}
			}

			sc.close();
		}
	}


