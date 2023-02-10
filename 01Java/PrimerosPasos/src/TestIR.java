
public class TestIR {
	
	public static void main(String[] args) {
		
		double salario = 4000.0;
		System.out.println(salario);
		
		
		if (salario >= 1900 && salario <= 2800) {
			System.out.println("Su tasa es de 7%, puede deducir hasta 142");			
		}
		else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Su tasa es de 15%, puede deducir hasta 350");
		}
		else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("Su tasa es de 22.5%, puede deducir hasta 636");
		}
	}

}
