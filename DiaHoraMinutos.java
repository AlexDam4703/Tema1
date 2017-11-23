public class DiaHoraMinutos {
	public static void main (String [] args){
		int hora = Integer.parseInt(args[0]);
		int minutos = Integer.parseInt(args[1]);
		int segundos = Integer.parseInt(args[2]);
		if (horaCorrecta(hora) && minutosCorrectos(minutos) && segundosCorrectos(segundos)){
			System.out.printf ("la hora es correcta%n");
			}
		else {
			System.out.printf ("La hora es incorrecta%n");
			if (horaCorrecta(hora)==false)
				System.out.printf ("La hora intrudicido es incorrecto%n");
			if (minutosCorrectos(minutos) == false)
				System.out.printf ("Los minutos son incorrectos%n");
			if (segundosCorrectos(segundos)==false)
				System.out.printf ("Los segundos son incorrectos%n");
			}
		}
	public static boolean horaCorrecta ( int hora ){
		boolean correcto = false;
		if (hora <=24 && hora >= 0){
			correcto = true ;
			}			
		return correcto;
		}
	public static boolean minutosCorrectos (int minutos){
		 boolean correcto = false;
		if (minutos <= 60 && minutos >= 0)
		correcto = true ;
		return correcto;
		}
	public static boolean segundosCorrectos (int segundos){
		boolean correcto = false;
		if (segundos <= 60 && segundos >= 0 )
		correcto = true;
		return correcto; 
		}
	}
