
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta cuentaDavid = new Cuenta();
		
		cuentaDavid.saldo = 300;		
		cuentaDavid.depositar(200);
		
		System.out.println(cuentaDavid.saldo);
		
		cuentaDavid.retirar(100);
		System.out.println(cuentaDavid.saldo);
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);
		
		if (cuentaJimena.trasnferir(400, cuentaDavid)) {
			System.out.println("Transferencia exitosa");
		}
		
		System.out.println(cuentaDavid.saldo);
		System.out.println(cuentaJimena.saldo);

	}

}