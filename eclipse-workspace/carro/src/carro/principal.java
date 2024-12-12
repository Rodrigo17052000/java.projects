package carro;

public class principal {
	public static void main(String[] args) {
		carros c1 = new carros("Corsa",10,0);
		carros c2 = new carros("Corsa",10,0);
		carros c3 = new carros("Corsa",10,0);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.travar();
		
		c2.acelerar();
		c2.travar();
		
		c3.acelerar();
		
		c1.imprimir();
		c2.imprimir();
		System.out.println("verifique que o valor de c3 não é alterado por c1, apesar de ambos serem Corsa");
		c3.imprimir();
		
	}

}
