
public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion control01 = new ControlBonificacion();
		
		control01.registraSalario(diego);
		control01.registraSalario(jimena);
		control01.registraSalario(alexis);
	}
}
