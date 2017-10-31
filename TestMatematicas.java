public class TestMatematicas {
	public static void main (String [] args){
	int numero= 15;
	boolean resultado = Matematicas.esPar(numero);
	boolean resultadoTres = Matematicas.esDivisiblePorTres(numero);
	boolean resultadoCinco = Matematicas.esDivisiblePorCinco(numero);
	System.out.println ("El numero " +numero + "¿Es par? : " + resultado);
	System.out.println ("El numero " +numero + "¿Es dividible entre tres? : " + resultadoTres);
	System.out.println ("El numero " +numero + "¿Es divisible entre cienco? : " + resultadoCinco);
}
 }
