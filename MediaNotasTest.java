
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MediaNotasTest {

    @Test
    public void testMediaTresNotas() {
        assertEquals(5.0, MediaNotas.calculaMedia(5.0, 5.0, 5.0), 0.001);
    }

    @Test
    public void testTodasNotasZero() {
        assertEquals(0.0, MediaNotas.calculaMedia(0.0, 0.0, 0.0), 0.001);
    }

    @Test
    public void testNotasMaximas() {
        assertEquals(10.0, MediaNotas.calculaMedia(10.0, 10.0, 10.0), 0.001);
    }

    @Test
    public void testNotasComDecimais() {
        assertEquals(6.5, MediaNotas.calculaMedia(5.5, 6.5, 7.5), 0.001);
    }

    @Test
    public void testNotaForaDoLimite() {
        assertThrows(IllegalArgumentException.class, () -> {
            MediaNotas.calculaMedia(11.0, 5.0, 7.0);
        });
    }
}