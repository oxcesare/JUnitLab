import junit.framework.TestCase;


//metodo
//planear pruebas
//implementar pruebas
//Equilatero, Isosceles, Escaleno, No es un Triangulo


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
		Triangulo t = null;
		//assertFalse(t.esValido());
		
		t = new Triangulo(-5,3,7);
		assertFalse(t.esValido());
		
		t = new Triangulo(3,5,7);
		assertTrue(t.esValido());
		
	}
	
	public void testSatisfaceDesigualdad(){
		Triangulo t = null;
		
		t = new Triangulo(10,5,2);
		assertFalse(t.satisfaceDesigualdad());
		
		t = new Triangulo(5,15,2);
		assertFalse(t.satisfaceDesigualdad());
		
		t = new Triangulo(3,4,7);
		assertFalse(t.satisfaceDesigualdad());
		
		t = new Triangulo(5,6,3);
		assertTrue(t.satisfaceDesigualdad());
	}
	
	public void tipo(){
		Triangulo t = null;
		
		t = new Triangulo (5,5,5);
		assertEquals(1,t.queTipoTrianguloEs(5,5,5));

		
		t = new Triangulo (5,5,1);
		assertEquals(1,t.queTipoTrianguloEs(5,5,7));
		
		
		t = new Triangulo(5,7,12);
		assertEquals(1,t.queTipoTrianguloEs(5,7,12));
				
	}
	
	

}

