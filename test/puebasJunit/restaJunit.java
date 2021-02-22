package puebasJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itt.calculadora.Resta;

class restaJunit {

	@Test
	void test1() {
		System.out.println("Test 1, restamos dos numeros reales");
		double num1 = 3.5;
		double num2 = 2;
		double num3 = -5;
		double num4 = 6.7;
		double resultado;
		
		
		resultado = Resta.resReales(num3, num1);
		assertEquals(0, resultado);
		
		
//		fail("Not yet implemented");
	}

}
