package banco;

/**
 * Classe PrincipalBanco que contem o metodo principal (main).
 * Cria instancias de ContaCorrente e Banco para testar funcionalidades
 * coo criacao de contas, operacoes de credito e debito, e consulta do saldo total.
 */
public class PrincipalBanco {
	public static void main(String[] args) {
		// Criar contas definir saldos iniciais
		ContaCorrente conta1 = new ContaCorrente("12345", 1000.0);
		ContaCorrente conta2 = new ContaCorrente("67890", 500.0);
		
		// Criar o banc e registrar as contas
		Banco banco = new Banco();
		banco.registarConta(conta1);
		banco.registarConta(conta2);
		
		// Realizar operacoes nas contas 
		conta1.creditar(200.0); // Aumentar o saldo da conta1
		conta2.debitar(100.0); // Reduz o saldo da conta2 (se saldo suficiente)
		
		// Exibir numeros das contas ativas
		banco.apresentarNumerosContas();
		
		// Exibir saldo de cada conta
		System.out.println("Saldo da conta " + conta1.getNumeroConta() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumeroConta() + ": " + conta2.getSaldo());
		
		// Exibir saldo total do banco (soma dos saldos de todas as contas)
		System.out.println("Saldo total do banco: " + banco.obterSaldoTotal());
		
	}

}
