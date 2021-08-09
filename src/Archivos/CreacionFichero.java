package Archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreacionFichero {

	
	public static void crearFichero(String nomFichero,String nomDirectorio) {
		
		try {
			File carpeta = new File("src/"+nomDirectorio);
			File archivo = new File("src/"+nomDirectorio+"/"+nomFichero);
			
			
			if(carpeta.exists()==false) {
				carpeta.mkdir();
				System.out.println("La carpeta se creo existosamente");
			}else {
				System.out.println("La carpeta ya existe");
			}
			archivo.createNewFile();	
			
		}catch(IOException e){
			System.out.println("No fue posible realizar la accion");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sca = new Scanner(System.in);
		
		String nomFichero, nomDirectorio;
		
		

		System.out.println("Ingrese nombre del fichero");
		
		nomFichero=sca.nextLine();
		
		System.out.println("Ingrese nombre del directorio");
		
		nomDirectorio=sca.nextLine();
		
		crearFichero(nomFichero,nomDirectorio);
		
		sca.close();
		
	}

}
