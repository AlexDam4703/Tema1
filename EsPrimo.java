/**
 * @author Alex.
 * @version 1.0.
 */
public class EsPrimo {
	/**
	 * @param Se le ha de pasar un entero positivo
	 * @return regresa un boolean resultado
	 */
	public static boolean comprobarNumeroPrimo (long Numero) {
		boolean resultado = false;
		for(long i=2;i<Numero;i++){
			resultado = Numero % i == 0;
			if (resultado){
				System.out.println ("El primer dividor es: "+ i);
				resultado = true;
				break;
			}
		}
		
		return !resultado;
	}
}
