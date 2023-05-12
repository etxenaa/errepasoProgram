package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import base.Poligono;

class TestPoligono {

	@Test
	void testCalcularPerimetro() {
		Poligono poligonoTest = new Poligono("hexagono");
		poligonoTest.setLados(6);
		poligonoTest.getLados();
		poligonoTest.setLongitudLado(10.0);
		poligonoTest.getLongitudLado();
		poligonoTest.setDibujo(null);
		poligonoTest.getDibujo();
		poligonoTest.getPerimetro();
		Double resultado = poligonoTest.calcularPerimetro();
		assertEquals(60, resultado);
	}

}
