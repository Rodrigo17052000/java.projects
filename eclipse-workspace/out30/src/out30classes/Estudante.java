package out30classes;

// Definicao da classe estudante que herda da superclasse Pessoa
class Estudante extends Pessoa {
	
	// atributo privado, acessivel apenas dentro da classe Estudante
	private int anoFormacao = 2018; // Ano em que o estudante começou 
	
	// Metodo main, ponto de entrega da aplicaçao
	public static void main(String[] args) {
		
		// Criaçao de uma instancia da classe Estudante
		Estudante meu0bj = new Estudante();
		
		// Impressao dos atributos da classe Estudante (herdados da classe Pessoa)
		System.out.println("Nome: " + meu0bj.nome + " " + meu0bj.apelido);
		System.out.println("Email: " + meu0bj.email);
		System.out.println("Idade: " + meu0bj.idade);
		System.out.println("Ano de fformaçao: " + meu0bj.anoFormacao);
}

}
