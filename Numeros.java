public class Numeros {
	public static void main (String [] args){
		imprimeUnoDiez();
		imprimeSerie5();
		imprimeSerie2 ();
		System.out.printf ("%n===========================%nLa suma de los N numeros es de: %d%n======================%n",sumaNumeros(3));
		System.out.printf ("%n===========================%nLa suma de los cuadrados de N numeros es de: %d%n======================%n",cuadradoNumeros(3));
		System.out.printf ("%n===========================%nLa suma de los N numeros pares es de: %d%n======================%n",sumaPares(10));
		System.out.printf ("%n===========================%nLa suma de los N numeros impares es de: %d%n======================%n",sumaImpar(10));

		}
	public static void imprimeUnoDiez() {
		System.out.printf ("================================%n");
		for(int i=1; i<=10;i++){
			System.out.printf ("%n%d%n",i);
			}
		System.out.printf (" %n================================%n");
		}
	public static void imprimeSerie5 (){
		System.out.printf ("%n================================%n");
		for (int i=20;i<=80;i+=5){
			System.out.printf ("%d, ",i);
			}
		System.out.printf ("%n================================%n");
		}
	public static void imprimeSerie2 (){
		System.out.printf ("%n================================%n");
		for (int i=100;i>=50;i-=2){
			System.out.printf ("%d, ",i);
			}
		System.out.printf ("%n================================%n");
		}
	public static int sumaNumeros (int numeros){
		int numero=0;
		for(int i=0; i <= numeros; i++){
			numero+=i;
			}
		return numero;
		}
	public static int cuadradoNumeros (int numeros){
		int numero=0;
		for(int i=0; i <= numeros; i++){
			numero+=i*i;
			}
		return numero;
		}
	public static int sumaPares (int numeros){
		int numero =0;
		for (int i=0; i<=numeros;i++){
			if(i%2==0)
				numero+=i;
			}
		return numero;
		}
	public static int sumaImpar (int numeros){
		int numero =0;
		for (int i=0; i<=numeros;i++){
			if(i%2!=0)
				numero+=i;
			}
		return numero;
		}
	}
