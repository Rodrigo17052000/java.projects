package out30classes;

// Definiçao da class base (superclasse) Pessoa, que vi ser chamada pela classe Estudante
class Pessoa {
	
	// Atributos da class Pessoa, acessiveis para subclasses e no  subclasses e no mesmo pacote
	protected String nome = "João";
	protected String apelido = "Silva";
	protected String email = "Joaosilva@epb.com";
	protected int idade = 24;
}
