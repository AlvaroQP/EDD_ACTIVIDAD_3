/**
 * Para poder usar las clases tenemos que importar el paquete com.itt.calculadora.
 */
import java.text.DecimalFormat;

import com.itt.calculadora.*;

/**
 * Clase principal donde se ponen a prueba los metodos creados de las clases<br>
 * Division, Producto, Resta y Suma.
 * 
 * @author Jose A. Santos, Alvaro Quiles, Miguel A. Lozano, Raul Ruiz
 * @version 1.1
 * @since 04/02/2021
 */
public class Principal {
	
	
	public static void main(String[] args) {
		
		double num1 = 124.544544;
		double num2 = 7.45;
		double num3 = 4.23;
		double neg = -5.00;
		int numEntero1 = 2;
		int numEntero2 = 6;
		int numEntero3 = 0;
		int numEntero4 = -4;
		int numDesb = 1000;

		DecimalFormat df = new DecimalFormat("#0.00");
		
		// Zona para Division		
		System.out.println("\n***************** DIVISION *****************");		
		System.out.println("Metodo para dividir 2 numeros reales:");
		System.out.println(num1 + " / " + num2 + " = " + df.format(Division.divReales(num1, num2)));
		System.out.println("=======================");
		System.out.println("Metodo para dividir dos numeros enteros:");
		System.out.println(numEntero1 + " / " + numEntero2 + " = " + df.format(Division.divEnteros(numEntero1, numEntero2)));
		System.out.println("=======================");
		System.out.println("Metodo para calcular el inverso de un numero:");
		System.out.println("El inverso de " + num2 + " = " + df.format(Division.inverso(num2)));
		System.out.println("=======================");
		System.out.println("Metodo para calcular la raiz cuadrada de un numero:");
		System.out.println("La raiz cuadrada de " + num1 + " = " + df.format(Division.raiz(num1)));
				
		System.out.println("\n\n");

		// Zona para Producto
		System.out.println("\n***************** PRODUCTO *****************");		
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println(num1 + " x " + num2 + " = " + Producto.prodReales(num1, num2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println(num1 + " x " + neg + " = " + Producto.prodReales(num1, neg));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println(numEntero1 + " x " + numEntero2 + " = " + Producto.prodEnteros(numEntero1, numEntero2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println(numEntero1 + " x " + numEntero4 + " = " + Producto.prodEnteros(numEntero1, numEntero4));
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println(num1 + " x " + num2 + " x " + num3 + " = " + Producto.prodReales(num1, num2, num3));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println(num1 + " x " + num2 + " x " + neg + " = " + Producto.prodReales(num1, num2, neg));
		System.out.println("=======================");
		System.out.println("Operacion valida de potencia:");
		System.out.println(numEntero1 + "^" + numEntero2 + " = " + Producto.potencia(numEntero1, numEntero2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de potencia:");
		System.out.println(numEntero3 + "^" + numEntero3 + " = " + Producto.potencia(numEntero3, numEntero3));
		System.out.println("=======================");
		System.out.println("Ejemplo de desbordamiento:");
		System.out.println(numDesb + "^" + numDesb + " = " + Producto.potencia(numDesb, numDesb));
		System.out.println("=======================");

		System.out.println("\n\n");
		
		// Zona para Resta
		System.out.println("\n***************** RESTA *****************");
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println("4.5 - 2 = " + Resta.resReales(4.5, 2));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados		
		Resta.resAcumulado(Resta.resReales(4.5, 2)); 
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println("4.5 - (-2) = " + Resta.resReales(4.5, -2));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println("20 - 4 = " + Resta.resEnteros(20, 4));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados
		Resta.resAcumulado(Resta.resEnteros(20, 4));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println("20 - (-4) = " + Resta.resEnteros(20, -4)); 
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println("4.3 - 7.2 - 2 = " + Resta.resTresReales(4.3, 7.2, 2));
		//guardo el valor de la resta anterior para llevar un acumulado de resultados
				Resta.resAcumulado(Resta.resTresReales(4.3, 7.2, 2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println("4.3- (-7.2) - 2 = " + Resta.resTresReales(4.3, -7.2, 2));
		System.out.println("=======================");
		System.out.println("Valor acumulado de las restas: " +Resta.getAcum());
		System.out.println("=======================");

		System.out.println("\n\n");

		// Zona para Suma	
		System.out.println("***************** SUMA *****************");
		System.out.println("Operacion valida de 2 numeros reales:");
		System.out.println(num1 + " + " + num2 + " = " + df.format(Suma.sumReales(num1, num2)));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumReales(num1, num2)); 
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros reales:");
		System.out.println(num1 + " + " + neg + " = " + df.format(Suma.sumReales(num1, neg)));
		System.out.println("=======================");
		System.out.println("Operacion valida de 2 numeros enteros:");
		System.out.println(numEntero1 + " + " + numEntero2 + " = " + Suma.sumEntero(numEntero1, numEntero2));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumEntero(numEntero1, numEntero2));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 2 numeros enteros:");
		System.out.println(numEntero2 + " + " + (int)neg + " = " + Suma.sumEntero(numEntero2, (int)neg )); 
		System.out.println("=======================");
		System.out.println("Operacion valida de 3 numeros reales:");
		System.out.println(num1 + " + " + num2 + num3 + " = " +df.format(Suma.sumTresReales(num1, num2, num3)));
		//guardo el valor de la suma anterior para llevar un acumulado de resultados
		Suma.sumAcumulado(Suma.sumTresReales(num1, num2, num3));
		System.out.println("=======================");
		System.out.println("Operacion no valida de 3 numeros reales:");
		System.out.println(num1 + " + " + neg + num3 + " = " + df.format(Suma.sumTresReales(num1, neg, num3)));
		System.out.println("=======================");
		System.out.println("Valor acumulado de las sumas: " + df.format(Suma.getAcum()));
		System.out.println("=======================");
	}

}

