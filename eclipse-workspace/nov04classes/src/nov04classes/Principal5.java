package nov04classes;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do utilizador

// Classe principal que executa o programa

public class Principal5 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do utilizador
		
		//Exemplo de compra á vista
		System.out.println("Digite o valor total para compra á vista: ");
		int valorAVista = scanner.nextInt();// Lê um valor total para compra a vista de um utilizador
		Compra compraAVista = new Compra(valorAVista); // Cria um objeto Compra para pagamento a vista
		System.out.println("\nCompra á Vista: ");
		System.out.println("Valor Total: " + compraAVista.getValorTotal()); // Exibe o valor toal da compra á vista
		System.out.println("Numero de Prestacoes: " + getNumeroPrestacoes()); // Exibe o numero de prestacoes
		System.out.println("Valor de Prestacoes: " getValorPrestacao()); // Exibe o valor de cada prestaçao
		
		System.out.println("\n-------------------------------------------------\n"); // Separador visual entre os exemplos
			
		
		// Exemplo de compra a prestacoes
		System.out.println("Digite o valor total para a compra a prestaçoes: ");
		int valorTotalPrestacoes = scanner.nextInt(); // Lê o valor total da compra a prestaçoes
		System.out.println("Digite o numero de prestacoes desajeitado: ");
		int numeroPretacoes = scanner.nextInt(); // Lê o numero de prestacoes desejado
		
		// Cria um obieto Compra para pagamento a prestacoes.
		Compra compraPrestacoes = new Compra(numeroPrestacoes, valorTotalPrestacoes);// Chama o sonstrutor gue calcula o valor total baseado nas prestações
		System.out.println("\nCompra a Prestaçoes:");
		System.out.println("Valor Total:" + compraPrestacoes.getValorTotal());// Exibe o valor total da compra a prestacoes
		System.out.println("Número de Prestaçoes:" + compraPrestacoes.getNumeroPrestacoes()); // Exibe o múmero de prestaçoes
		System.out.println("Valor da Prestaçao: " + compraPrestacoes.getValorPrestacao()); // Exibe o valor de cada prestacão
		scanner.close(); // Fecha o scanner apos o uso para libertar o recurso
	}
	
}
