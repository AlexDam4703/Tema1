public class EjercicioString {
	public static void main (String [] args){
		
		String cadena  = "Cadena";
		String cadena2 = "cadena";
		String cadena3 = "CADENA EN MINUSCULA"; 
		boolean contiene = cadena.contains("Ca");
		boolean termina = cadena.endsWith ("na");
		boolean comparar = cadena.equalsIgnoreCase (cadena2);
		boolean longitud = cadena.isEmpty ();
		boolean comienzaPor = cadena.startsWith ("Cad");
		char ContieneEnLaPosicion = cadena.charAt(2);
		int tamaño = cadena.length ();
		String cambioCadena = cadena2.replace ("CadenA","Cambio cadena");
		String cambioMayuscula = cadena2.toUpperCase ();
		String cambioMinuscula = cadena3.toLowerCase ();
		String subParteCadena = cadena3.substring (2);
		System.out.printf ("¿La cadena %s contiene el caracter %s?: %b%n ",cadena , "Ca",contiene); 
		System.out.printf ("¿La cadena %s contiene termina en el caracter %s?: %b%n" ,cadena,"na",termina);
		System.out.printf ("%s ¿es igual a: %s?: %b%n",cadena,cadena2,comparar);
		System.out.printf ("¿Longitud de %s es 0 ?: %b%n",cadena,longitud);
		System.out.printf ("¿%s empieza por %s?: %b%n",cadena,"Cad",comienzaPor);
		System.out.printf ("En la posicion 2 el string %s contiene el caracter: %c (hay que tener %nencuenta que comienza desde la posicion 0)%n",cadena,ContieneEnLaPosicion);
		System.out.printf ("La longitud de %s es: %d%n",cadena,tamaño);
		System.out.printf ("Remplazar una cadena existente por otra, asi pues cambiamos %s por %s%n",cadena2,cambioCadena);
		System.out.printf ("Poniendo el String %s en mayuscula tal que : %s%n",cadena2,cambioMayuscula);
		System.out.printf ("Poniendo el String %s en minuscula tal que: %s%n",cadena3,cambioMinuscula);
		System.out.printf ("Escribir una subparte con 2 posiciones menos de %s: %s",cadena3,subParteCadena);
		}
	}
	
