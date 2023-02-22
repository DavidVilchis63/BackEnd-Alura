
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("1123213");
		diego.setNombre("Diego");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		Funcionario gerente01 = new Funcionario();
		gerente01.setSalario(5000);
		gerente01.setTipo(1);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
		System.out.println(gerente01.getSalario());
		System.out.println(gerente01.getBonificacion());
		
		
	}
}
