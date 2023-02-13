
public class CrearCuenta {
	
	public static void main(String[] args) {
		
		//Variable           = Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 400;
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 400;
		
		System.out.println(segundaCuenta.saldo);
		//System.out.println(primeraCuenta.titular);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}
		else {
			System.out.println("Son diferentes");
		}
		
		if (primeraCuenta.saldo == segundaCuenta.saldo) {
			System.out.println("Son el mismo valor");
		}
		else {
			System.out.println("Son diferentes");
		}
	}

}
