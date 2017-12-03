/**
 *En el siguiente ejemplo, definimos un array de 10 enteros. Luego pedimos al usuario que ingrese valores
 * numéricos (no más de diez) y los guardamos en el array. Por último, recorremos el array para mostrar su contenido. 
 */
package cap01;
import java.util.Scanner;

public class DemoArray {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// Defino un array de 10 enteros
		int arr[] = new int[10];
		//El scanner para leer por teclado...
		scanner = new Scanner(System.in);
		
		//Leo el primer valor
		System.out.println("Ingrese un valor (0 => fin): ");
		int v = scanner.nextInt();
		
		int i = 0;
		
		//Mientras v sea distinto a cero AND i sea menor que 10
		while (v != 0 && i < 10)
		{
			arr[i++] = v;
			
			//Leo el siguiente valor
			System.out.println("Ingrese el siguiente valor (0 => fin): ");
			v = scanner.nextInt();
		}
		System.out.println("Primera forma, con for sencillo");
		for (int j = 0; j < i; j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("Segunda forma, con foreach");
		for (int z : arr) {
			System.out.println(z);
		}
	}
}
