package cap01;

import java.util.Scanner;

public class EsMayorQue21 {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		
		//Leemos el dato del usuario
		System.out.println("Ingrese su edad:");
		int edad = scanner.nextInt();
		
		if (edad >= 21)
		{
			System.out.println("Usted es mayor de 21 años :D");
		}
		else
		{
			System.out.println("Usted no es mayor de 21 años :(");
		}
	}
}
