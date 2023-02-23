
public class TestReferencias {

	public static void main(String[] args) {
		Funcionario usuario01 = new Funcionario();
		usuario01.setNombre("Diego");
		
		Gerente usuario02 = new Gerente();
		usuario02.setNombre("Jimena");
		
		usuario01.setSalario(2000);
		usuario02.setSalario(10000);
		
		usuario02.iniciarSesion("dsa");
		
	}
}
