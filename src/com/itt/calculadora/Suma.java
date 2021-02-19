package com.itt.calculadora;


/**
 * <p>Clase estatica que realiza las operaciones basicas de suma en una calculadora: <br>
 * &nbsp&nbsp- suma de dos numeros reales<br>
 * &nbsp&nbsp- suma de dos numeros enteros<br>
 * &nbsp&nbsp- suma de tres numeros reales<br>
 * &nbsp&nbsp- suma con memoria<br>
 * No esta permitido usar numeros negativos en la suma. Su uso inducira a un error
 * en la aplicacion</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Suma()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la suma de dos numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumEntero(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la suma de dos numeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la suma de tres numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #sumAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la suma con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para poder mostar el resultado de la suma acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizacion de numeros negativos no permitidos:</p>
 * 		Si uno de los numeros pasados es negativo se lanzara un aviso de que no esta
 * 		permitido su uso, no realizando la operacio.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de numeros:
 * 		Si en vez de numeros como argumentos se quiere pasar caracteres, puede suceder:<br> 
 * &nbsp&nbsp&nbsp- Por linea de comandos: el tipo de variable definido ya impide que se pasen caracteres<br>
 * &nbsp&nbsp&nbsp dando un error en tiempo de compilación.
 * &nbsp&nbsp&nbsp- Por consola mediante la clase Scanner: Al implementar la clase Scanner se puede controlar<br>
 * &nbsp&nbsp&nbsp que el usuario no pase nigun caracter controlandolo por condionales o usando la <br>
 * &nbsp&nbsp&nbsp InputMismatchException de la clase java.util.
 * 	</li>
 *</ol>
 *
 * @version 1.1
 * @since 09/02/2021
 * @author Jose A. Santos
 */
public class Suma {
	/**
	 * El atributo acum recoge el acumulado de la suma.
	 * ES usado en el metodo {@link #sumAcumulado(double)}
	 */
	private static double acum = 0;
	
	/**
	 * Constructor por defecto que no recibe ningun parametro.
	 */
	public Suma() {
		
	}
	
	/**
	 * Metodo estatico que recibe dos numeros reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un numero real
	 * @param num2
	 * 		Sumando que recibe un numero real
	 * @return
	 * 		Un numero real que es el resultado de la suma de num1 + num2.
	 * 
	 * Si uno de los valores es negativo no se realiara la operacion, devolviendo 0.00;
	 */
	public static double sumReales(double num1, double num2) {
		if((num1<0 || num2 <0)) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		}
		return num1+num2;
	}
	
	/**
	 * Metodo estatico que recibe dos numero enteros como argumentos y 
	 * devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un numero entero
	 * @param num2
	 * 		Sumando que recibe un numero entero
	 * @return
	 * 		El resultado de la suma de num1 y num2.
	 * 
	 * Si uno de los valores es negativo no se realiara la operacion, devolviendo 0;
	 */
	public static int sumEntero(int num1, int num2) {
		if(num1<0 || num2 <0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0;
		}
		return num1+num2;
	}
	
	/**
	 * Metodo estatico que recibe tres numeros reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un numero real
	 * @param num2
	 * 		Sumando que recibe un numero real
	 * @param num3
	 * 		Sumando que recibe un numero real
	 * @return
	 * 		Un numero real que es el resultado de la suma de num1, num2 y num3
	 * 
	 * Si uno de los valores es negativo no se realiara la operacion, devolviendo 0.00;
	 */
	public static double sumTresReales(double num1, double num2, double num3) {
		if(num1<0 || num2 <0 || num3<0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		}
		return num1+num2+num3;
	}
	
	/**
	 * Metodo estatico que acumula el numero que se vaya pasando 
	 * como parametro, con el fin de realizar una suma acumulada.<br>
	 * Para consultar el valor acumulado de la suma usamos:
	 * {@link #getAcum()}
	 * @param num
	 * 		Numero de tipo real 
	 * 
	 * Si uno de los valores es negativo no se realiara la operacion.<br>
	 * Se mostrara un aviso de que el numero no ha sido tenido en cuenta.
	 */
	
	public static void sumAcumulado(double num) {
		if(num < 0) {
			System.out.println("El número introducido no se tiene en cuenta");
			System.out.println("Por favor introduce un número mayor que 0");
		}else {
			acum = acum + num;
		}
	}
	/**
	 * Metodo estatico que no recibe parametros y devuelve el valor acumulado de la suma.
	 * @return
	 * 		Devuelve el acumulado de la suma que se ha ido acumulando.
	 * 		{@link #sumAcumulado(double)}
	 */
	public static double getAcum() {
		return acum;
	}
}
