
import package busca_tesoro

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * Minijuego "Busca el tesoro". Se coloca una mina y se coloca un tesoro de forma
 * aleatoria en un cuadrante de cuatro filas por cinco columnas. El usuario
 * intentará averiguar dónde está el tesoro. Si hay una mina cerca después de un
 * intento, se avisará de que está cerca.
 * 
 * @author serporion
 * 
 */
public class Busca_Tesoro {

	public static final int VACIO = 0, MINA = 1, TESORO = 2, INTENTO = 3, ALTO = 4, ANCHO = 5;
	public static int x, y; // esto está aquí para luego cambiarlo abajo como "int x" y "int y" en método main de forma definitiva. Son variables .

	public static void main(String[] arg) {

		int[][] tablero = new int[ALTO][ANCHO];

		Scanner entrada = new Scanner(System.in);
		int tesorox, tesoroy;
		int minax, minay;
		boolean salir = false;
		boolean paso = false;

		// Inicializamos el tablero

		for (int i = 0; i < ALTO; i++) {
			for (int j = 0; j < ANCHO; j++) {
				tablero[i][j] = VACIO;
			}
		}

		// Colocamos la mina
		minax = (int) (Math.random() * ALTO);
		minay = (int) (Math.random() * ANCHO);

		// Colocamos el tesoro
		do {

			tesorox = (int) (Math.random() * ALTO);
			tesoroy = (int) (Math.random() * ANCHO);

		} while (minax == tesorox || minay == tesoroy);

		// Colocamos el tesoro y la mina en el tablero

		tablero[minax][minay] = MINA;
		tablero[tesorox][tesoroy] = TESORO;

		System.out.println("A BUSCAR EL TESORO!");

		do {
			// Pintamos el tablero
			System.out.println();
			for (int y = ALTO - 1; y >= 0; y--) {
				System.out.print(y + "|");
				for (x = 0; x < ANCHO; x++) {

					System.out.print(tablero[y][x] == INTENTO ? "X " : " ");
				}

				System.out.println();
			}
			System.out.print("  ");
			for (int i = 0; i < ANCHO; i++) {
				System.out.print("--");
			}

			System.out.println();
			System.out.print("  ");
			for (int i = 0; i < ANCHO; i++) {
				System.out.print(i + " ");
			}

			System.out.println();

			// Pedimos las coordenadas
			System.out.print("Coordenada X: ");
			do {
				try {
					x = entrada.nextInt();
					paso = true;
				}catch (InputMismatchException e) {
					System.out.println("No me has dado un número, me has dado " + entrada.next());
					System.out.println("Dame una coordenada correcta "); 
				}
			}while(!paso);
			
			System.out.print("Coordenada Y: ");
			y = entrada.nextInt();

			// Comprobar coordenadas

			try {
				switch (tablero[y][x]) {
				case VACIO:
					tablero[y][x] = INTENTO;
					if(Math.abs(x-minax) < 2 && Math.abs(y-minay) < 2)
						System.out.println("\n �Cuidado, hay una mina cerca!\n");
					break;
				case MINA:
					System.out.println("\nLo siento seguro que no te has enterado de que saliste por los aires\n");
					salir = true;
					break;
				case TESORO:
					System.out.println("\nEl Tesoro es tuyo y de nadie más!!!!!\n");
					salir = true;
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.printf("\nEl número está fuera de los límetes del tablero. Alto (y) %d y Ancho (x) %d", ALTO-1, ANCHO-1);
				System.out.println("\nDame una coordenada correcta");
			}
			
			

		} while (!salir);

		for (int y = ALTO - 1; y >= 0; y--) {
			System.out.print(y + "|");
			for (x = 0; x < ANCHO; x++) {
				
				// SI QUEREMOS PINTAR EL TABLERO DESPUÉS DE PISAR UNA MINA O
				// GANAR EL TESORO, EL PRINTLN DE ABAJO NO VALE PORQUE HAY
				// QUE PINTAR CUATRO COSAS, NO DOS COMO EL OPERADOR TERNARIO
				// NOS OFRECE.

				/*
				  switch(tablero[y][x]){
				  
				  case VACIO: System.out.print("  "); break; 
				  case MINA: System.out.print("* "); break; 
				  case TESORO: System.out.println("$ "); break;
				  
				  } 
				 */

				switch (tablero[y][x]) {
				case VACIO:
					System.out.print("  ");
					break;
				case INTENTO:
					System.out.print("X ");
					break;
				case MINA:
					System.out.print("* ");
					break;
				case TESORO:
					System.out.print("$ ");
					break;
				default:
				}

			}

			System.out.println();
		}

		System.out.print("  ");
		for (int i = 0; i < ANCHO; i++) {
			System.out.print("--");
		}
		System.out.print("\n  ");
		for (int i = 0; i < ANCHO; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}