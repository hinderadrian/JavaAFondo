package cap01;

public class Cadenas1 {

	public static void main(String[] args)
	{
		String s = "Esto es una cadena de caracteres";
		String sMayus = s.toUpperCase();
		String sMinus = s.toLowerCase();
		
		System.out.println("Original: " + s);
		System.out.println("Mayúsculas: " + sMayus);
		System.out.println("Minúsculas: " + sMinus);
	}

}
