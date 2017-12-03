package cap01;

import java.util.Scanner;

public class DemoSwitch {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un día de la semana (número): ");
		int v = scanner.nextInt();
		
		String dia;
		
		switch (v)
		{
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miércoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Día incorrecto... El valor debe estar entre 1 y 7.";
			break;
		}
		
		System.out.println(dia);
	}

}
