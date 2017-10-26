
public class Casting {
	
	public static void main (String args[]) {
		//conversiones implicitas
		int x= 6;
		double y= 23;
		
		y*=x*x; // y= 23 * (6*6)
		System.out.println ("el resultado esperado es 828: " +y);
		
		float z = 24; // se lee como entero de 4 bytes y se guarda como float que tambien son 4 bytes por eso no hace falta ponerle la "f"
		
		z/= x;  // z= z /x
		System.out.println ("el resultado esperado es 4: " + z); 
		
		y = 23; z=24;
		y-= z; // y= y - (z)
		System.out.println ("El resultado esperado es -1.0: " +y);
		
		//Explicito
		x= 6;
		y= 2.0;
		x = (int)y;
		System.out.println ("\nEl resultado esperado es 24: " + x);
		//siempre que la funcion se declara con "x*=x" o expresiones similares la propia maquina virtual hace la conversion de
		//tipos en caso contrario hay que hacer el casting
		x=6;
		y=2.0;
		x=x/ (int)y; 
		System.out.println ("El resultado es: " +x); 
		x=6;
		z= 2f;
		x/=z;
		System.out.println ("El resultado es: " +x);
		
		x=10;
		y= 3;
		//una operacion entre dos entero siempre es un entero a no ser que se le haga una conversion de tipos
		System.out.println ("\nEl resultado es: " + (double)x/y);
		
	}
	
}

