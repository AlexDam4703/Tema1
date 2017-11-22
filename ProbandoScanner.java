import java.util.Scanner;
public class ProbandoScanner {
	public static void main (String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.printf ("Intruduzca su nombre: ");
		String nombre = sc.nextLine();
		System.out.printf ("Hola %s",nombre);
		System.out.printf ("%n====================================%nIntruzca un numero entero de 3 cifras: ");
		String numero = sc.nextLine();
		for(int i=0;i<3;i++){
			System.out.printf ("%s%n",numero.charAt(i));
			}
		

		}
	}
