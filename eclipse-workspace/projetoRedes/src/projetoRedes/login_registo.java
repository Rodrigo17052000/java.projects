package projetoRedes;

public class login_registo {
	String user;
	String password;
	String email;
	
	public login_registo(String email, String user, String password) {
		this.email = email;
		this.user = user;
		this.password = password;
	}
	
	void email() {
		System.out.println("email : " + email);
	}
	
	void user() {
		System.out.println("user : " + user);
	}
	
	void password() {
		System.out.println("password : " + password);
	}
	
}
