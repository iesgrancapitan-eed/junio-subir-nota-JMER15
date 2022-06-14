package diaSemana;

/**
 * Ejercicio 2 de eclemma con estructura Switch
 * 
 * @author José Miguel Escribano Ruiz
 * 
 * Fecha: 04/06/2022
 *
 */

public class DiaSemana {

	public String dia(String dia) {
		return switch (dia) {
		case "Monday" -> "Week day";
		case "Tuesday" -> "Week day";
		case "Wednesday" -> "Week day";
		case "Thursday" -> "Week day";
		case "Friday" -> "Week day";
		case "Saturday" -> "Weekend";
		case "Sunday" -> "Weekend";
		default -> "Unknown";
		};
	}
}
