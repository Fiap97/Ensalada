package Archivos;

import java.io.File;
import java.io.IOException;

public class EjercicioArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File carpeta = new File("src/conceptual");
			File fichero = new File("src/conceptual/archivo.txt");
			carpeta.mkdir();
			fichero.createNewFile();
			
			
			if(carpeta.exists()==false) {
				carpeta.mkdir();
				System.out.println("La carpeta se creo exitosamente");
			}
			else {
				System.out.println("La carpeta ya existe");
			}
		}catch(IOException e) {
			System.out.println("No fue posible realizar la accion");
		}
		
		
		
	}

}
