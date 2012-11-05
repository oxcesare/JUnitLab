
public class Triangulo {
	private int a,b,c;

	//Constructor 
	public Triangulo(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public int getC(){
		return c;
	}
	
	boolean todosPositivos(){
		return a > 0 && b > 0 && c > 0;
	}
	

	public boolean satisfaceDesigualdad(){
		return  (a < (b+c))  && (b < (a+c)) && (c < (b+a));
	}
	
	public boolean esValido(){
		return todosPositivos();
	}
	
	
	public String queTipoTrianguloEs(int a, int b, int c){
		String Cadena="";
		
		if (a == b && b == c && a == c) {
			
			  Cadena="Equilatero";
		}
				
		if (a == b || b == c || a == c )
		{
		   Cadena="Isosceles";
		}
		
		if (a != b && b != c && a != c)
		{
		   Cadena="Escaleno";
		}
		
		if (a != b || b != c || a != c)
		{
		   Cadena="No es un Triangulo";
		}
		
			
		return Cadena;
		
	}
	
}
