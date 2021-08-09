package conociendoNuestroAmbiente;

import java.util.ArrayList;
import java.util.Collections;

public class MaximoNotas {

	
	public static ArrayList<Double> notaMaximayMinima(ArrayList<Double> n) {
		
		ArrayList<Double> notasMaxyMin = new ArrayList<Double>();
		
		double nMax,nMin;
		
		nMax = Collections.max(n);
		
		nMin = Collections.min(n);
		
		notasMaxyMin.add(nMax);
		
		notasMaxyMin.add(nMin);
		
		
		return notasMaxyMin;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		
		notas.add(4.7);
		notas.add(2.2);
		notas.add(5.4);
		notas.add(6.9);
		notas.add(4.4);
		notas.add(2.6);
		
		System.out.println("Nota maxima y minima ");
		
		System.out.println(notaMaximayMinima(notas));
		
		System.out.println(notas);
		
	}

}
