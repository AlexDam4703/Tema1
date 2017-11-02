public class TestGeometria{
	public static void main (String [] args){
		double areaCuadrado = AreaCuadrado.hacerAreaCuadrado (2,2);
		double areaTriangulo = AreaTriangulo.hacerAreaTriangulo (2,2);
		double areaRectangulo = AreaRectangulo.hacerAreaRectangulo (2,2);
		double areaCirculo = AreaCirculo.hacerAreaCirculo (2);
		System.out.println ("El area del cuadrado es: " + areaCuadrado);
		System.out.println ("El area del triangulo es: " + areaTriangulo);
		System.out.println ("El area del Resctangulo es: " + areaRectangulo);
		System.out.println ("El area del circulo es: " + areaCirculo);
		}
	}
