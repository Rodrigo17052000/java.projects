package rodrigo_java;

public class segunda {
	public static void main(String[] args) {
		// Sysout + Ctrl+space e atalho para o print
		int x = 5;
		System.out.println(x > 3 && x < 10); // retorna true porque 5 é maior que 3 e menor que 10 
		
		// Ctrl + I para corrigir indentaçao
		int x1 = 5;
		System.out.println(x1 > 3 || x1 < 4); // retorna true porque uma das condiçoes é true
	
		int x2 = 5;
		System.out.println(!(x2 > 3 && x2 < 10 ));//retorna false porque ! (not) é usado para reverter o resultado
		// Métodos para string (alguns exemplos)
		// length / comprimento
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("O comprimento da string é: " + txt.length());
		// toUpperCase e tolowerCase / maiúscula / minúscula
		String txt1 = "Olá Mundo";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt.toLowerCase());
		// indexOF / índice
		String txt2 = "Qual o índice (primeira posição) de cão?";
		System.out.println(txt2.indexOf("cão"));
		// concatenação com +
		String nome = "João";
		String apelido = "Domingos";
		System.out.println(nome + " " + apelido);
		// concatenaçao com concat
		String marca ="Renault";
		String modelo = "Clio";
		System.out.println(marca.concat(modelo));
		// números entre aspas são strings
		String y = "10";
		String w = "20";
		String z = y + w;
		System.out.println(z);
		//usaar \ como caractere de ecape
		String txt3 = "Modo de colocar \" aspas \" dentro de aspas. ";
		System.out.println(txt3);
		 // Sequencias de escape para new line
		 String txt4 = "Nova\nlinha";
		// Sequência de escape para carriage return;
			String txt5 = "Retorno\rde carro";
			System.out.println(txt5);
			// Tabulação / Avanço
			String txt6 = "Aqui entra\tum tab";
			System.out.println(txt6);
			
			System.out.println(Math.max(5, 10)); // Valor máximo
			System.out.println(Math.min(5, 10)); // Valor mínimo
			System.out.println(Math.sqrt(64)); // Raiz quadrada
			System.out.println(Math.abs(-4.7)); // Valor absoluto
			int randomNum = (int)(Math.random()* 101); // números aleatorios 0 a 100
			
			System.out.println(randomNum);
			// instruçao codicional if
			int x3 = 20;
			int y3 = 18;
			if (x3 > y3) {
				System.out.println("x3 é maior do que y3");
			}
	
		// condicional else
		int hora = 20 ;
		if (hora < 18) {
		System.out.println("Bom dia.");
		
		} else {
			System.out.println("Boa tarde.");
		}
	}
}
	
	