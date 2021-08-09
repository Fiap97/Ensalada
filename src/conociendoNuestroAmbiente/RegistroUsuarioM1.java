package conociendoNuestroAmbiente;

import java.util.Scanner;

public class RegistroUsuarioM1 {

	static int usuarioRegistrado = 0;

	static String [][] usuarios = new String [100][12];
	
	static Scanner lectura=new Scanner(System.in);
	
	static void registrarUsuario()
	{
		

		String correo="", telefono="", direccion="";
		String perfiles="",nombre="",fechaNacimiento="",run="";
		String anio="";
		String especialidad="",nivel="";
		String funcion="";
		String diaLibre="";

		
		
		
		do {
			System.out.println("Ingrese datos de usuario");
			System.out.println("Ingrese nombre");
			nombre = lectura.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento");
			fechaNacimiento = lectura.nextLine();
			System.out.println("Ingrese Run sin puntos y con guion ej 9234456-K");
			run = lectura.nextLine();
			if(nombre.equals("")) {
				System.out.println("Ingrese nombre por favor");
			}
			if(run.equals("")) {
				System.out.println("Ingrese run por favor");
			}
			
		} while ((nombre.equals("")) || (run.equals("")));
		System.out.println("Ingrese perfil(Cliente,Chef,Administrativo)");
		perfiles=lectura.nextLine();
		if (perfiles.equalsIgnoreCase("Cliente")) {
			do {
				System.out.println("Ingrese direccion");
				direccion = lectura.nextLine();

				System.out.println("Ingrese telefono Celular +56xxxxxxxxx");
				telefono = lectura.nextLine();

				System.out.println("Ingrese correo electronico");
				correo = lectura.nextLine();
				
				if(telefono.equals("")) {
					System.out.println("Ingrese telefono por favor");
				}
				if(correo.equals("")) {
					System.out.println("Ingrese correo por favor");
				}
				}
			while((telefono.equals("")) || (correo.equals("")));

			

		}

		else if(perfiles.equalsIgnoreCase("Chef")) {
			System.out.println("Ingrese años de experiencia");
			anio=lectura.nextLine().trim();
			do {
				System.out.println("Ingrese especialidad");
				especialidad=lectura.nextLine().trim();
				if(especialidad.equals("")) {
					System.out.println("Ingrese especialidad por favor");
				}
			}while(especialidad.equals(""));
				


			do {
				System.out.println("Ingrese nivel (Aprendiz, intermedio,avanzado)");
				nivel=lectura.nextLine().trim();
				if(!nivel.equalsIgnoreCase("Aprendiz")&&!nivel.equalsIgnoreCase("intermedio")&&!nivel.equalsIgnoreCase("avanzado")) {
					nivel="No ingreso nivel";
				}

			}while(!nivel.equalsIgnoreCase("Aprendiz") && !nivel.equalsIgnoreCase("intermedio") && !nivel.equalsIgnoreCase("avanzado"));
				

			
		}
		else if(perfiles.equalsIgnoreCase("Administrativo")) {
			do {
				System.out.println("Ingrese funcion");
				funcion=lectura.nextLine();
				if(funcion.equals("")) {
					System.out.println("Ingrese funcion por favor");
				}
			}while(funcion.equals(""));
			
			System.out.println("Ingrese dia libre");
			diaLibre=lectura.nextLine();


			
		}

		usuarios[usuarioRegistrado][0] = nombre;
		usuarios[usuarioRegistrado][1] = fechaNacimiento;
		usuarios[usuarioRegistrado][2] = run;
		usuarios[usuarioRegistrado][3] = direccion;
		usuarios[usuarioRegistrado][4] = telefono;
		usuarios[usuarioRegistrado][5] = correo;
		usuarios[usuarioRegistrado][6] = anio;
		usuarios[usuarioRegistrado][7] = especialidad;
		usuarios[usuarioRegistrado][8] = nivel;
		usuarios[usuarioRegistrado][9] = funcion;
		usuarios[usuarioRegistrado][10] = diaLibre;
		usuarios[usuarioRegistrado][11] = perfiles;
		
		

	}
	
	public static void listarUsuarios() {
		for (int i = 0; i < usuarioRegistrado; i++) {

			System.out.println("Datos del usuario: "+i);
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

	public static void listarUsuarios(String cat) {
		for (int i = 0; i < usuarioRegistrado; i++) {
			if(usuarios[i][11].equals(cat)) {
				System.out.println("Datos del usuario: "+i);
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



		String opcion;
		while (menu) {
		System.out.println("Seleccione una opcion: ");
		System.out.println(
		"Elija tipo de perfil: 1-Registrar usuario, 2-Mostrar Usuario, 3-Mostar Usuario por categoria, 4-Salir");
		opcion = lectura.nextLine();
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
			String cat;
			System.out.println("Ingrese categoria: ");
			cat=lectura.nextLine();
			listarUsuarios(cat);

		break;
		case "4":
		menu = false;
		break;
		}
		}



		lectura.close();
		
		

	}

}
