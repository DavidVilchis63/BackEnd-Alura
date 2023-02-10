
public class Scope {
	public static void main(String[] args) {
		System.out.println("Hola mundo");

		int edad = 18;
		int cantidadPersonas = 2;
		boolean dosPersonas = cantidadPersonas > 1;
		
		System.out.println("Valor de condicion: " + dosPersonas);

		// Conditional or ||
		// Conditional and &&
		if (edad >= 18 && dosPersonas) {
			System.out.println("Cumplio condicional");
			System.out.println("Bienvenido");
		}

		else {
			System.out.println("Condicion no cumplida");

	}
		
}
}