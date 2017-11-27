import java.util.Scanner;
public class Ecuacion {
	public static void main (String [] args){
		System.out.printf ("Intruduzca los valores de a, b , c :");
		Scanner sc= new Scanner(System.in);
		double a = sc.nextDouble() , b = sc.nextDouble () , c = sc.nextDouble ();
		System.out.printf ("Intruduzca los valores de d, e , f :");
		double d = sc.nextDouble() , e = sc.nextDouble () , f = sc.nextDouble ();
		sc.close();
	
			if (!comprobarSiTieneSolucion.tieneSolucion(a,b,d,e))
				System.out.printf ("El valor de X es: %f %nEl valor de y es: %f",ValorDeX.valorX(a,b,c,d,e,f),ValorDeY.valorY(a,b,c,d,e,f));
				else {
					System.out.printf ("El sistema no tiene solucion");
					}
		}
	}
