package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CalculadoraTest {
	
		
		private Calculadora calculadora = new Calculadora();

	    @Test
	    public void testSubtraInteiros() {
	        assertEquals(4, calculadora.subtraInteiros(6, 2));
	    }

	    @Test
	    public void testMultiplicaInteiros() {
	        assertEquals(15, calculadora.multiplicaInteiros(3, 5));
	    }

	    @Test
	    public void testDividiInteiros() {
	        assertEquals(3, calculadora.dividiInteiros(9, 3));
	    }

	    @Test
	    public void testDividiInteirosPorZero() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            calculadora.dividiInteiros(10, 0);
	        });
	    }

		@Test
		void doisSomaDoisEsperaQuatro() {
			assertEquals(4, calculadora.SomaInteiros(2, 2));
		}
		
		@Test
		void tresSomaSeteEsperaDez() {
			assertTrue(calculadora.SomaInteiros(3, 7)==10);
			
		}
	

}
