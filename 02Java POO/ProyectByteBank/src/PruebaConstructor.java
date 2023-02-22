
public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuentaUsuario5 = new Cuenta(8);
		Cuenta cuentaUsuario6 = new Cuenta(9);
		Cuenta cuentaUsuario7 = new Cuenta(10);
		System.out.println(cuentaUsuario5.getAgencia());
		System.out.println(cuentaUsuario6.getAgencia());
		System.out.println(cuentaUsuario7.getAgencia());
		
		System.out.println(Cuenta.getTotal()); 
	}
}
