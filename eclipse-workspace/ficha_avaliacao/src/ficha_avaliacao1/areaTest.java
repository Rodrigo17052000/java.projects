package ficha_avaliacao1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class areaTest extends area {

	@Test
	void test() {
		area a = new area();
		int resultado = a.areas(2 * 2);
		assertEquals(4, resultado, "A area do quadrado deveria ser 4");
		
	}

}
