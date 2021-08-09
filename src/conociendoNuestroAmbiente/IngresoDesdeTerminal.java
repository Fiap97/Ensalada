package conociendoNuestroAmbiente;

public class IngresoDesdeTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double suma = 0;
		double promedio;

		for (int i=0; i<args.length;i++) {
		System.out.println(args[i]);
		suma += Double.parseDouble(args[i]);
		}

		System.out.println("El resultado de la suma es " + suma);
		promedio = suma/args.length;
		System.out.println("El promedio es: " + promedio);
	}

}
