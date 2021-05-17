
public class Conta {
	private int numero;
	private String agencia;
	private String dono; 	
	private double saldo;
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", dono=" + dono + ", saldo=" + saldo + "]";
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;

		} else {
			System.out.println("saldo insuficiente");
		}

	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void exibirSaldo() {
		System.out.println("O seu saldo é :" + saldo);
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		
	}

}
