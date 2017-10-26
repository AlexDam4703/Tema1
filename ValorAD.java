public class ValorAD {
	public static void main ( String args []){
			int a = 1;
			double d = 1.0;
			a= 46%9+4*4-2;
			System.out.println ("En el primer caso 46/9=5.111 el resultado es: " + 46/9 +
			"En el segundo claso 46%9+4*4-2=15 el resultado es: " + a + "\n");
			
			//aqui no se inicializa a dado que con la operacion se le da un nuevo valor.
			a = 45+43%5*(23*3%2);
			System.out.println ("En el tercer caso 45+43%5*(23*3%2)=48 el resultado es: " + a ); //en caso de igualdad de operadores calculamos de izquierda a derecha.
			
			// tenemos que inicializar a dado que sino cogeria la del calculo anterior.
			a=1;
			a%=3/a+3;
			System.out.println ("En el cuarto caso a%= 3/+3=1 el resultado es: " + a);
			
			d=4+d*d+4;
			System.out.println ("En el quinto caso d=4+d*d+4=9 el resultado es: " +d);
			
			d=1.0; //hay que inicializar d porque el calculo implica d y ha sido modificada en el calculo anterior.
			a=1;
			d+=1.5*3 + (++a);
			System.out.println("En el sexto caso d+=1.5*3=7.5 + (++a) el resultado es: " + d);
			
			d=1.0;
			a=1;
			d-=1.5*3+a++;
			System.out.println ("En el ultimo caso 1.5*3+a++ = 4.5 el resultado es: " +d);
		}
	}
