/**
* Esta clase define objetos que contienen
* un atributo denominado n ́umero
* y posee un m ́etodo para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/

public class Numeros{
private int numero; //propiedad de los objetos.
/**
* Constructor: es un m ́etodo que tiene
* el mismo nombre que la clase y se
* usa para crear objetos
* @param n par ́ametro para inicializar el objeto
* se usa para inicializar los objetos
* de tipo n ́umero
*/
public Numeros(int n){
this.numero=n;
}
/**
* m ́etodo que devuelve el valor doble
* @return el valor doble del atributo
* numero de dicho objeto.
*/
public int doble(){
return this.numero*2;
}
}
class TestNumeros {
public static void main(String[] arg){
//Creo uno objeto de tipo N ́umero
Numeros n1 = new Numeros(4);
//Imprimo su valor doble
System.out.println("Valor doble: "+n1.doble());
}
}
//clase para comprobar el funcionamiento de la
//clase anterior

