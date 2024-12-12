package nov10classes;

// Classe responsavel por registar acoes que resultam na atribuicao de pontos a um utilizador
public class RegistoPontos {
	
	// Instancia de CalculadoraBonus para calcular os bonos associados as acoes
	private CalculadoraBonus bonus;
	
	// Construtor que recebe uma instancia de CalculadoraBonus para inicializar o objeto
	public RegistoPontos(CalculadoraBonus cb) {
		this.bonus = cb;
	}
	
	// Metodo para registar a acao de fazer um comentario
	// Adiciona pontos ao utilizador com base num multiplicador de bonus
	public void fazerComentario(Utilizador u) {
		int multiplicador = bonus.bonus(u); // Calcula o multiplicador de bonus
		u.adicionarPontos(3 * multiplicador); // Adiciona pontos multiplicados ao utilizador
	}
	
	// Metodo para registar a acao de criar um topico
	// Adiciona mais pontos devido á importancia de criar novos topicos
	public void criarTopico(Utilizador u) {
		int multiplicador = bonus.bonus(u); // Calcula o multiplicador de bonus
		u.adicionarPontos(5 * multiplicador); // Adiciona pontos multiplicados ao utilizador
	}
	
	// Metodo para registar a acao de dar "like"
	// Adiciona uma pequena quantidade de pontos ao utilizador
	public void darlike(Utilizador u) {
		int multiplicador = bonus.bonus(u); // Calcula o multiplicador de bonus
		u.adicionarPontos(1 * multiplicador); // Adiciona pontos multiplicados ao utilizador
	}

}
