package nov10classes;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath; // Importa a classe GeneralPath para desenhar formas mais complexas

public class FormasLivresExemplo extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Limpa a área de desenho de começar a desenhar
		
		// Desenho de uma linha reta
		g.setColor(Color.BLACK); // Define a cor da linha como preta
		g.drawLine(10,  10,  200,  50); // Desenha uma linha do ponto (10, 10) até (200, 50)
		
		// Desenho de um polígno (forma livre com vários pontos)
		int[] xPoints = {50, 100, 150, 200, 250}; // Coordenadas X dos pontos do polígno
		int[] yPoints = {100, 50, 150, 50, 100}; // Coordenadas Y dos pontos do polígno
		int nPoints = 5; // Número de pontos que formam o polígono
		g.setColor(Color.BLUE); // Define a cor do poligono azul
		g.drawPolygon(xPoints, yPoints, nPoints); // Desenha o poligono com os pontos definidos
		
		// Desenho de um poligono preenchido (com cor)
		int[] xPoints2 = {300, 350, 400, 350}; // Coordenadas X para o novo polígono
		int[] yPoints2 = {150, 100, 150, 200}; // Coordenadas Y para o novo poligono
		g.setColor(Color.ORANGE); // Define a cor de preenchimento como larnja
		g.fillPolygon(xPoints2, yPoints2, 4); // Desenha a preenche o poligono com 4 pontos
		
		// Desenho de uma curva de bézier (usando Graphics2D)
		Graphics2D g2d = (Graphics2D) g; // Define a espessura da linha como 2 pixels
		
		g2d.setColor(Color.RED);
		g2d.setStroke(new BasicStroke(2)); // Define a espessura da linha como 2 pixeis
		
		// Desenho de um arco (parte de uma curva circular)
		g2d.drawArc(100,  200,  150,  100,  0,  180); // Desenha um arco (circular) com o canto superior esquerdo em (100, 200), largura 150, altura 100, e ângulo de 0 a 180 graus
		
		// Desenho de uma curva de Bézier cúbica com GeneralPath
		g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(1));
		
		// Criando uma forma arbitraria usando GeneralPath
		GeneralPath path = new GeneralPath(); // Criar um novo caminho
		path.moveTo(50,  300); // Move o "ponteiro" do caminho para o ponto inicial (50, 300)
		path.curveTo(100,  250,  150, 350, 200,  300);
		path.lineTo(250, 350);
		path.closePath();
		
		g2d.draw(path);
	
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Exemplo de Formas Livres");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		
		FormasLivresExemplo painel = new FormasLivresExemplo();
		frame.add(painel);
		
		frame.setVisible(true);
	}
	

}
