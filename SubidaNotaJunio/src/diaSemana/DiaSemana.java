package diaSemana;

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


