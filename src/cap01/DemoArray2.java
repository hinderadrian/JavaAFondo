package cap01;
import java.util.Scanner;

public class DemoArray2 {

	private static Scanner scanner;
	
	public static void main (String[] args)
	{
		String dias[] = {"Lunes","Martes","Mi�rcoles","Jueves","Viernes","S�bado","Domingo"};
		scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un d�a de la semana (n�mero): ");
		int v = scanner.nextInt();
		
		if (v <= dias.length)
		{
			System.out.println(dias[v - 1]);
		}
		else
		{
			System.out.println("D�a incorrecto...");
		}
	}
}
