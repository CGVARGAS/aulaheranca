package entidade;


public class Conta {
    private int numero;
	private String nome;
	private double saldo;
	public final double taxa=5.00;
	
	
    // Contrutor (sobrecarga)
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	// Construtor
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		/*Encapsulando através do metodo "depositar()", para proteger o construtor 
		 *de futuros alterações na regra de negócios sobre o depósito  
		*/ 
		depositar(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public void sacar(double saque) {
		saldo -= (saque + taxa);	
	}
	
	public String toString() {
		return "\nDados da conta:\n"
				+ "Numero da conta: " 
				+ String.format("%d", numero)
				+ ", Cliente: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f\n", saldo);
	}
	
}
