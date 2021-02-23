package puebasJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.itt.calculadora.Suma;

public class TestSuma {

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
		
	}
	
	@AfterAll
	static void terDownAfterClass() throws Exception {
		
	}
	
	@BeforeEach
	void beforeEach() {
		// Se aplica antes de cada test:
		entero1 = 5;
		entero2 = 4;
		real1 = 5.4;
		real2 = 3.7;
		real3 = 2.5;
	}
	
	@AfterEach
	void afterEach() {
		// Se aplica despues de cada test:
		entero1 = 0;
		entero2 = 0;
		real1 = 0;
		real2 = 0;
		real3 = 0;
	}
	
	/**
	 * En primer lugar probaremos el metodo "sumReales" de la clase Suma.
	 * Dicho metodo recibe dos numeros reales y devuelve la suma de ambos.
	 * Si alguno de los valores es negativo, no se realiza la operacion, devolviendo 0.00.
	 */
	@Test
	public void sumReales() {
		System.out.println("***** Test metodo sumReales *****");
		double r1 = real1;
		double r2 = real2;
		double result = r1 + r2;
		
		// Pasamos dos valores reales positivos => debe devolver el valor de la operacion.
		assertEquals(result, Suma.sumReales(r1, r2));
		
		// Pasamos el primer valor negativo => debe devolver 0.
		r1 = -r1;
		assertEquals(CERO, Suma.sumReales(r1, r2));
		
		// Pasamos el segundo valor negativo => debe devolver 0.
		r1 = real1;
		r2 = -r2;
		assertEquals(CERO, Suma.sumReales(r1, r2));
		
		// Pasamos ambos valores negativos => debe devolver 0.
		r1 = -r1;
		assertEquals(CERO, Suma.sumReales(r1, r2));
		
		// Si pasamos algun valor como 0, no hay problema en hacer la suma:
		r1 = real1;
		r2 = CERO;
		result = r1 + r2;
		assertEquals(result, Suma.sumReales(r1, r2));
	}
	
	/**
	 * La siguiente prueba unitaria se centra en el metodo "sumEntero".
	 * Dicho metodo recibe dos numeros enteros y devuelve la suma de ambos.
	 * Si alguno de los valores es negativo, no se realiza la operacion, devolviendo 0.00.
	 */
	@Test
	public void sumEntero() {
		System.out.println("***** Test metodo sumEntero *****");
		int e1 = entero1;
		int e2 = entero2;
		int result = e1 + e2;
		
		// Pasamos dos valores enteros positivos => debe devolver el valor de la operacion.
		assertEquals(result, Suma.sumEntero(e1, e2));
		
		// Pasamos el primer valor negativo => debe devolver 0.
		e1 = -e1;
		assertEquals(CERO, Suma.sumEntero(e1, e2));
		
		// Pasamos el segundo valor negativo => debe devolver 0.
		e1 = entero1;
		e2 = -e2;
		assertEquals(CERO, Suma.sumEntero(e1, e2));
		
		// Pasamos ambos valores negativos => debe devolver 0.
		e1 = -e1;
		assertEquals(CERO, Suma.sumEntero(e1, e2));
		
		// Si pasamos algun valor como 0, no hay problema en hacer la suma:
		e1 = entero1;
		e2 = CERO;
		result = e1 + e2;
		assertEquals(result, Suma.sumEntero(e1, e2));
	}
	
	/**
	 * En la siguiente prueba unitaria testamos el metodo el metodo "sumTresReales".
	 * Dicho metodo recibe tres numeros reales y devuelve la suma.
	 * Si alguno de los valores es negativo, no se realiza la operacion, devolviendo 0.00.
	 */
	@Test
	public void sumTresReales() {
		System.out.println("***** Test metodo sumTresReales *****");
		double r1 = real1;
		double r2 = real2;
		double r3 = real3;
		double result = r1 + r2 + r3;
		
		// Pasamos tres valores reales positivos => debe devolver el valor de la operacion.
		assertEquals(result, Suma.sumTresReales(r1, r2, r3));
		
		// Pasamos el primer valor negativo => debe devolver 0.
		r1 = -r1;
		assertEquals(CERO, Suma.sumTresReales(r1, r2, r3));
		
		// Pasamos el segundo valor negativo => debe devolver 0.
		r1 = real1;
		r2 = -r2;
		assertEquals(CERO, Suma.sumTresReales(r1, r2, r3));
		
		// Pasamos el tercer valor negativo => debe devolver 0.
		r1 = real1;
		r2 = real2;
		r3 = -r3;
		assertEquals(CERO, Suma.sumTresReales(r1, r2, r3));
		
		// Pasamos los tres valores negativos => debe devolver 0.
		r1 = -r1;
		r2 = -r2;
		assertEquals(CERO, Suma.sumTresReales(r1, r2, r3));
		
		// Comprobamos que la suma de tres negativos no realizara la operacion
		// Esta vez con un assertNotEquals
		assertNotEquals(result, Suma.sumTresReales(r1, r2, r3));
	}
	
	/**
	 * En la siguiente prueba unitaria testamos el metodo "sumAcumulado", 
	 * junto al metodo "getAcumulado".
	 * El metodo "sumAcumulado" va acumulando los numeros pasados como argumentos.
	 * Si uno de los numeros es negativo, la operacion no se realiza.
	 * Se mostrara un aviso de que el numero no se tiene en cuenta.
	 * El metodo "getAcumulado" devuelve el valor acumulado de la suma.
	 */
	@Test
	public void acumulados() {
		double r1 = real1;
		double r2 = real2;
		double r3 = real3;
		
		// Pasamos valores para ir acumulando:
		Suma.sumAcumulado(r1);
		Suma.sumAcumulado(r2);
		double acum = r1 + r2;
		
		// Hemos acumulado dos numeros positivos, por lo que si llamamos al metodo
		// getAcum el resultado deberia coincidir con el resultado de r1+r2.
		assertEquals(acum, Suma.getAcum());
		
		// Pasamos dos valores adicionales, uno de ellos negativo (que debera ser ignorado)
		Suma.sumAcumulado(r3);
		double r4 = -5.0;
		Suma.sumAcumulado(r4);
		acum = r1 + r2 + r3;
		assertEquals(acum, Suma.getAcum());
		
	}
	
}
