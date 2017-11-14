/**Fichero.java
 * Ejemplo para verificar un posible numero primo
 * @author Alex.
 * @version 1.0.
 */
public class EsPrimo {
	/**
	 * @param Numero entero positivo que se comprobara 
	 * @return regresa un boolean resultado
	 */
	public static boolean comprobarNumeroPrimo (long Numero) {
		boolean resultado = false;
		for(long i=2;i<=Numero/2;i++){
			resultado = Numero % i == 0;
			if (resultado){
				System.out.println ("El primer dividor es: "+ i);
				break;
			}
		}
		
		return !resultado;
	}
}
