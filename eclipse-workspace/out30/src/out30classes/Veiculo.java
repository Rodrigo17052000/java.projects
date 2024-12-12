package out30classes;

final class Veiculo {
	protected String marca = "Ford";
	
	public void buzina() {
		System.out.println("Fom, fom1");
	}
}

// vai dar erro, não pode herdar da classe final Veiculo
class Descapotaveis extends Veiculo {
	private String nomeModelo = "Mustang";
	
	public static void main(String[] args) {
		Descapotaveis meuCarro = new Descapotaveis();
		meuCarro.buzina();
		System.out.println(meuCarro.marca + " " + meuCarro.nomeModelo);
	}
}
