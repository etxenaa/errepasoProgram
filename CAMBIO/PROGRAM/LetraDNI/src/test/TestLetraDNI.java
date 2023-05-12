package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import principal.CalcularLetraDNI;

class TestLetraDNI {
	/**
	 * Este listado de DNI con su letra es correcto.
	 * Si la funci�n que calcula la letra no funciona bien habr� que corregirla
	 * 
	 * @param dni
	 * @param dniConLetra
	 */
	@ParameterizedTest
	@CsvSource({
	    "74711344,	74711344F",
	    "95269433,	95269433Y",
	    "06660069,	06660069M",
	    "27701627,	27701627J",
	    "37751673,	37751673W",
	    "61544553,	61544553A",
	    "31701622,	31701622D",
	    "31268959,	31268959E",
	    "63836124,	63836124S",
	    "20648195,	20648195Z",
	    "32365616,	32365616Q",
	    "61985593,	61985593H",
	    "48712122,	48712122P",
	    "47373370,	47373370V",
	    "89061301,	89061301B",
	    "31678738,	31678738X",
	    "28410337,	28410337R",
	    "18771423,	18771423L",
	    "69842732,	69842732N",
	    "33867498,	33867498K",
	    "39326777,	39326777C",
	    "14864030,	14864030G"
	})
	void test(String dni, String dniConLetra) {
		assertEquals(dniConLetra, CalcularLetraDNI.obtenerDNIyLetra(dni));
	}

}
