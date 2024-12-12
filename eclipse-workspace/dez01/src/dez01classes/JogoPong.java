package dez01classes;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
public class JogoPong extends JPanel implements ActionListener{
	// Defenuções de tamanho da tela, paddles e bola
	private static final int LARGURA = 800, ALTURA = 600;
	private static final int LARGURA_PADDLE = 20, ALTURA_PADDLE = 100;
	private static final int TAMANHO_BOLA = 20;
	// Posições inicias da bola e movimentos
	private int bolaX = LARGURA / 2, bolaY = ALTURA / 2;
	private int bolaDX = -5, bolaDY = 5; // Direção da bola (movimeneto); DX E DY é convenção comum em programação para descrever mudanças (ou deslocamento) em coordenadas espaciais
	private int pontuacaoJogador1 = 0, pontuacaoJogador2 = 0;
	// Posições das barras (paddles) dos jogadores
	private int jogador1Y = ALTURA / 2 - ALTURA_PADDLE / 2;
	private int jogador2Y = ALTURA / 2 - ALTURA_PADDLE / 2;
	// Velocidade de movimento das barras dos jogadores
	private int jogador1DY = 0, jogador2DY = 0;
	// Timer para atualização da yela (60 FPS)
	private Timer timer;
	// Construtor da classe Pong Game
	public JogoPong() {
		// Define o tamanho do painel e a cor de fundo
		setPreferredSize(new Dimension(LARGURA, ALTURA));
		setBackground(Color.BLACK);
		// Permite que o painel tenha foco para capturar eventos de teclado
		setFocusable(true);
		// Adiciona os listeners para as teclas de movimento
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// Controle do jogador 1 com as teclas W e S
				if (e.getKeyCode() == KeyEvent.VK_W) {
					jogador1DY = -5; // Move para cima
				} else if (e.getKeyCode() == KeyEvent.VK_S) {
					jogador1DY = 5; // Move para baixo
				}
				// Controle do jogador 2 com as teclas da seta
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					jogador2DY = -5; // Move para cima
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					jogador2DY = 5; // Move para baixo
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// Quando a tecla é solta, parar o movimento
				if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
					jogador1DY = 0;
				}
				if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
					jogador2DY = 0;
				}
			}
		});
		// Incializa o timer para atualizar a tela a 60 FPS
		timer = new Timer(1000 / 60, this); // 60 quadros por segundo
		timer.start();
	}
	// Método chamado a cada ciclo do timer (60 FPS)
	@Override
	public void actionPerformed(ActionEvent e) {
		// Atualiza a posição da bola e das barras
		moverBola();
		moverPaddles();
		verificarColisoes();
		// Repaint da tela para mostrar as atualizações
		repaint();
	}
 
	// Método para mover a bola
	private void moverBola() {
		// Atualiza a posição da bola com base na direção (velocidade)
		bolaX += bolaDX;
		bolaY += bolaDY;
		// Se a bola sair pela lateral esquerda (ponto para o jogador 2)
		if (bolaX <= 0) {
		    pontuacaoJogador2++;
		    resetBola();
		}
 
		// Se a bola sair pela lateral direita (ponto para o jogador 1)
		if (bolaX >= LARGURA - TAMANHO_BOLA) {
		    pontuacaoJogador1++;
		    resetBola();
		}
		// Colisão com as paredes superior e inferior
		if (bolaY <= 0 || bolaY >= ALTURA - TAMANHO_BOLA) {
			bolaDY = -bolaDY; // Rebater a bola
		}
		// Se a bola sair pelas laterais (esquerda ou direita), reinicia
		if (bolaX <= 0 || bolaX >= LARGURA - TAMANHO_BOLA) {
			bolaX = LARGURA / 2 - TAMANHO_BOLA / 2; // Reinicia a posição no centro
			bolaY = ALTURA / 2 - TAMANHO_BOLA / 2;
			bolaDX = -bolaDX; // Inverte a direção da bola
		}
	}
	private void resetBola() {
	    bolaX = LARGURA / 2 - TAMANHO_BOLA / 2;
	    bolaY = ALTURA / 2 - TAMANHO_BOLA / 2;
	    bolaDX = -bolaDX; // Inverter direção para o próximo ponto
	}
 
	
	// Método para mover as barras dos jogadores
	private void moverPaddles() {
		// Atualiza a posição das barras com base na direção (velocidade)
		jogador1Y += jogador1DY;
		jogador2Y += jogador2DY;
		// Impede que as barras saiam da tela
		if (jogador1Y < 0) jogador1Y = 0;
		if (jogador1Y > ALTURA - ALTURA_PADDLE) jogador1Y = ALTURA - ALTURA_PADDLE;
		if (jogador2Y < 0) jogador2Y = 0;
		if (jogador2Y > ALTURA - ALTURA_PADDLE) jogador2Y = ALTURA - ALTURA_PADDLE;
	}
	// Método para verificar as colisões da bola com as barras
	private void verificarColisoes() {
		// Colisão da bola com a barra do jogador 1
		if (bolaX <= LARGURA_PADDLE && bolaY + TAMANHO_BOLA >= jogador1Y && bolaY <= jogador1Y + ALTURA_PADDLE) {
			bolaDX = -bolaDX; // Rebater a bola
		}
		// Colisão da bola com a barra do jogador 2
		if (bolaX >= LARGURA - LARGURA_PADDLE - TAMANHO_BOLA && bolaY + TAMANHO_BOLA >= jogador2Y && bolaY <= jogador2Y + ALTURA_PADDLE) {
			bolaDX = -bolaDX; // Rebater a bola
		}
	}
	// Método para desenhar os elementos na tela
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Chama o método da superclasse para limpar a tela
		// Desenhar as barras dos jogadores
		g.setColor(Color.WHITE);
		g.fillRect(0, jogador1Y, LARGURA_PADDLE, ALTURA_PADDLE); // Barra do jogador 1 (esquerda)
		g.fillRect(LARGURA - LARGURA_PADDLE, jogador2Y, LARGURA_PADDLE, ALTURA_PADDLE); // Barra do jogador 2 (direita)
		// Desenha a bola
		g.fillRect(bolaX, bolaY, TAMANHO_BOLA, TAMANHO_BOLA);
		// Desenhar a pontuação no topo
	    g.setFont(new Font("Arial", Font.BOLD, 36)); // Configurar fonte
	    g.drawString(String.valueOf(pontuacaoJogador1), LARGURA / 4, 50); // Pontuação do jogador 1
	    g.drawString(String.valueOf(pontuacaoJogador2), 3 * LARGURA / 4, 50); // Pontuação do jogador 2
	}
	// Método principal para inicializar e exibir o jogo
	public static void main(String[] args) {
		// Cria a janela do jogo
		JFrame frame = new JFrame("Jogo Pong");
		JogoPong gamePanel = new JogoPong(); // Cria o painel do jogo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o jogo ao fechar a janela
		frame.add(gamePanel); // Adiciona o painel de jogo à janela
		frame.pack(); // Ajusta o tamanho da janela o tamanho do painel
		frame.setLocationRelativeTo(null); // Centraliza a janela na tela
		frame.setVisible(true); // Torna a janela visível
	}
}
 