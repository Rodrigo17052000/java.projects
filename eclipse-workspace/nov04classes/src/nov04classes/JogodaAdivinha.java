package nov04classes;

import java.util.Random; // Importa a classe Random para gerar números aleatórios
import java.util.Scanner; // Importa a classe Scanner para capturar a entrada do utilizador

public class JogodaAdivinha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura da entrada do utilizador
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios
        
        // O computador escolhe um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório de 0 a 99 e adiciona 1 para obter entre 1 e 100
        int tentativas = 0; // Inicializa o contador de tentativas
        int palpite = 0; // Inicializa a variável palpite
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Adivinhe o número entre 1 e 100:");
        
        // Loop para permitir que o jogador continue a tentar até acertar
        while (palpite != numeroSecreto) {
            System.out.print("Insira o seu palpite: "); // Solicita ao jogador que insira o palpite
            // Lê o palpite do jogador e armazena-o na variável palpite
            palpite = scanner.nextInt(); // O método nextInt() captura um valor inteiro inserido pelo utilizador
            tentativas++; // Incrementa o contador de tentativas
            
            //verifica se o palpite do jogador é menor, maior ou igual ap número secreto
            if (palpite < numeroSecreto) {
            	System.out.println("Muito baixo! Tente novamente."); // Mensagem se o palpite é muito baixo
            } else if (palpite > numeroSecreto) {
            	System.out.println("Muito alto! tente novamente."); // Mensagem se  o palpite for muito alto
            } else {
            	System.out.println("Parabens! Você aceertou o número em " + tentativas + " tentativas."); //Mensagem de sucesso
            }
        }
        scanner.close(); // Fecha o scanner após o termino do jogo
    }
}
