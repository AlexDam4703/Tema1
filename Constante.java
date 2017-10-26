
public class Constante {
	//public static final COSTANTE = 18; aqui tmb se puede declarar las constantes pero deben tener "public static"
	public static void main (String args[]) {
			int variable =18;
			final int CONSTANTE = 18; // "final" tiene que ir delante si no genera un error 
			
			System.out.println ("Variable: " + variable);
			System.out.println  ("Constante: " + CONSTANTE);
			
			//modificamos valores;
			variable ++;
			//CONSTANTE ++ es una costante declarada y no puede variar
			System.out.println ("Variable: " + variable);
			System.out.println  ("Constante: " + CONSTANTE);
	}
}

