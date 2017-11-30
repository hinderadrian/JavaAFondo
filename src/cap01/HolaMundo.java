package cap01;

import java.util.Scanner;

public class HolaMundo {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		
		//Mensaje para el usuario
		System.out.println("Ingrese el nombre, edad y la altura separados con un espacio");
		
		//Leemos el nombre
		String nom = scanner.next();
		
		//Leemos la edad
		int edad = scanner.nextInt();
		
		//Leemos la altura
		double altura = scanner.nextDouble();
		
		//Mostramos los datos por consola
		System.out.println("Nombre: "+nom
				+" Edad: "+edad
				+" Altura: "+altura);
	}
}
