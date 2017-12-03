package cap01;

import java.util.Scanner;

public class ParOImpar {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		//Obtenemos el resto de dividir por 2
		int resto = v % 2;
		
		//Verificamos si es par o impar
		if (resto == 0)
		{
			System.out.println("El valor "+v+" es par :D.");
		}
		else
		{
			System.out.println("El valor "+v+" es impar :(.");
		}
	}

}
