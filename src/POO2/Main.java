package POO2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Persona> lpersonas = new ArrayList<Persona>();



		Estudiante e1 = new Estudiante("Almendra Araya","1-9",true,200);
		Estudiante e2 = new Estudiante("Boris Bustos","2-7",true,260);
		Estudiante e3 = new Estudiante("Carla Carmona","3-5",false,100);

		lpersonas.add(e1);
		lpersonas.add(e2);
		lpersonas.add(e3);

		Profesor p1 = new Profesor("Profesor Pacheco","4-2",true,500000);
		Profesor p2 = new Profesor("Samira Soto","5-1",true,450000);

		lpersonas.add(p1);
		lpersonas.add(p2);



		for (Persona per:lpersonas) {
			System.out.println(per.toString());
			System.out.println("Tipo clase: " + per.getClass().getSimpleName());
			if (per.getClass().getSimpleName().equals("Estudiante")) {
				Estudiante est = (Estudiante)per;
				System.out.println("La deuda es: " + est.getDeuda());
			}else {
				Profesor prof= (Profesor)per;
				System.out.println("El sueldo del profesor es: "+prof.getSueldo());
			}
		}

	}

}


