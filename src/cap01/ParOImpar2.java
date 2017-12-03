package cap01;

import java.util.Scanner;

public class ParOImpar2 {

	private static Scanner scanner;
	
	public static void main (String[] args) {
		// TODO Auto-generated method stud
		scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		//Obtenemos el resto de dividir v por 2
		int resto = v % 2;
		
		// Utilizamos un if in-line para saber si es par o impar
		String mssg = (resto == 0) ? "Es par": "Es impar";
		
		//Mostramos resultado
		System.out.println(v+" "+mssg);
	}
	
}
