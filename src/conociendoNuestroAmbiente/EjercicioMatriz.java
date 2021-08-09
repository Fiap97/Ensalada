package conociendoNuestroAmbiente;

public class EjercicioMatriz {


	public static void mostrartablero(int a[][]) {
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}



	public static int diagonalPrincipal(int b[][]) {
		int sumadp = 0;
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i == j) {
					sumadp += b[i][j];
				}
			}
		}
		return sumadp;
	}



	public static int diagonalSuperior(int c[][]) {
		int sumads = 0;
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i < j) {
					sumads += c[i][j];
				}
			}
		}
		return sumads;
	}




	public static int diagonalInferior(int d[][]) {
		int sumadi = 0;
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i > j) {
					sumadi += d[i][j];
				}
			}
		}
		return sumadi;
	}



	public static void main(String[] args) {



		int [][] tablero = new int[10][10];
		int i, j;

		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				tablero[i][j] = (int)(Math.random()*10);
			}
		}



		System.out.println("Los valores de la matriz son los siguientes: ");
		mostrartablero(tablero);

		int dprincipal = diagonalPrincipal(tablero);
		System.out.printf("La diagonal principal es %d\n",dprincipal);



		int dsuperior = diagonalSuperior(tablero);
		System.out.printf("La diagonal superior es %d\n",dsuperior);



		int dinferior = diagonalInferior(tablero);
		System.out.printf("La diagonal inferior es %d\n",dinferior);



		if ((dinferior + dsuperior) < dprincipal)
			System.out.println("La suma de las diagonales inferior y superior es menor que la diagonal principal");
		else
			System.out.println("La suma de las diagonales inferior y superior es mayor o igual que la diagonal principal");



	}

}
