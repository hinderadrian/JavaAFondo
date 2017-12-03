package cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número entero: ");
		int n = scanner.nextInt();
		int i = 1;
		
		do{
			System.out.println(i);
			i++;
		}
		while(i <= n);
	}
}
