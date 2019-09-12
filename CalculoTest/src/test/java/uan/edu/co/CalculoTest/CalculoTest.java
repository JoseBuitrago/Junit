package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculoTest {

	@Test
	public void testSuma() {
		int total = 35;
		int suma =Calculo.suma(10, 25);
		assertEquals (suma, total);
		fail("Not yet implemented");
	}
	
	@Test
	public void testSumaFallida() {
		int total = 15;
		int suma = Calculo.suma(10, 25);
		assertNotSame(suma, total);
	}

}
