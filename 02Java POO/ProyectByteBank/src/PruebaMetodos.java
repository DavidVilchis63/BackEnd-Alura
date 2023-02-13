
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta cuentaDavid = new Cuenta();
		
		cuentaDavid.saldo = 300;		
		cuentaDavid.depositar(500);
		
		System.out.println(cuentaDavid.saldo);
		
		cuentaDavid.retirar(100);
		System.out.println(cuentaDavid.saldo);
	}

}
