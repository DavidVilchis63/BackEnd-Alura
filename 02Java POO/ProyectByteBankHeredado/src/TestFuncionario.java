
public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setDocumento("1123213");
		diego.setNombre("Diego");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
		
	}
}
