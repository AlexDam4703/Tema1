public class ContarVocales{
	public static void main (String [] args){
		String palabra = args [0].toLowerCase();
		int contador = 0;
		for (int i=0; i<palabra.length(); i++){
			
			 char letras = palabra.charAt(i);
			 if(letras == 'a'|| letras=='e' || letras=='i' || letras=='o' || letras=='u'){
				 contador ++;
				 }
			}
			System.out.println ("La palabra "+palabra+ " contiene " +contador +" vocales");
		}
	}
