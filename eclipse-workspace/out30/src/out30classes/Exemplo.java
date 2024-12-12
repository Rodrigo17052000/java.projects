package out30classes;

public class Exemplo {
	// esta class vai ser chamada pela class teste
	public int publico;						// Acessivel de qualquer lugar
	int padrao;								// Acessivel apenas dentro do mesmo pacote
	private int privado;					// Acessivel apenas dentro da propria class
	protected int protegido;				// Acessivel dentro da mesma class, pacotes e subclasses
	
	public Exemplo() {
		publico = 1;
		padrao = 2;
		privado = 3;
		protegido = 4;
	}
}
