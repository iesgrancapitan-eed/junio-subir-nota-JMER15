package mayorOIguales;

/**
 * Programa que nos indica si un número es mayor, menor o igual a otro dado
 * 
 * @author José Miguel Escribano Ruiz
 * 
 * 04/06/2022
 *
 */

public class MayorOIguales {
	
	public String mayorOIguales(int a, int b) {
		if (a == b) 
			return ("Iguales"); 
		else if (a > b)  
			return ("a: " + a + " es mayor"); 
		else
			return ("b: " + b + " es mayor"); 
	}
}
