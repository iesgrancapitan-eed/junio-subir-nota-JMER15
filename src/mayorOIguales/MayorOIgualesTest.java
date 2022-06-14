package mayorOIguales;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MayorOIgualesTest {

	@Test
	//Camino 1
	void testMayorOIguales1() {
		MayorOIguales prueba1 = new MayorOIguales();
		assertEquals(prueba1.mayorOIguales(0, 0), "Iguales");
	}
	
	@Test
	//Camino 2
	void testMayorOIguales2() {
		MayorOIguales prueba2 = new MayorOIguales();
		assertEquals(prueba2.mayorOIguales(7, 2), "a es mayor que b");
	}
	
	@Test
	//Camino 3
	void testMayorOIguales3() {
		MayorOIguales prueba3 = new MayorOIguales();
		assertEquals(prueba3.mayorOIguales(2, 7), "a es menor que b");
	}

}
