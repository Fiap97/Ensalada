package Archivos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class EscribirArchivo {

	public static void sumaColumnas() {

		String [] arrNum;

		try {
			File fichero = new File("src/miDirectorio/fichero.txt");
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			
			int num;
			
			String linea;
			
			linea=br.readLine();
			
			int c1=0;
			int c2=0;
			int c3=0;
			
			
			while(linea!=null){
				arrNum=linea.split(" ");
				for(int i=0; i<arrNum.length; i++) {
					num=Integer.parseInt(arrNum[i]);
					if(i==0) {
						c1+=num;
					}else if(i==1) {
						c2+=num;
					}
					else {
						c3+=num;
					}
				}
				
				linea=br.readLine();

			}
			System.out.printf("La suma es de la columna1 es: %d\n",c1);
			System.out.printf("La suma es de la columna2 es: %d\n",c2);
			System.out.printf("La suma es de la columna3 es: %d\n",c3);
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public static void sumaLineas() {


		String [] arrNum;

		try {
			File fichero = new File("src/miDirectorio/fichero.txt");
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			int num;
			String linea;
			linea=br.readLine();

			while(linea!=null){
				arrNum=linea.split(" ");
				int suma=0;
				for(int i=0; i<arrNum.length; i++) {
					num=Integer.parseInt(arrNum[i]);
					suma+=num;
				}
				System.out.printf("La suma es: %d\n",suma);
				linea=br.readLine();

			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}



	}
	public static void lectura() {

		try {

			File fichero = new File("src/miDirectorio/fichero.txt");
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			String linea;

			linea=br.readLine();
			while(linea!=null){
				System.out.println(linea);
				linea=br.readLine();
			}

			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public static void crearFile() {
		try {
			File carpeta = new File("src/miDirectorio");
			File fichero = new File("src/miDirectorio/fichero.txt");

			if (carpeta.exists() == false) {
				carpeta.mkdir();
				System.out.println("La carpeta se creó exitosamente.");
			}
			else {
				System.out.println("La carpeta ya existe.");
			}

			FileWriter fw = new FileWriter(fichero);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("45 12 98\n");
			bw.write("1 12 65\n");
			bw.write("7 15 75\n");
			bw.write("54 23 1\n");
			bw.write("65 2 84");



			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		crearFile();
		lectura();
		sumaLineas();
		sumaColumnas();

	}




}

