package conociendoNuestroAmbiente;

import java.util.Scanner;

public class JuegoTenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		Scanner sca= new Scanner(System.in);
		
		System.out.println("Juegos ganados por a");
		a=sca.nextInt();
		
		System.out.println("Juegos ganados por b");
		b=sca.nextInt();
		
		sca.close();
		
		if((a<1 || a>7) || (b<1 || b>7) ) 
			System.out.println("Resultado invalido");
		else {
			if(a==7 && b==5 )
				System.out.println("El ganador es a");
			else {
				if(b==7 && a==5)
					System.out.println("El ganador es b");
				else {
					if(a==6 && b==4 )
						System.out.println("El ganador es a");
					else {
						if(b==4 && a==6)
							System.out.println("El ganador es b");
						else {
							if(a==7 && b==6 )
								System.out.println("El ganador es a");
							else {
								if(b==7 && a==6)
									System.out.println("El ganador es b");
								else {
									if(a==7 && b<5 )
										System.out.println("Resultado invalido");
									else {
										if(b==7 && a<5)
											System.out.println("Resultado invalido");
										else {
											if(a==6 && b==6)
												System.out.println("Aun no termina");
											else {
												if((a==6 && b<=5) && a-b==2)
													System.out.println("El ganador es a");
												else {
													if(b==6 && a<=5)
														System.out.println("El ganador es b");
													else {
														if(a==7 && b==7)
															System.out.println("Resusltado invalido");
														else {
															System.out.println("Aun no termina");
														}
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}	
		}
	}
}
