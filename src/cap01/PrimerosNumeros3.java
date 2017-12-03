package cap01;

import java.util.Scanner;

public class PrimerosNumeros3 {
	
	private static Scanner scanner;
	
	public static void main (String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
	}
}
