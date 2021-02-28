package com.itt.calculadora;


/**
 * <p>Clase estatica que realiza las operaciones basicas de division en una calculadora: <br>
 * &nbsp&nbsp- division de dos numeros reales <br>
 * &nbsp&nbsp- division de dos numeos enteros <br>
 * &nbsp&nbsp- inverso de un numero real<br>
 * &nbsp&nbsp- raiz de un numero<br>
 * No esta permitido usar numeros negativos en la division. Su uso inducira a un error
 * en la aplicacion</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Division()}:</em></h3>
 * 				<ul>
 * 					<li> 
 * 						Constructor por defecto que no recibe ningun parametro.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #divReales(double, double)}:</em></h3>
 * 				<ul>
 * 					<li> 
 * 						Metodo para dividir dos numeros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #divEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para dividir dos numeros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #inverso(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para calcular el inverso de un numero.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #raiz(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Metodo para calcular la raiz cuadrada de un numero.
 * 					</li>
 * 				</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizacion de numeros negativos no permitidos:</p>
 * 		Si uno de los numeros pasados es negativo se retorna como valor 0 y
 * 		se manda un mensaje de que solo son permitidos numeros positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de numeros:</p>
 * 		Si en vez de numeros como argumentos se pasan caracteres, en tiempo de 
 * 		compilacion lanza un error ya que como argumentos se piden enteros o reales
 * 	</li>
 * 	<li><p>Si uno de los parametros es 0:</p>
 * 		En este caso si el primer valor es cero, la operacion se realizara sin
 * 		mayor problema. Si el valor que es cero es el segundo, se lanza por consola
 * 		un mensaje de que el divisor no puede ser 0 y se retorna 0.
 * 	</li>
 *</ol>
 *
 * @version 1.0
 * @since 20/01/2021
 * @author Miguel A. Lozano.
 */


public class Division {
	
	/**
	 * Constructor por defecto que no recibe ningun parametro.
	 */
	public Division() {
		
	}
	
	/**
	  * Metodo para dividir dos numeros reales.
	  * @param num1
	  * 		Recoge el primer numero real, que sera el dividendo de la division.
	  * @param num2
	  * 		Recoge el segundo numero real, que sera el divisor de la division,
	  * 		este numero debera ser <b>distinto de cero</b>. 
	  * @return
	  * 		Nos devuelve (retorna) el resultado de la division entre los dos numeros.
	  */
	
	public static double divReales(double num1, double num2) {
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		} else if (num2 == 0){
			System.out.println("El divisor debe ser distinto de 0");
			return 0.00;
		} else {
			return num1 / num2;
		}		 
	}
	
	/**
	  * Metodo para dividir dos numeros enteros.
	  * @param num1
	  * 		Recoge el primer numero entero, que sera el dividendo de la division.
	  * @param num2
	  * 		Recoge el segundo numero entero, que sera el divisor de la division,
	  * 		este numero debera ser <b>distinto de cero</b>. 
	  * @return
	  * 		Nos devuelve el resultado de la division entre los dos numeros, siendo el valor devuelto un numero real.
	  */	
	
	public static double divEnteros(int num1, int num2) {
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		} else if (num2 == 0){
			System.out.println("El divisor no puede ser 0");
			return 0.00;
		} else {
			return (double) num1 / num2;
		}		 
		
	}
		
	/**
	  * Metodo para calcular el inverso de un numero.
	  * @param num
	  * 		Recoge el numero del cual queremos calcular su inverso.
	  * @return
	  * 		Nos devuelve el resultado de la operacion.<br>
	  * 		Si el parametro que se introduce es menor o igual cero, nos devuelve cero.
	  */	
	public static double inverso(double num) {
		
		if(num<0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		}else if(num==0) {
			System.out.println("El divisor no puede ser 0");
			return 0.00;
		}else {
			return 1/num;
		}
		
	}
	
	/**
	  * Metodo para calcular la raiz cuadrada de un numero.
	  * @param num
	  * 		Recoge el numero del cual queremos calcular su raiz.
	  * @return
	  * 		Nos devuelve la raiz cuadrada de num.<br>
	  * 		Si el parametro que se introduce es menor o igual cero, nos devuelve cero
	  */
	public static double raiz(double num) {
		
		if(num < 0) {
			System.out.println("La calculadora solo admite numeros positivos.");
			return 0.00;
		} else if (num == 0){
			System.out.println("El numero no puede ser 0");
			return 0.00;
		} else {
			return (Math.sqrt(num));
		}
	
		
	}
	

}