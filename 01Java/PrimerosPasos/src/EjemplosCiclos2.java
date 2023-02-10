
public class EjemplosCiclos2 {
	public static void main(String[] args) {

		int contador = 0;
		int total =0; //Si se declara dentro del while siempre se inicia de 0

		while (contador <= 10) {
			System.out.println(contador);
			total = total + contador;
			contador++;

		}
		
		System.out.println(total);
	}

}
