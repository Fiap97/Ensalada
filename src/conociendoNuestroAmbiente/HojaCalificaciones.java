package conociendoNuestroAmbiente;

import java.util.Scanner;

public class HojaCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreEstudiante, asignatura, nombreDocente;
		float nota1, nota2, nota3, promedio;
		
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Ingrese nombre completo del estudiante");
		nombreEstudiante = sca.next();
		System.out.println("Ingrese asignatura");
		asignatura = sca.next();
		System.out.println("Ingrese nombre del docente");
		nombreDocente = sca.next();
		System.out.println("Ingrese nota1 ");
		nota1 = sca.nextFloat();
		System.out.println("Ingrese nota2 ");
		nota2 = sca.nextFloat();
		System.out.println("Ingrese nota3 ");
		nota3 = sca.nextFloat();
		
		sca.close();
		
		
		promedio=(nota1+nota2+nota3)/3;
		
		
		
		System.out.println("El nombre del alumno es: "+ nombreEstudiante);
		System.out.println("La asignatura es: "+ asignatura);
		System.out.println("El nombre del docente es: "+ nombreDocente);
		System.out.println("El promedio del alumno es: "+ promedio);
		
		if(promedio<4){
			System.out.println("El alumno esta reprobado");
		}
		else
			if(promedio>4){
				System.out.println("El alumno esta aprobado");
			}
		
		
	}
}
