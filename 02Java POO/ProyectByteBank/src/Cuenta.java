
public class Cuenta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//No retorna valor
	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	//Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean trasnferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			
			return true;
		}
		return false;
		
		
	}

}
