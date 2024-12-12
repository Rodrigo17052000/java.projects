package projetoRedes;

public class main {
	public static void main(String[]args) {
		login_registo user1 = new login_registo("Julintralha@sapo.pt", "julinho", "tralhinha123");
		login_registo user2 = new login_registo("afonsohenrriques.@hotmail.com", "reiDelas", "gueto123");
		login_registo user3 = new login_registo("loveyou@gmail.com", "She/it", "iloveyou");
		
		user1.email();
		user2.email();
		user3.email();
		
		user1.user();
		user2.user();
		user3.user();
		
		user1.password();
		user2.password();
		user3.password();
		
	}
	
	
}
