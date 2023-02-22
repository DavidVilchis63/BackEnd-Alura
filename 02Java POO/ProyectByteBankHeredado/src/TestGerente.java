
public class TestGerente {
	
	public static void main(String[] args) {

		Gerente gerente02 = new Gerente();
		gerente02.setSalario(5000);
		gerente02.setTipo(1);
		gerente02.setClave("Alura");
		
		System.out.println(gerente02.getSalario());
		System.out.println(gerente02.getBonificacion());
		System.out.println(gerente02.iniciarSesion("Alura"));
	}

}
