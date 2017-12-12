/* 
 * EJEMPLO: Llena matriz con números aleatorios
 * En el siguiente programa, pedimos al usuario que ingrese las dimensiones de una matriz (filas y columnas),
 *  creamos una matriz de esas dimensiones y la llenamos con números generados aleatoriamente.
 **/

package cap01;
import java.util.Scanner;

public class DemoMatriz {
	
	private static Scanner scanner;
	
	public static void main (String[] args)
	{
		scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de filas: ");
		int n = scanner.nextInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		int m = scanner.nextInt();
		
		//Creo una matriz de n filas X m columnas
		int mat[][] = new int [n][m];
		
		int nro;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				//Genero un número aleatorio entre 0 y 1000
				nro = (int) (Math.random() * 1000);
				//Asigno el número en la matriz
				mat[i][j] = nro;
			}
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				//Imprimo la celda de la matriz
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
