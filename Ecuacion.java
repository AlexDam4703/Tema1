import java.util.Scanner;
public class Ecuacion {
	public static void main (String [] args){
		System.out.printf ("Intruduzca los valores de a, b , c :");
		Scanner sc= new Scanner(System.in);
		double a = sc.nextInt() , b = sc.nextInt () , c = sc.nextInt ();
		System.out.printf ("Intruduzca los valores de d, e , f :");
		double d = sc.nextInt() , e = sc.nextInt () , f = sc.nextInt ();
		sc.close();
		if (tieneSolucion(a,b,c,d,e,f)){
			System.out.printf ("El sistema no tiene solucion");
			}
			else {
				System.out.printf ("el valor de X es: %.3f %nEl valor de Y es: %.3f %n",valorX(a,b,c,d,e,f),valorY(a,b,c,d,e,f));
			}
		}
	public static boolean tieneSolucion (double a, double b, double c, double d, double e, double f){
		boolean resoluble = false;
		if (a*e-b*d == 0)
		resoluble = true;
		return resoluble;
		}
	public static double valorX (double a, double b, double c, double d, double e, double f){
		double valorX = (c*e-b*f)/(a*e-b*d);
		return valorX;
		}
	public static double valorY (double a, double b, double c, double d, double e, double f){
		double valorY = (a*f-c*d)/(a*e-b*d);
		return valorY;
		}
	}
