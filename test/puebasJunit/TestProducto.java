package puebasJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.itt.calculadora.Producto;

class TestProducto {
	//Declaro las variables que usare en los test.
	
	// Enteros:
	private static final int entero1 = 5;
	private static final int entero2 = 4;
	// Reales:
	private static final double real1 = 5.4;
	private static final double real2 = 3.7;
	private static final double real3 = 2.5;
	// Valor que se devuelve en caso de error:
	private static final int CERO = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Se aplica antes de comenzar los test
	}
	
	@AfterAll
	static void terDownAfterClass() throws Exception {
		//Se aplica al finalizar los test
	}
	
	@BeforeEach
	void beforeEach() {
		// Se aplica antes de cada test
	}
	
	@AfterEach
	void afterEach() {
		// Se aplica despues de cada test
	}
	
	/**
	 * Prueba unitario sobre el metodo prodReales con 2 parametros
	 * 
	 * El metodo prodReales devuelve el producto entre dos numeros reales.
	 * Si alguno de los numeros pasados como argumento es negativo prodReales devuelve 0.
	 * 
	 */
	@Test
	void testprodRealesDosParametros() {
		System.out.println("***** Test metodo prodReales con dos parametros *****");
		double result= real1*real2;
		double realNegativo=-real1;
				
		// Paso un double negativo como primer argumento y un double positivo como segundo argumento, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(realNegativo, real2));
		
		// Paso un double negativo como segundo argumento y un double positivo como primer argumento, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(real2, realNegativo));
		
		// Paso los dos argumentos negativos, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(realNegativo, realNegativo));
		
		// Paso dos doubles positivos como argumentos, el resultado de prodReales debe ser su producto
		assertEquals(result, Producto.prodReales(real1, real2));	
	}
	
	/**
	 * Prueba unitario sobre el metodo prodReales con 3 parametros
	 * 
	 * El metodo prodReales devuelve el producto entre tres numeros reales.
	 * Si alguno de los numeros pasados como argumento es negativo prodReales devuelve 0.
	 * 
	 */
	@Test
	void testprodRealesTresParametros() {
		System.out.println("***** Test metodo prodReales con tres parametros *****");
		double result= real1*real2*real3;
		double realNegativo=-real1;
				
		// Paso un double negativo como primer argumento y dos double positivos como los demas argumentos, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(realNegativo, real2, real3));
		
		// Paso un double negativo como segundo argumento y dos double positivos como los demas argumentos, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(real2, realNegativo, real3));
		
		// Paso un double negativo como tercer argumento y dos double positivos como los demas argumentos, prodReales deberia devolver 0
			assertEquals(CERO, Producto.prodReales(real2, real3,realNegativo));
		
		// Paso los tres argumentos negativos, prodReales deberia devolver 0
		assertEquals(CERO, Producto.prodReales(realNegativo, realNegativo, realNegativo));
		
		// Paso tres doubles positivos como argumentos, el resultado de prodReales debe ser su producto
		assertEquals(result, Producto.prodReales(real1, real2, real3));	
	}
	
	/**
	 * Prueba unitaria sobre el metodo prodEnteros
	 * 
	 * El metodo prodEnteros devuelve el producto entre dos numero enteros.
	 * Si alguno de los numeros pasados como argumentos es negativo prodEnteros devuelve 0.
	 */
	
	@Test
	void testProdEnteros() {
		System.out.println("***** Test metodo prodEnteros *****");	
		int enteroNegativo=-entero1;
		int result=entero1*entero2;
		
		// Paso un entero negativo como primer argumento y un entero positivo como segundo argumento, prodEntero deberia devolver 0.
		assertEquals(CERO, Producto.prodEnteros(enteroNegativo, entero2));
		
		// Paso un entero negativo como segundo argumento y un entero positivo como primer argumento, prodEntero deberia devolver 0.
		assertEquals(CERO, Producto.prodEnteros(entero2,enteroNegativo));
		
		// Paso dos enteros negativos como argumentos, prodEntero deberia devolver 0.
		assertEquals(CERO, Producto.prodEnteros(enteroNegativo, enteroNegativo));
		
		// Paso dos entero positivos como argumentos, prodEntero deberia devolver su producto
		assertEquals(result, Producto.prodEnteros(entero1, entero2));
		
	}
	
	/**
	 * Prueba unitaria sobre el metodo Potencia
	 * 
	 * El metodo Potencia devuelve un entero resultado de elevar el primer argumento al valor del segundo argumento.
	 * Si alguno de los numeros pasados como argumento es negativo Potencia devolvera 0.
	 * Si ambos numeros pasados como argumentos son cero Potencia devolvera 0.
	 * Si el resultado calculado provocase un desbordamiento Potencia devolvera 0.
	 * Si el primer argumento es 0 y el segundo cualquier valor mayor que 0 Potencia devolvera 0.
	 * Si el segundo argumento es 0 Potencia devolvera 1.
	 * Si el segundo argumento es 1 Potencia devolvera el valor del primer argumento
	 * 
	 */
	
	@Test
	void testPotencia() {
		System.out.println("***** Test metodo Potencia *****");	
		int enteroNegativo=-entero1;
		int result=(int)Math.pow(entero1, entero2);
		
		// Paso un entero negativo como primer argumento y un entero positivo como segundo argumento, Potencia deberia devolver 0.
		assertEquals(CERO, Producto.potencia(enteroNegativo, entero2));
		
		// Paso un entero negativo como segundo argumento y un entero positivo como primer argumento, Potencia deberia devolver 0.
		assertEquals(CERO, Producto.potencia(entero2, enteroNegativo));
		
		// Paso dos enteros negativos como argumentos, Potencia deberia devolver 0.
		assertEquals(CERO, Producto.potencia(enteroNegativo, enteroNegativo));
		
		/* Paso el maximo valor de tipo entero como primer argumento y un entero positivo como segundo argumento, Potencia deberia devolver 0
		*  al producirse desbordamiento
		*/
		assertEquals(CERO, Producto.potencia(Integer.MAX_VALUE, entero1));
		// Paso 0 como primer argumento y un entero positivo como segundo argumento, Potencia deberia devolver 0
		assertEquals(CERO, Producto.potencia(0, entero1));
		
		// Paso un entero positivo como primer argumento y 0 como segundo argumento, Potencia deberia devolver 1
		assertEquals(1, Producto.potencia(entero1, 0));
		
		// Paso un entero positivo como primer argumento y un 1 como segundo argumento, Potencia deberia devolver el valor del primer argumento.
		assertEquals(entero1, Producto.potencia(entero1, 1));
		
		//Paso dos enteros positivos distintos de 0 y 1, Potencia devolvera el primero elevado al segundo
		assertEquals(result, Producto.potencia(entero1, entero2));
	}
}
