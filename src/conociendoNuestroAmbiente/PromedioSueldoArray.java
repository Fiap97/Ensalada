package conociendoNuestroAmbiente;

public class PromedioSueldoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] sueldos= {400000,800000,1200000,450000,650000,780000,390000};
		   
		int suma=0;
		int largo=0;
		
		for(int i=0; i<sueldos.length ;i++){
			if(sueldos[i]>500000) {
				suma+=sueldos[i];
				largo++;
			}
		}
		double promedio;
		promedio=suma/largo;
		System.out.println(promedio);
	}

}
