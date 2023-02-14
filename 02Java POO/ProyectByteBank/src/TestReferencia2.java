
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		Cliente usuario1 = new Cliente();
		usuario1.nombre = "David";
		usuario1.documento = "6336363";
		usuario1.telefono = "552212236";
		
		Cuenta cuentaUsuario1 = new Cuenta();
		cuentaUsuario1.agencia = 1213;		
		cuentaUsuario1.titular = usuario1;
		
		System.out.println(cuentaUsuario1.titular.nombre);
	}

}
