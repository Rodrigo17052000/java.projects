package nov10classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Classe de teste para RegistoPontos
public class RegistosPontosteste {
	
	private RegistoPontos registoPontos;
	private Utilizador utilizador;
	private CalculadoraBonus calculadoraBonus;

	@BeforeEach
	public void setup() {
		// Inicializa os objetos antes de cada teste
		calculadoraBonus = new CalculadoraBonus();
		registoPontos = new RegistoPontos(calculadoraBonus);
		utilizador = new Utilizador();
		utilizador.setNome("Rodrigo");
		utilizador.setPontos(0);
		utilizador.setVip(false);
	}
	
	
	@Test
	public void testFazerComentarioUtilizadorNormal() {
		// testa se fazer um comentario atribui corretamente os pontos a um utilizador nao Vip
		registoPontos.fazerComentario(utilizador);
		assertEquals(3, utilizador.getPontos(), "O utilizador normal deveria ter 3 pontos apos fazer um comentario. ");
	}
	
	@Test
	public void testCriarTopicoUtilizadornormal() {
		// Teta se criar um topico atribui corretamente os pontos a um utilizador nao VIP
		registoPontos.criarTopico(utilizador);
		assertEquals(5, utilizador.getPontos(), "o utilizador normal deveria ter 5 pontos apos criar um topico. ");
	}
	
	@Test
	public void testDarLikeUtilizadorNormal() {
		// Testa se dar um "like" atribui corretamente os pontos a um utilizador nao vIP
		registoPontos.darlike(utilizador);
		assertEquals(1, utilizador.getPontos(), "O utilizador normal deveria ter 1 ponto apos dar um 'like'.");
	
	}
	
	@Test
	public void testFazerComentarioUtilizadorVip() {
		utilizador.setVip(true);
		registoPontos.criarTopico(utilizador);
		assertEquals(25, utilizador.getPontos(), "O utilizador VIP deveria ter 25 pontos apos criar um topico. ");
	}
	
	@Test
	public void testCriarTopicoUtilizadorVip() {
		// testa se criar um topico atrinui corretamente os pontos a um utilizador vip
		utilizador.setVip(true);
		registoPontos.criarTopico(utilizador);
		assertEquals(25, utilizador.getPontos(), "O utilizador vip deveria ter 25 pontos apos criar um topico. ");
	}

	@Test
	public void testDarLikeUtilizadorVip() {
		// Testa se dar um "like" atribui corretamente os pontos a um utilizador VIP
		utilizador.setVip(true);
		registoPontos.darlike(utilizador);
		assertEquals(5, utilizador.getPontos(), "O utilizador VIP deveria ter 5 pontos apos dar um 'like'.");
		
	}
}
