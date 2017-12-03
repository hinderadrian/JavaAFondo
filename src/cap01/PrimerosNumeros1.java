package cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {

	private static Scanner scanner;
	
	public static void main (String[] args) {
		
		scanner = new Scanner (System.in);
		System.out.println("Escribe un número entero: ");
		//Leo el valor de n
		int n = scanner.nextInt();
		//variable para iterar
		int i = 1;
		
		while (i <= n)
		{
			//Muestro el valor de i
			System.out.println(i);
			//Incremento el valor de i
			i++;
		}
	}
}
