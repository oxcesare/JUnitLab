import junit.framework.TestCase;


public class CalculadoraTest extends TestCase {
	public void testSumar(){
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.sumar(10,50);
		assertEquals(60,resultado,0);
	}

}
