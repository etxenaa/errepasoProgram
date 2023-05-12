package CajaNegra;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Main {
	@Test
    public void testParticiones() {
        assertEquals(false, Main.esParEntre1000y2000(999));
        assertEquals(true, Main.esParEntre1000y2000(1000));
        assertEquals(false, Main.esParEntre1000y2000(1001));
        assertEquals(true, Main.esParEntre1000y2000(2000));
        assertEquals(false, Main.esParEntre1000y2000(2001));
    }

    @Test
    public void testValoresLimite() {
        assertEquals(false, Main.esParEntre1000y2000(999));
        assertEquals(true, Main.esParEntre1000y2000(1000));
        assertEquals(true, Main.esParEntre1000y2000(2000));
        assertEquals(false, Main.esParEntre1000y2000(2001));
    }

    @Test
    public void testConjeturaErrores() {
        assertEquals(false, Main.esParEntre1000y2000(0));
        assertEquals(false, Main.esParEntre1000y2000(-1));
    }
}
