public class CambioMoneda {
static final double CAMBIO_DOLAR=1.88246;
static final double CAMBIO_EURO=0.84520;
	public static void CambioDolaresAEuros ( double euros){
	System.out.println (euros + "€ son: " + euros*CAMBIO_DOLAR + " $");
	}
	public static void CambioDolarAEuros (double Dolares){
	System.out.println (Dolares + "$ son: " + Dolares*CAMBIO_EURO + " €");
}
}

