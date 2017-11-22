public class EjemploConsole{
	public static void main (String [] args){
		System.out.printf ("Intruduza su nombre: ");
		String nombre = System.console().readLine();
		System.out.printf ("%nHola %s%n",nombre);
		
			System.out.printf ("%n==================================%nIntruduza un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		System.out.printf ("%nEl numero es %d%n",numero);
		
		}
	}
