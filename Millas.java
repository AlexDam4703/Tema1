public class Millas{
	public static void main ( String args []){
		double millas= 10;
		final double MILLAS_POR_KILOMETRO = 1609; // "final" se usa para declararla como una cosntante.
		double kilometros;
		kilometros = millas * MILLAS_POR_KILOMETRO;
		System.out.println (millas + " millas en kilometros son: " + kilometros);

	}

}
