package com.itt.calculadora;

/**
 * <p>Clase estatica que realiza las operaciones basicas de multiplicacion en una calculadora: <br>
 * &nbsp&nbsp- Producto de dos numeros reales<br>
 * &nbsp&nbsp- Producto de dos numeros enteros<br>
 * &nbsp&nbsp- Producto de tres numeros reales<br>
 * &nbsp&nbsp- Potencia<br>
 * No esta permitido usar numeros negativos en la multiplicacion. Su uso inducira a un error
 * en la aplicacion.</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Producto()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para el producto de dos numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para el producto de dos numeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #prodReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para el producto de tres numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #potencia(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la potencia.
 * 					</li>
 * 				</ul>
 * 			</li>	
 *		</ol>
 *</p>
 *<hr>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizacion de numeros negativos no permitidos:</p>
 * 		Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
 * 		indicando que la calculadora solo realiza operaciones con numeros positivos.
 * 		Adicionalmente, el valor de retorno sera 0.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de numeros:</p>
 * 		Si el usuario decide hacer uso de la clase Scanner para introducir caracteres
 * 		en vez de numeros, se controlara adecuadamente para impedir la operacion.
 * 	</li>
 *</ol>
 * 
 * @author Alvaro Quiles Pomares
 * @version 1.0
 * @since 20/01/2021
 */
public class Producto {

	/**
	 * Constructor por defecto que no recibe ningun parametro.
	 */
	public Producto() {
		
	}
	
	/**
	 * <b>Producto de dos numeros reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los dos numeros reales pasados al metodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static double prodReales(double num1, double num2) {

		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2;
		}
					
	}
	
	/**
	 * <b>Producto de dos numeros enteros.</b>
	 * @param num1 Primer operando de tipo entero.
	 * @param num2 Segundo operando de tipo entero.
	 * @return Devuelve un int con el resultado de multiplicar 
	 * los dos numeros enteros pasados al metodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static int prodEnteros(int num1, int num2) {
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2;
		}
		
	}
	
	/**
	 * <b>Producto de tres numeros reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @param num3 Tercer operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los tres numeros reales pasados al metodo como argumentos. 
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 */
	public static double prodReales(double num1, double num2, double num3) {
		
		if(num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else {
			return num1 * num2 * num3;
		}
		
	}
	
	/**
	 * <b>Potencia</b>
	 * @param base Numero entero que sera la base de la operacion.
	 * @param expo Numero entero que sera el exponente de la operacion.
	 * @return Devuelve un int con el resultado de elevar al argumento
	 * pasado como base el valor del argumento pasado como exponente.
	 * Si uno de los numeros pasados es negativo se imprimira un mensaje por consola
	 * indicando que la calculadora solo realiza operaciones con numeros positivos.
	 * Adicionalmente, el valor de retorno sera 0.
	 * <br>
	 * Si ambos valores (base y exponente) son 0, se mostrara un mensaje por consola
	 * indicando que ambos argumentos no pueden ser igual a 0.
	 * Adicionalmente, el valor de retorno en dicho caso sera 0.
	 * <br>
	 * Si los argumentos pasados provocasen un desbordamiento, se indicara al usuario
	 * el desbordamiento y se retornara 0.
	 * <p>
	 * <b>Casos especiales:</b>
	 * <br>
	 * <li>Si el primer argumento es 0 y el segundo argumento es cualquier numero distinto de 0,
	 * 	 el resultado sera 0.</li>
	 * <li>Si el segundo argumento es 0, el resultado sera 1.</li>
	 * <li>Si el segundo argumento es 1, el resultado sera igual al primer argumento.</li>
	 */
	public static int potencia(int base, int expo) {
		int resultado = (int)(Math.pow(base, expo));
		if(base < 0 || expo < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		} else if(base == 0 && expo == 0) {
			System.out.println("Ambos argumentos (base y exponente) no pueden ser igual a 0.");
			return 0;
		} else if(resultado >= Integer.MAX_VALUE || resultado < 0) {
			System.out.println("Se ha producido un desbordamiento.");
			return 0;
		} else {
			return resultado;	
		}
	}
	
	
}
