package cap01;

import java.util.Scanner;

public class CadenaDesglosada {

	private static Scanner scanner;
	
	public static void main (String[] args)
	{
		scanner = new Scanner(System.in);
		System.out.println("Ingresa una cadena de caracteres: ");
		String cadena = scanner.nextLine();
		
		for (int i = 0; i < cadena.length(); i++)
		{
			System.out.println("El valor es : " + cadena.charAt(i));
		}	
	}
}
