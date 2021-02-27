package puebasJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.itt.calculadora.Resta;

public class TestResta {
	
	// Declaramos las variables usadas en los test
	// Enteros:
	private static int entero1 = 5;
	private static int entero2 = 4;
	// Reales:
	private static double real1 = 5.4;
	private static double real2 = 3.7;
	private static double real3 = 2.5;
	// Valor que se devuelve en caso de error:
	private static final int CERO = 0;
	// Para el valor acumulado:
	private static double acum = 0;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//Se ejecuta antes de comenzar los test
	}
	
	@AfterAll
	static void terDownAfterClass() throws Exception {
		//Se ejecuta al finalizar los test
	}
	
	@BeforeEach
	void beforeEach() {
		// Se ejecuta antes de cada test
	}
	
	@AfterEach
	void afterEach() {
		// Se ejecuta despues de cada test
	}
	
	/**
	 * En esta prueba unitaria, probamos que el metodo "resReales" de la clase Resta
	 * funciona adecuadamente.
	 * 
	 * Este metodo recibe dos numeros reales. Si alguno de los argumentos pasados a la funcion es un numero
	 * negativo devuelve 0, en caso contrario devuelve el valor de la operacion.
	 */
	@Test
	public void testResReales(){
		System.out.println("\n***** Test metodo resReales *****");
		double r1 = real1;
		double r2 = real2;
		double result = r1 - r2;
		
		//Se pasan dos valores reales positivos y 
		//tiene que devolver el valor de la operacion
		assertEquals(result, Resta.resReales(r1,r2));
		
		//Se pasan dos valores, el primero negativo y el segundo positivo
		//y tiene que devolver 0.
		r1 = -r1;
		assertEquals(CERO, Resta.resReales(r1, r2));
		
		//Se pasan dos valores, el primero positivo y el segundo negativo
		//y tiene que devolver 0.
		r1 = real1;
		r2 = -r2;
		assertEquals(CERO, Resta.resReales(r1, r2));		

		//Se pasan dos valores reales negativos y tiene que devolver 0.
		r1 = -r1;
		assertEquals(CERO, Resta.resReales(r1, r2));			
	}

	/**
	 * En esta prueba unitaria, probamos que el metodo "resEnteros" de la clase Resta
	 * funciona adecuadamente.
	 * 
	 * Este metodo recibe dos numeros enteros. Si alguno de los argumentos pasados a la funcion es un numero
	 * negativo devuelve 0, en caso contrario devuelve el valor de la operacion.
	 */
	@Test
	public void testResEnteros(){
		System.out.println("\n***** Test metodo resEnteros *****");
		int e1 = entero1;
		int e2 = entero2;
		int result = e1 - e2;
		
		//Se pasan dos valores enteros positivos y 
		//tiene que devolver el valor de la operacion
		assertEquals(result, Resta.resEnteros(e1,e2));
		
		//Se pasan dos valores, el primero negativo y el segundo positivo
		//y tiene que devolver 0.
		e1 = -e1;
		assertEquals(CERO, Resta.resEnteros(e1, e2));
		
		//Se pasan dos valores, el primero positivo y el segundo negativo
		//y tiene que devolver 0.
		e1 = entero1;
		e2 = -e2;
		assertEquals(CERO, Resta.resEnteros(e1, e2));		

		//Se pasan dos valores reales negativos y tiene que devolver 0.
		e1 = -e1;
		assertEquals(CERO, Resta.resEnteros(e1, e2));			
	}

	
	/**
	 * En esta prueba unitaria, probamos que el metodo "resTresReales" de la clase Resta
	 * funciona adecuadamente.
	 * 
	 * Este metodo recibe tres numeros reales. Si alguno de los argumentos pasados a la funcion es un numero
	 * negativo devuelve 0, en caso contrario devuelve el valor de la operacion.
	 */
	@Test
	public void testResTresReales(){
		System.out.println("\n***** Test metodo resTresReales *****");
		double r1 = real1;
		double r2 = real2;
		double r3 = real3;
		double result = r1 - r2 - r3;
		
		//Se pasan tres valores reales positivos y 
		//tiene que devolver el valor de la operacion
		assertEquals(result, Resta.resTresReales(r1, r2, r3));
		
		//Se pasan tres valores, el primero negativo, el segundo y tercero positivos
		//y tiene que devolver 0.
		r1 = -r1;
		assertEquals(CERO, Resta.resTresReales(r1, r2, r3));
		
		//Se pasan tres valores, el primero positivo, el segundo negativo y el tercero positivo
		//y tiene que devolver 0.
		r1 = real1;
		r2 = -r2;
		assertEquals(CERO, Resta.resTresReales(r1, r2, r3));		

		//Se pasan tres valores reales negativos y 
		////y tiene que devolver 0.
		r1 = -r1;
		r3 = -r3;
		assertEquals(CERO, Resta.resTresReales(r1, r2 ,r3));			
	}
	
	/**
	 * En la siguiente prueba unitaria testamos el metodo "resAcumulado", 
	 * junto al metodo "getAcum".
	 * El metodo "resAcumulado" va acumulando los numeros pasados como argumentos.
	 * Si uno de los numeros es negativo, la operacion no se realiza.
	 * Se mostrara un aviso de que el numero no se tiene en cuenta.
	 * El metodo "getAcum" devuelve el valor acumulado de las restas.
	 */
	@Test
	public void acumulados() {
		System.out.println("\n***** Test metodo getAcumulado junto a metodo getAcum *****");
		double r1 = real1; //5.4
		double r2 = real2; //3.7
		double r3 = real3; //2.5
		
		// Pasamos valores para ir acumulando:
		Resta.resAcumulado(r1);
		Resta.resAcumulado(r2);
		acum = r1 + r2;
		
		// Hemos acumulado dos numeros positivos, por lo que si llamamos al metodo
		// getAcum el resultado deberia coincidir con el resultado de r1+r2.
		assertEquals(acum, Resta.getAcum());
		
		// Pasamos dos valores adicionales, uno de ellos negativo (que debera ser ignorado)
		Resta.resAcumulado(r3);
		double r4 = -5.0;
		Resta.resAcumulado(r4);
		acum = r1 + r2 + r3 + r4;
		assertEquals(acum, Resta.getAcum());
		
	}
}