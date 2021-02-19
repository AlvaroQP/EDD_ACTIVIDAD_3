package com.itt.calculadora;

/**
 * <p>Clase estatica que realiza las operaciones basicas de resta o sustraccion en una calculadora,
 * adicionalmente proporciona metodos para guardar y consultar el acumulado de las restas: <br>
 * &nbsp&nbsp- resta de dos numeros reales <br>
 * &nbsp&nbsp- resta de dos numeros enteros<br>
 * &nbsp&nbsp- resta de tres numeros reales<br>
 * &nbsp&nbsp- resta con memoria</br>
 * No esta permitido usar numeros negativos en la resta.</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Resta()}</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resReales(double, double)}</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la resta de dos numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la resta de dos numeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la resta de tres numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para la resta con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para poder mostar el resultado de la resta acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizacion de numeros negativos no permitidos:</p>
 * 		Si uno de los numeros pasados es negativo se lanzara una excepcion
 *		ya que realiza operaciones basicas de resta de numeros positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de numeros:</p>
 * 		La clase Resta solo permite el paso de numeros como argumentos a sus funciones, debe controlarse 
 * 		adecuadamente que el usuario solo pase ese tipo de argumentos al llamar a las distintas funciones.
 * 	</li>
 *</ol>
 *
 * @version 1.0
 * @since 20/01/2021
 * @author Raul Ruiz Sanz
 */
public class Resta {

	/**
	 * acum: acumula resultado de diferentes restas
	 */
	private static double acum = 0;

	/**
	 * Constructor de la clase Resta por defecto, no recibe parametros
	 */
	public Resta() {
	}

	/**
	 * Realiza la resta de dos numeros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * Si alguno de los argumentos pasados a la funcion es un numero negativo se mostrara un mensaje
	 * indicando que solo se pueden realizar operaciones con numeros positivos.
	 * Igualmente el valor retornado por la funcion sera 0 en caso de introducir algun numero negativo
	 * como argumento.
	 */
	public static double resReales(double num1, double num2) {
		if (num1 <0 || num2<0) {
			System.out.println("Sólo se pueden realizar operaciones con números positivos");
			System.out.println("El valor devuelto en este caso por la función será 0");
			return 0;
		}
		return (num1 - num2);
	}

	/**
	 * Realiza la resta de dos numeros enteros que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2 
	 * Si alguno de los argumentos pasados a la funcion es un numero negativo se mostrara un mensaje
	 * indicando que solo se pueden realizar operaciones con numeros positivos.
	 * Igualmente el valor retornado por la funcion sera 0 en caso de introducir algun numero negativo
	 * como argumento.
	 */
	public static int resEnteros(int num1, int num2) {
		if (num1 <0 || num2<0) {
			System.out.println("Sólo se pueden realizar operaciones con números positivos");
			System.out.println("El valor devuelto en este caso por la función será 0");
			return 0;
		}
		return (num1 - num2);

	}

	/**
	 * Realiza la resta del de tres numeros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve el resultado de la resta de (num1 menos num2) menos num3
	 * Si alguno de los argumentos pasados a la funcion es un numero negativo se mostrara un mensaje
	 * indicando que solo se pueden realizar operaciones con numeros positivos.
	 * Igualmente el valor retornado por la funcion sera 0 en caso de introducir algun numero negativo
	 * como argumento.
	 */
	public static double resTresReales(double num1, double num2, double num3) {
		if (num1 <0 || num2<0 || num3<0) {
			System.out.println("Sólo se pueden realizar operaciones con números positivos");
			System.out.println("El valor devuelto en este caso por la función será 0");
			return 0;
		}
		return (num1 - num2 - num3);
	}

	/**
	 * Acumula el valor que pasamos como argumento, de esta forma podemos guardar el valor acumulado 
	 * de varias restas  <br>
	 * Para consultar el valor acumulado de las restas usamos: 
	 * {@link Resta#getAcum()}
	 * 
	 * @param num resultado de las restas que queremos ir acumulando
	 */
	public static void resAcumulado(double num) {

		acum = acum + num;

	}

	/**
	 * Devuelve el valor de las restas que hemos ido acumulando con el metodo
	 * {@link #resAcumulado(double)}
	 * 
	 * @return Devuelve valor acumulado
	 */
	public static double getAcum() {
		return acum;
	}

}