package nov10classes;

import javax.swing.*;
import java.awt.*;

public class Exemplotexto extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; // Convertendo Graphics para Graphics2D para melhores recursos
		
		// Definir a cor para o texto
		g2d.setColor(Color.BLACK);
		
		// Desenhar texto simples
		g2d.setFont(new Font("Serif", Font.PLAIN, 24)); // Define a fonte (nome, estilo, tamanho)
		g2d.drawString("Texto em simples", 50, 50); // Desenha o texto na posiçao (50, 50)
		
		// Texto em negrito
		g2d.setFont(new Font("Serif", Font.BOLD, 24));
		g2d.drawString("Texto em negrito", 50, 100); // Desenha o texto
		
		// Texto em italico
		g2d.setFont(new Font("Serif", Font.ITALIC, 24));
		g2d.drawString("Texto em italico", 50, 150); // Desenha o texto
		
		// Texto em negrito e italico
		g2d.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		g2d.drawString("Texto em negrito e italico", 50, 200);
		
		// Usando uma fonte sans-serif
		g2d.setFont(new Font("SansSerif", Font.PLAIN , 24));
		g2d.drawString("Texto com SansSerif", 50, 340);
		
		// Texto com fundo colorido
		g2d.setColor(Color.WHITE); // cor  do fundo do texto
		g2d.fillRect(50,  300,  300,  50); // Desenha um retangulo colorido como fundo do texto
		g2d.setColor(Color.RED);
		g2d.setFont(new Font("Arial", Font.PLAIN, 24));
		g2d.drawString("Texto com fundo vermelho", 50, 340);
		
		// Textro com contoro (usado Stroke)
		g2d.setColor(Color.YELLOW);
		g2d.setFont(new Font("Arial", Font.BOLD, 30));
		g2d.drawString("Texto com contorno", 50, 400);
		g2d.setStroke(new BasicStroke(2)); // define a espessura do contorno
		g2d.setColor(Color.RED);
		g2d.drawString("Texto do contorno", 50, 400);
		}
	
	public static void main(String[] args) {
		// Criando a janela para exibir o texto
		JFrame frame = new JFrame("Exemplo de Texto e Fontes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
		frame.setSize(400, 500); // Define o tamanho da janela
				
		// Adiciona o painel de desenho à janela
		Exemplotexto painel = new Exemplotexto(); // Cria a instância do painel
		frame.add(painel); // Adiciona o painel ao frame
			
		// Torna a janela visível
		frame.setVisible(true);
		
	}
}		
		