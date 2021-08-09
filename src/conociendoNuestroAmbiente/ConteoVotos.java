package conociendoNuestroAmbiente;

import java.util.Scanner;

public class ConteoVotos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadSec;
	
		Scanner sca= new Scanner(System.in);
		
		
		System.out.println("Ingrese cantidad de sectores");
		cantidadSec=sca.nextInt();
		
		int i=0;
		
		String nomSector,voto;
		
		do {
			System.out.println("Ingrese nombre del sector: ");
			nomSector=sca.next().trim();
			int sumaAceptan=0,sumaRechazan=0,sumaBlancos=0,sumaNulos=0;
			do {
				do {
					System.out.println("Ingrese voto: ");
					voto=sca.next().trim();
					sca.nextLine();
					if((voto.compareTo("A")!=0) || (voto.compareTo("R")!=0) || (voto.compareTo("B")!=0) || (voto.compareTo("N")!=0)) {
						System.out.println("Ingrese solo A o R o B o N");
					}
				}while((voto.compareTo("A")!=0) || (voto.compareTo("R")!=0) || (voto.compareTo("B")!=0) || (voto.compareTo("N")!=0));
					
				switch (voto){
					case "A":
						sumaAceptan++;
					case "R":
						sumaRechazan++;
					case "B":
						sumaBlancos++;
					case "N":
						
						sumaNulos++;
				}
			}while(voto.compareTo("X")!=0);
			System.out.println("Ingrese voto: ");
			System.out.printf("%S %d Aceptan, %d rechazan, %d blancos,%d nulos",nomSector,sumaAceptan,sumaRechazan,sumaBlancos,sumaNulos);
			
			
		}while(i<cantidadSec);
			
			
		
		
		sca.close();
		
	}

}



/*

public class Test {



static Scanner scan = new Scanner(System.in);

private static String registrarSector(int i) {
String voto;
int aceptan = 0, rechazan = 0, blancos = 0, nulos = 0;
do {
voto = scan.nextLine();
System.out.println("Voto: " + voto + " ");
switch (voto) {
case "A":
aceptan+=1;
break;
case "R":
rechazan+=1;
break;
case "N":
blancos+=1;
break;
case "B":
nulos+=1;
break;
default:
continue;
}
}while (!voto.equalsIgnoreCase("x"));
System.out.println("");
System.out.println("Lista " + i + ": " + aceptan + " aceptan, " + rechazan + " rechazan, " +
blancos + " blancos, "+ nulos + " nulos.");

if(aceptan > rechazan) {
return "Acepta";
} else if(rechazan > aceptan){
return "Rechaza";
} else if (rechazan == aceptan) {
return "Empate";
}
return null;
}
public static void main(String[] args) {

int resp;

System.out.println("Ingrese el número de Sectores: ");
resp = scan.nextInt();
System.out.println("Número de Sectores: " + resp);
String resultado;
if(resp>0) {
int acepta = 0, rechaza = 0, empate = 0;
for (int i = 1; i <= resp; i++) {
System.out.println("Sector: Lista " + i);
resultado = registrarSector(i);
switch (resultado) {
case "Acepta":
acepta+=1;
break;
case "Rechaza":
rechaza+=1;
break;
case "Empate":
empate+=1;
break;
default:
break;
}
}
System.out.println("Sectores que Aceptan: " + acepta);
System.out.println("Sectores que Rechazan: " + rechaza);
System.out.println("Sectores con Empate: " + empate);

} else {
System.out.println("Ingrese un numero valido!");
}

scan.close();
}



}

*/