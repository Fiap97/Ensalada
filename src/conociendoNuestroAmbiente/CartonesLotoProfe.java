package conociendoNuestroAmbiente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartonesLotoProfe {

	
		public static int contarCartones() {
			int cantidad = 0;

			File fl = new File("C:\\\\Users\\\\felip\\\\Downloads\\\\ejercicio3juegos (1).txt");
			try {
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);

				String linea = br.readLine();
				while (linea != null) {
					if (linea.trim().length() > 0)
						cantidad++;

					linea = br.readLine();
				}

				br.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			return cantidad;
		}

		public static int contarNumeroEnCartones(int n) {		
			int ocurrencias = 0;

			File fl = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
			try {
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);

				String linea = br.readLine();
				while (linea != null) {
					String [] numeros = linea.split(" ");
					if (numeros.length == 6) {
						if (
								Integer.parseInt(numeros[0]) == n || Integer.parseInt(numeros[1]) == n ||
								Integer.parseInt(numeros[2]) == n || Integer.parseInt(numeros[3]) == n ||
								Integer.parseInt(numeros[4]) == n || Integer.parseInt(numeros[5]) == n
								) {
							ocurrencias++;						
						}
					}

					linea = br.readLine();
				}

				br.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}		

			return ocurrencias;
		}

		public static int hayGanadores(ArrayList<Integer> a) {
			int ganadores = 0;

			File fl = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
			try {
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);

				String linea = br.readLine();
				while (linea != null) {
					String [] numeros = linea.split(" ");
					if (numeros.length == 6) {
						ArrayList<Integer> datosaux = new ArrayList<Integer>();
						datosaux.add(Integer.parseInt(numeros[0]));
						datosaux.add(Integer.parseInt(numeros[1]));
						datosaux.add(Integer.parseInt(numeros[2]));
						datosaux.add(Integer.parseInt(numeros[3]));
						datosaux.add(Integer.parseInt(numeros[4]));
						datosaux.add(Integer.parseInt(numeros[5]));

						Collections.sort(datosaux);

						if (
								a.get(0).equals(datosaux.get(0)) && a.get(1).equals(datosaux.get(1)) &&
								a.get(2).equals(datosaux.get(2)) && a.get(3).equals(datosaux.get(3)) &&
								a.get(4).equals(datosaux.get(4)) && a.get(5).equals(datosaux.get(5))
								) {
							ganadores++;
						}
					}

					linea = br.readLine();
				}

				br.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}		
			return ganadores;
		}

		public static int nAciertos(ArrayList<Integer> b, int cantidad) {
			int aciertos = 0;

			File fl = new File("C:\\Users\\felip\\Downloads\\ejercicio3juegos (1).txt");
			try {
				FileReader fr = new FileReader(fl);
				BufferedReader br = new BufferedReader(fr);

				String linea = br.readLine();
				while (linea != null) {
					String [] numeros = linea.split(" ");
					if (numeros.length == 6) {
						ArrayList<Integer> datosaux = new ArrayList<Integer>();
						datosaux.add(Integer.parseInt(numeros[0]));
						datosaux.add(Integer.parseInt(numeros[1]));
						datosaux.add(Integer.parseInt(numeros[2]));
						datosaux.add(Integer.parseInt(numeros[3]));
						datosaux.add(Integer.parseInt(numeros[4]));
						datosaux.add(Integer.parseInt(numeros[5]));

						Collections.sort(datosaux);

						int iguales = 0;
						for (int i=0;i<b.size();i++) {
							boolean encontrado = false;
							for (int j=0;j<datosaux.size();j++) {
								if (b.get(i).equals(datosaux.get(j))) {
									encontrado = true;
								}
							}

							if (encontrado)
								iguales++;
						}

						if (iguales >= cantidad) {
							aciertos++;
							System.out.printf("\nCartón encontrado con %d aciertos: %s",iguales,linea);
						}

					}

					linea = br.readLine();
				}

				br.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}		
			return aciertos;		
		}

		public static void main(String[] args) {

			System.out.println("¿Cuántos cartones de Loto fueron jugados?");
			System.out.println("R: " + contarCartones());

			System.out.println("\nDe todos los cartones jugados, ¿cuántos escogieron el número 7?");
			System.out.println("R: " + contarNumeroEnCartones(1));

			System.out.println("\n¿Existen ganadores? Ingrese los valores: ");

			ArrayList<Integer> valores = new ArrayList<Integer>();
			int cant = 0;

			Scanner sca = new Scanner(System.in);

			do {
				System.out.println("Ingrese valor posicion " + (cant+1) + ": ");
				int dato = sca.nextInt();

				if (dato < 1 || dato > 45) {
					System.out.println("El dato no está en el rango permitido");
				}
				else {
					valores.add(dato);
					cant++;
				}
			}while(cant <6);

			Collections.sort(valores);

			System.out.println("Valores ingresados");

			for (int i=0;i<valores.size();i++) {
				System.out.print(valores.get(i) + " - ");
			}

			System.out.println("\nLa cantidad de cartones ganadores encontrados es: " + hayGanadores(valores));

			int aciertos = 0, crtencontrados;
			System.out.println("\nIngrese la cantidad mínima de aciertos a buscar: ");
			aciertos = sca.nextInt();
			crtencontrados = nAciertos(valores, aciertos);
			System.out.printf("\nCartones con al menos %d aciertos: %d",aciertos,crtencontrados);

			sca.close();
		}



}


