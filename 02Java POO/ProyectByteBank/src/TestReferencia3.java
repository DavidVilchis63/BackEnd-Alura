
public class TestReferencia3 {
	
	public static void main(String[] args) {
		
		Cuenta cuentaUsuario2 = new Cuenta();
		//Cliente usuario2 = new Cliente();
		cuentaUsuario2.titular = new Cliente();
		cuentaUsuario2.titular.nombre = "Diego";
		
		System.out.println(cuentaUsuario2.titular.nombre);
	}

}
