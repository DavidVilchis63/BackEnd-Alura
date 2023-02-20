
public class PruebaAcceso {

	public static void main(String[] args) {
		Cuenta cuentaUsuario3 = new Cuenta();
		cuentaUsuario3.depositar(400);
		cuentaUsuario3.retirar(300);		
		cuentaUsuario3.setAgencia(22);
		
		System.out.println(cuentaUsuario3.getSaldo());
		System.out.println(cuentaUsuario3.getAgencia());
	}
}
