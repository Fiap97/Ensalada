package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlturaAlumnos {
	
	
	public static double alturaMedia(ArrayList<Double> a) {
		
		Iterator<Double> itAlumnos = a.iterator();
		
		double alt,media,suma=0;
		
		
		while(itAlumnos.hasNext()) {
			
			alt=itAlumnos.next();
			suma+=alt;
			
		}
		media=suma/(double)a.size();
		return media;
		
	}
	
	public static int mayoresMedia(ArrayList<Double> alum) {
		
		Iterator<Double> itAlumnos = alum.iterator();
		
		int c=0;
		
		double alumno;
		
		while(itAlumnos.hasNext()) {
			
			alumno=itAlumnos.next();
			if(alumno>alturaMedia(alum)) {
				c++;
			}
			
		}
		return c;
		
	}

	public static int menoresMedia(ArrayList<Double> alum) {
		
		Iterator<Double> itAlumnos = alum.iterator();
		
		int c=0;
		
		double alumno;
		
		while(itAlumnos.hasNext()) {
			
			alumno=itAlumnos.next();
			if(alumno<alturaMedia(alum)) {
				c++;
			}
			
		}
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sca = new Scanner(System.in);	
		int n;
		
		ArrayList<Double> alumnos = new ArrayList<Double>(); 
		
		do {
			System.out.println("Ingrese cantidad de alumnos");
			n=sca.nextInt();
			
		}while(n<=0);
		
		double altura;
		
		
		for(int i=0; i<n ; i++) {
			System.out.println("Ingrese altura");
			altura=sca.nextDouble();			
			alumnos.add(altura);
		}
	
		System.out.printf("La altura media es: %.3f",alturaMedia(alumnos));
			
		System.out.println();
		System.out.printf("Los alumnos que estan mayores a la media: %d",mayoresMedia(alumnos),"\n");
		System.out.println();
		System.out.printf("Los alumnos que estan menores a la media: %d",menoresMedia(alumnos));
		sca.close();
	}

}
