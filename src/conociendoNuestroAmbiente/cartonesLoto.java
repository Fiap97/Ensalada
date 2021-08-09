package conociendoNuestroAmbiente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class cartonesLoto {

	public static int contarCartones() {
		
		File fichero = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
		
		int c=0;
		try {
		
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			linea=br.readLine();
			

			while(linea!=null) {
				
				if(linea.trim().length()>0) {
					c++;
				}
				linea=br.readLine();	
			}
			
			
			br.close();
			


		}catch(IOException e) {
			e.printStackTrace();
		}
			
		return c;
		

	}


	public static int contarNumerosEnCartones(int num) {

		int cont=0;
		File fichero = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
		try {
			
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			linea=br.readLine();
			
			
			String [] array;
			
			int n;

			while(linea!=null) {
				
				array=linea.split(" ");
				
				if(array.length==6) {
					for(int i=0; i<array.length; i++) {
					
						n=Integer.parseInt(array[i]);
						if(n==num) {
							cont++;
						}
					}
					
				}
				linea=br.readLine();
			}
			br.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
		return cont;
	}

	
	public static boolean hayGanadores(ArrayList<Integer>numeros){
		
		
		boolean var=false;
		File fichero = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
		try {
			
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;
			
			
			String  cadena="";
			
			
			Iterator<Integer> itNumeros = numeros.iterator();
			
			linea=br.readLine();

			while(linea!=null) {
				
				while(itNumeros.hasNext()) {
					Integer num = itNumeros.next();
					cadena+=String.valueOf(num+" ");
				}
				
				if((linea.equals(cadena.trim()))) {
					var=true;
				}
			
				linea=br.readLine();
			}
			br.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
		return var;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);

		ArrayList<Integer> numeros =new ArrayList<Integer>();


		contarCartones();
		
		System.out.println("La cantidad de cartones es: "+	contarCartones());

		int n;

		System.out.println("Ingrese el numero a considerar");

		n=sca.nextInt();

		contarNumerosEnCartones(n);
		
		System.out.println("La cantidad de cartones que contienen ese numero es: "+contarNumerosEnCartones(n));
		
		int numero;
	
		for(int i=0; i<6 ; i++) {
			System.out.println("Ingrese numeros");
			numero=sca.nextInt();
			numeros.add(numero);
		}


		hayGanadores(numeros);
		if(hayGanadores(numeros)) {
			System.out.println("Si hay ganadores");
		}
		else {
			System.out.println("No hay ganadores");
		}
/*
		System.out.println("Ingrese cantidad de aciertos");
		int aciertos;

		nAciertos(numeros,aciertos);

*/
		sca.close();
	}

}
