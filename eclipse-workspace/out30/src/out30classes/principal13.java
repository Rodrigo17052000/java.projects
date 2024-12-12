package out30classes;

public class principal13 {
	
	// Método static
	static void meuMetodoStatic() {
		System.out.println("Métodos static podem ser chamados sem criar objetos");
	}
	
	// Método public
	public void meuMetodoPublic() {
		System.out.println("Métodos públicos têm de ser chamados criando objetos");
	}
	
	// Método main
	public static void main(String[] args) {
		meuMetodoStatic(); //Chama o método static
		
		principal13 meuOBJ = new principal13();
		meuOBJ.meuMetodoPublic(); // Chama o método público
	}
 
}
