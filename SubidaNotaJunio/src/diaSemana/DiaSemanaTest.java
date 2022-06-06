package diaSemana;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class DiaSemanaTest {

	//Camino 1
	@Test
	void test1() {
		DiaSemana prueba1 = new DiaSemana();
		assertEquals(prueba1.dia("Monday"), "Week day");
	}

	//Camino 2
	@Test
	void test2() {
		DiaSemana prueba2 = new DiaSemana();
		assertEquals(prueba2.dia("Tuesday"), "Week day");
	}

	//Camino 3
	@Test
	void test3() {
		DiaSemana prueba3 = new DiaSemana();
		assertEquals(prueba3.dia("Wednesday"), "Week day");
	}

	//Camino 4
	@Test
	void test4() {
		DiaSemana prueba4 = new DiaSemana();
		assertEquals(prueba4.dia("Thursday"), "Week day");
	}

	//Camino 5
	@Test
	void test5() {
		DiaSemana prueba5 = new DiaSemana();
		assertEquals(prueba5.dia("Friday"), "Week day");
	}

	//Camino 6
	@Test
	void test6() {
		DiaSemana prueba6 = new DiaSemana();
		assertEquals(prueba6.dia("Saturday"), "Weekend");
	}

	//Camino 7
	@Test
	void test7() {
		DiaSemana prueba7 = new DiaSemana();
		assertEquals(prueba7.dia("Sunday"), "Weekend");
	}

	//Camino 8
	@Test
	void test8() {
		DiaSemana prueba8 = new DiaSemana();
		assertEquals(prueba8.dia("AAAAAAA"), "Unknown");
	}
}
