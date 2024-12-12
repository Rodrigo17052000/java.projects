package banco;

import java.util.ArrayList; // importar a classe ArrayList da biblioteca java

/**
 * Classe Banco que representa um banco e gere multiplas contas ativas.
 * Permite registar novas contas, apresenta numeros das contas ativas e obter o saldo total de todas as contas..
 */
public class banco {
	// Cria um ArrayList para armazenar contas ativas
	private ArrayList<ContaCorrente> contasAtivas = new ArrayList<>();
	
	// Metodo para registar uma nova conta no banco
	public void registarConta(ContaCorrente conta) {
		contasAtivas.add(conta); // Adiciona a conta ao ArrayList contasAtivas
	}
	
	// Metodo para apresentar os numeros das contas ativas
	public void apresentarNumerosContas() {
		System.out.println("Contas ativas:");
		
		// 'for-each' para alterar por todas as contas em contasAtivas
		for (ContaCorrente conta : contasAtivas) {
			// A cada iteracao, 'conta' é um objetivo ContaCorrente na lista contasAtivas
			System.out.println("Conta: " + conta.getNumeroConta());
		}
	}
	
	// Metodo para obter o salto total de todas as contas no banco
	public double obterSaldoTotal() {
		double saldoTotal = 0;
		
		// Iterra por todas as contas no ArrayList e soma os saldos
		for (ContaCorrente conta : contasAtivas) {
			saldoTotal += conta.getSaldo();
		}
		return saldoTotal;
	}
}
