package nov10classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class somaTest extends soma {

	@Test
	void testSoma() {
		soma s = new soma();
		int resultado = s.somar(3, 5);
		assertEquals(8, resultado, "A soma de 3 e 5 deve ser 8");
	}

}
