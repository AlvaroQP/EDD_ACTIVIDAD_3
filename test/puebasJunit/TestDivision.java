package puebasJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.itt.calculadora.Division;

public class TestDivision {
	
	// Enteros:
	private static int entero1 = 5;
	private static int entero2 = 4;
	// Reales:
	private static double real1 = 5.4;
	private static double real2 = 3.7;
	// Valor que se devuelve en caso de error:
	private static final int CERO = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() throws Exception {

	}
	
	@AfterEach
	void tearUp() throws Exception{
		
	}
	
	/**
	 * En esta prueba unitaria probamos que el metodo "divReales" de la clase Division
	 * funciona adecuadamente.
	 * 
	 * Este metodo recibe dos numeros reales. Si cualquiera de los numeros es menor que
	 * 0 o el segundo valor es igual a 0 devuelve 0, en caso contrario devuelve 
	 * el valor de la operacion.
	 */
	@Test
	public void testDivReales() {
		System.out.println("***** Test metodo divReales *****");
		
		//Se pasan dos valores reales positivos y tiene que devolver el valor de 
		//la operacion
		double result = real1/real2;
		assertEquals(result, Division.divReales(real1,real2));
		
		//Se pasa el primer valor como negativo y el segundo como positivo y tiene
		//que devolver 0
		double realNegativo1=-real1;
		assertEquals(CERO, Division.divReales(realNegativo1, real2));
		
		//Se pasa el primer valor como positivo y el segundo como negativo y tiene que
		//devolver 0
		double realNegativo2=-real2;
		assertEquals(CERO, Division.divReales(real1,realNegativo2));
		
		//Se pasan los dos valores negativos y tiene que devolver 0
		assertEquals(CERO, Division.divReales(realNegativo1, realNegativo2));
		
		//Se pasa el segundo valor como 0 y tiene que devolver 0
		assertEquals(CERO,Division.divReales(real1, real2));
		
		//Se pasa el primer valor como 0 y tiene que devolver el resultado de la 
		//operacion
		result = CERO/real2;
		assertEquals(result, Division.divReales(real1, real2));
	}
	
	/**
	 * En esta prueba unitaria probamos que el metodo "divEnteros" de la clase Division
	 * funciona adecuadamente.
	 * 
	 * Este metodo recibe dos numeros enteros. Si cualquiera de los numeros es menor que
	 * 0 o el segundo valor es igual a 0 devuelve 0, en caso contrario devuelve 
	 * el valor de la operacion.
	 */
	@Test
	public void testDivEnteros() {
		System.out.println("***** Test metodo divEnteros *****");
		
		//Se pasan dos valores enteros positivos y tiene que devolver el valor de 
		//la operacion
		double result =(double)entero1/entero2;
		assertEquals(result, Division.divEnteros(entero1,entero2));
		
		//Se pasa el primer valor como negativo y el segundo como positivo y tiene
		//que devolver 0
		int enteroNegativo1 = -entero1;
		assertEquals(CERO, Division.divEnteros(enteroNegativo1, entero2));
		
		//Se pasa el primer valor como positivo y el segundo como negativo y tiene que
		//devolver 0
		int enteroNegativo2 = -2;
		assertEquals(CERO, Division.divEnteros(entero1,enteroNegativo2));
		
		//Se pasan los dos valores negativos y tiene que devolver 0
		assertEquals(CERO, Division.divEnteros(enteroNegativo1, enteroNegativo2));
		
		//Se pasa el segundo valor como 0 y tiene que devolver 0
		assertEquals(CERO,Division.divReales(entero1, CERO));
		
		//Se pasa el primer valor como 0 y tiene que devolver el resultado de la 
		//operacion
		result =(double)entero1/entero2;
		assertEquals(result, Division.divReales(entero1, entero2));
	}
	
	/**
	 * En esta prueba unitaria se testea el metodo "inverso" de la clase Division.
	 * Se pasa un número real y calcula su inverso.
	 */
	@Test
	public void testInverso() {
		System.out.println("***** Test metodo testInverso *****");
		
		//sacamos el inverso de un numero real dado
		double result = 1/real1;
		assertEquals(result, Division.inverso(real1));
		
		//sacamos el inverso de un numero entero dado
		result = (double)1/entero2;
		assertEquals(result, Division.inverso(entero2));
		
		//sacamos el numero que se pasa como argumento es 0, devuelve un mensaje de 
		//que el divisior no puede ser 0 y retorna 0.
		result = 1/CERO;
		assertNotEquals(result, Division.inverso(real1));
		assertEquals(CERO, Division.inverso(real1));
		
		/*
		 * sacamos el inverso de un numero negativo. Como la calculadora no admite
		 * negativos, lanza un mensaje de que solo se admiten numeros positivos y
		 * retorna 0
		 */
		double realNegativo = -real1;
		result = 1/realNegativo;
		assertNotEquals(result, Division.inverso(realNegativo));
		assertEquals(CERO, Division.inverso(realNegativo));
		}
	
	/**
	 * En esta prueba unitaria se testea el metodo "raiz" de la clase Division.
	 * Se pasa un numero real y calcula su raiz cuadrada.
	 */
	@Test
	public void testRaiz() {
		System.out.println("***** Test metodo raiz *****");
	
		//sacamos la raiz cuadrada de un numero real dado
		double result = Math.sqrt(real1);
		assertEquals(result, Division.raiz(real1));
		
		//sacamos la raiz de un numero entero dado
		result = (double)(Math.sqrt(entero2));
		assertEquals(result, Division.raiz(entero2));
		
		//Se pasa como argumento 0 para calcualr la raiz cuadrada, devuelve un mensaje de 
		//que el numero pasado no puede ser 0 y retorna 0.
		result = Math.sqrt(CERO);
		assertEquals(result, Division.raiz(CERO));
		
		
		/*
		 * Se pasa por parameto un numero negativo. Como la calculadora no admite
		 * negativos, lanza un mensaje de que solo se admiten numeros positivos y
		 * retorna 0
		 */
		double realNegativo = -real1;
		assertNotEquals(result, Division.raiz(realNegativo));
		assertEquals(CERO, Division.raiz(realNegativo));
		
		}

}
