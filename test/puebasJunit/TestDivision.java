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
	private static double real3 = 2.5;
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
		double r1 = real1;
		double r2 = real2;
		double result = r1/r2;
		
		//Se pasan dos valores reales positivos y tiene que devolver el valor de 
		//la operacion
		assertEquals(result, Division.divReales(r1,r2));
		
		//Se pasa el primer valor como negativo y el segundo como positivo y tiene
		//que devolver 0
		r1 = -r1;
		assertEquals(CERO, Division.divReales(r1, r2));
		
		//Se pasa el primer valor como positivo y el segundo como negativo y tiene que
		//devolver 0
		r1 = real1;
		r2 = -r2;
		assertEquals(CERO, Division.divReales(r1,r2));
		
		//Se pasan los dos valores negativos y tiene que devolver 0
		r1 = -r1;
		assertEquals(CERO, Division.divReales(r1, r2));
		
		//Se pasa el segundo valor como 0 y tiene que devolver 0
		r1 = real1;
		r2 = CERO;
		assertEquals(CERO,Division.divReales(r1, r2));
		
		//Se pasa el primer valor como 0 y tiene que devolver el resultado de la 
		//operacion
		r1 = CERO;
		r2 = real2;
		result = r1/r2;
		assertEquals(result, Division.divReales(r1, r2));
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
		int r1 = num1;;
		int r2 = num2;;
		double result =(double)r1/r2;
		//Se pasan dos valores enteros positivos y tiene que devolver el valor de 
		//la operacion
		assertEquals(result, Division.divEnteros(r1,r2));
		
		//Se pasa el primer valor como negativo y el segundo como positivo y tiene
		//que devolver 0
		r1 = -r1;
		assertEquals(CERO, Division.divEnteros(r1, r2));
		
		//Se pasa el primer valor como positivo y el segundo como negativo y tiene que
		//devolver 0
		r1 = num1;
		r2 = -r2;
		assertEquals(CERO, Division.divEnteros(r1,r2));
		
		//Se pasan los dos valores negativos y tiene que devolver 0
		r1 = -r1;
		assertEquals(CERO, Division.divEnteros(r1, r2));
		
		//Se pasa el segundo valor como 0 y tiene que devolver 0
		r1 = num1;
		r2 = CERO;
		assertEquals(CERO,Division.divReales(r1, r2));
		
		//Se pasa el primer valor como 0 y tiene que devolver el resultado de la 
		//operacion
		r1 = CERO;
		r2 = num2;
		result =(double)r1/r2;
		assertEquals(result, Division.divReales(r1, r2));
	}
	
	/**
	 * En esta prueba unitaria se testea el metodo "inverso" de la clase Division.
	 * Se pasa un número real y calcula su inverso.
	 */
	@Test
	public void testInverso() {
		System.out.println("***** Test metodo testInverso *****");
		double r1 = real1;
		int r2 = num1;
		
		//sacamos el inverso de un numero real dado
		double result = 1/r1;
		assertEquals(result, Division.inverso(r1));
		
		//sacamos el inverso de un numero entero dado
		result = (double)1/r2;
		assertEquals(result, Division.inverso(r2));
		
		//sacamos el numero que se pasa como argumento es 0, devuelve un mensaje de 
		//que el divisior no puede ser 0 y retorna 0.
		r1 = CERO;
		result = 1/r1;
		assertNotEquals(result, Division.inverso(r1));
		assertEquals(CERO, Division.inverso(r1));
		
		/*
		 * sacamos el inverso de un numero negativo. Como la calculadora no admite
		 * negativos, lanza un mensaje de que solo se admiten numeros positivos y
		 * retorna 0
		 */
		r1 = -real1;
		result = 1/r1;
		assertNotEquals(result, Division.inverso(r1));
		assertEquals(CERO, Division.inverso(r1));
		}
	
	/**
	 * En esta prueba unitaria se testea el metodo "raiz" de la clase Division.
	 * Se pasa un número real y calcula su raiz cuadrada.
	 */
	@Test
	public void testRaiz() {
		System.out.println("***** Test metodo raiz *****");
		double r1 = real1;
		int r2 = num1;
		
		//sacamos la raiz cuadrada de un numero real dado
		double result = Math.sqrt(r1);
		assertEquals(result, Division.raiz(r1));
		
		//sacamos la raiz de un numero entero dado
		result = (double)(Math.sqrt(r2));
		assertEquals(result, Division.raiz(r2));
		
		//Se pasa como argumento 0 para calcualr la raiz cuadrada, devuelve un mensaje de 
		//que el numero pasado no puede ser 0 y retorna 0.
		r1 = CERO;
		result = Math.sqrt(r1);
		assertEquals(result, Division.raiz(r1));
		
		
		/*
		 * Se pasa por parameto un numero negativo. Como la calculadora no admite
		 * negativos, lanza un mensaje de que solo se admiten numeros positivos y
		 * retorna 0
		 */
		r1 = -real1;
		result = 1/r1;
		assertNotEquals(result, Division.raiz(r1));
		assertEquals(CERO, Division.raiz(r1));
		
		}

}
