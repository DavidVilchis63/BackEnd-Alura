
public class Caracteres {
	
	public static void main(String[] args) {
		
		// Char solo funciona con comillas simples
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65 + 2;
		System.out.println(caracter);
		
		char segundoCaracter = (char)(caracter +1);
		System.out.println(segundoCaracter);

		String palabra = "Alura cursos Online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}


}
