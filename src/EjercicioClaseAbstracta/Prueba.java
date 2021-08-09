package EjercicioClaseAbstracta;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Futbolista jugador = new Futbolista(23,"Juan","Valdes",24,23,"Azul");
		
		jugador.entrevista();
		
		Masajista masajista = new Masajista(29,"Pedro","Gonzalez",39,"24/04/2005",12);
	
		masajista.darMasaje();
		
		Entrenador entrenador = new Entrenador(0,"Julian","Romero",45,16);
		
		entrenador.planificarEntrenamiento();
		
		entrenador.concentrarse();
		
		masajista.entrenamiento();
		
		jugador.partidoFutbol();
	}

}
