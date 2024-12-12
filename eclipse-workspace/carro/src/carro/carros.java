package carro;


public class carros {
	int potencia; // Potência do carro
	int velocidade; // Velocidade do carro
	final String nome; // Nome do carro
	
	// Construtor
	public carros(String nome, int potencia, int velocidade) {
		this.nome = nome; // 'this.nome' refere-se ao atributo da instância de classe, enquanto 'nome' é o parâmetro do construtor
		this.potencia = potencia;
		this.velocidade = velocidade; // Inicializaa a velocidade em 0
	}
	
	void acelerar() { // Aumenta a velocidade do carro
		velocidade += potencia;
	}
	
	void travar() { // Reduz a velocidade do carro pela metade
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() { // Retorna a velocidade atual do carro
		return velocidade;
	}
	
	void imprimir() { // Exibe o nome e a velocidade do carro
		System.out.println("O carro " + nome + " está à velocidade de " + getVelocidade() + " km/h.");
	}
}
