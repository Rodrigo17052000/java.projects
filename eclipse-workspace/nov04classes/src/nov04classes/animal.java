package nov04classes;

class animal {
	
	public void somAnimal() { //Método para produzir som animal
		System.out.println("O animal faz um som");
	}

}

class Porco extends Animal { // Classe Porco que herda de Animal
	
	@Override
	public void somAnimal() {
		System.out.println("O Porco faz: oink oink");
	}
}

class Cao extends Animal { // Classe Cao herda de animal
	
	@override
	public void somAnimal() {
		System.out.println("O Cao faz: au au");
	}
}
