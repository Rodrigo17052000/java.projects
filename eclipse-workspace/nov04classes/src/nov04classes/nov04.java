package nov04classes;
import java.util.Scanner; // importa a classe Scanner (permite input do utilizador) do packege java.until . Para importar todo o package seria import java.until.*;


public class nov04 {
	
	class Importar {
		public static void main(String[] args) {
			java.util.Scanner meuObj = new Scanner(System.in);
			String nome;
			
			System.out.println("Escreva o nome e pressione Enter");
			nome = meuObj.nextLine();
			
			System.out.println("Bom dia " + nome);
			
			meuObj.close(); // fecha
		}
	}

}
