package nov10classes;

// Atributos responsaveis por calcular os bonos atribuidos a um utilizador
public class CalculadoraBonus {
	
	// Atributo que define o bonus diario padrao
	public int bonusDia = 1;
	
	// Metodo que calcula o multiplicador de bonus com base no estado VIP do utilizador
	public int bonus(Utilizador u) {
		int multiplicador = bonusDia; // Inicializa o multiplicador com o bonus do dia
		if (u.isVip()) { // Se o utilizador dor Vip, multiplica o bonus por 5
			multiplicador *= 5;
		}
		return multiplicador; // Retorna o multiplicador final
	}
}
