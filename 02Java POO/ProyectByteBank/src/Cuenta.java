
public class Cuenta {
	
	private double saldo;
	private int agencia;
	int numero;
	private Cliente titular = new Cliente();
	
	public Cuenta() {
		System.out.println("Aqui se crea nueva cuenta");
	}
	
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
	
	public double getSaldo() {
		return this.saldo;
		
	}
		
	public void setAgencia(int agencia) {
		
		if(agencia > 0) {
			this.agencia = agencia;			
		}
		else {
			System.out.println("No esta permitido valores negativos");
		}
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
