package cap01;

public class Cadenas2 {

	public static void main(String[] args)
	{
		String s = "Esto es una cadena de caracteres";
		
		//Retorna la posición de la primera ocurrencia de un caracter dentro del String
		int pos1 = s.indexOf('C');
		//Retorna la posición de la última ocurrencia de un caracter dentro del String
		int pos2 = s.lastIndexOf('C');
		int pos3 = s.indexOf('X');
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
	}

}
