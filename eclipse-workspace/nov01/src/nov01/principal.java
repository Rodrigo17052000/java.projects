package nov01classes;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		// Configura os valores usando os setters
		pessoa.setNome("Rodrigo");
		pessoa.setIdade(25);
		
		// Acede aos valores usando os getters
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}
}

class Pessoa {
	// Variáveis privadas
	private String nome;
	private int idade;
	
	// Getter para nome
	public String getNome() {
		return nome;
	}
	
	// Setter para nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter para idade
	public String getIdade() {
		return idade;
	}
		
	// Setter para idade
	public void setIdade(String idade) {
		this.idade = idade;
	}
}