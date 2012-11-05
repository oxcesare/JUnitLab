import junit.framework.TestCase;


public class TrianguloTest extends TestCase {
	
	public static void main (String ars[]){
		junit.swingui.TestRunner.run(TrianguloTest.class);
	}
	
	public void testConstructor(){
		Triangulo t = new Triangulo(3,5,7);
		
		assertTrue(t.getA()==3);
		assertTrue(t.getB()==5);
		assertTrue(t.getC()==7);
	}
	
	public void testEsValido(){
		Triangulo t = new Triangulo(-5,3,7);
		assertFalse(t.esValido());
	}

}
