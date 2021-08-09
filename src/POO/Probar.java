package POO;

public class Probar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto miAuto = new Auto(1.8,"Caucho");
		
		System.out.println(miAuto.toString());
		
		Ave ave = new Ave("Avestruz","Colorado","Rosa","Rosado");
		
		Oso oso = new Oso("Oso","Polar","Blanco","Antartico");
		
		Zoologico zoo = new Zoologico(ave, oso, 5,"Las amapolas 45");
		
		System.out.println(zoo.toString());
		
	}

}
