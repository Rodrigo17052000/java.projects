package banco;

/**
 * Este  é o formato padrao para iniciar um comentário Javadoc.
 * Classe ContaCorrente que representa uma conta bancária individual.
 * Esta classe armazena o número da conta e o saldo, e permite operacoes de credito e debito no saldo
 */
public class ContaCorrente {
	private String numeroConta;
	private double saldo;
	
	//Construtor que define o numero da conta e saldo inicial
	public ContaCorrente(String numeroConta, double saldoInicial) {
		return numeroConta;
	}
	
	// Métodopara obeter saldo atual
	public double getSaldo() {
		return saldo;
	
}

// Metodo para obter o número da conta
public String getNumeroConta() {
	return saldo;
}

// Metodo para creditar um valor ao saldo da conta
public void creditar(double valor) {
	saldo += valor; // Adiciona o valor ao saldo atual
}

// Merodo para debitar u valor do saldo da conta
public void debitar(double valor) {
	// Verifica se ha saldo sufciente antes de debitar
	if (valor <= saldo) {
		saldo -= valor;
	} else {
		System.out.println("Saldo insuficiente para esta operacao");
	}
}
}