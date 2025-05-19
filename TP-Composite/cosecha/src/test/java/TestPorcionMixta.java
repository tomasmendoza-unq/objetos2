import com.ejemplo.IPorcion;
import com.ejemplo.PorcionMixta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestPorcionMixta {

    PorcionMixta porcionMixta;
    PorcionMixta porcionMixta2;
    IPorcion trigo;
    IPorcion soja;


    @BeforeEach
    public void setUp(){
        trigo = mock(IPorcion.class);
        soja = mock(IPorcion.class);
        porcionMixta = new PorcionMixta();
        porcionMixta2 = new PorcionMixta();
        porcionMixta.addPorciones(trigo);
        porcionMixta.addPorciones(soja);
        porcionMixta2.addPorciones(trigo);
        porcionMixta.addPorciones(porcionMixta2);
    }

    @Test
    public void testGananciaEnUnaMixta() {
        when(trigo.ganancia()).thenReturn(300);
        when(soja.ganancia()).thenReturn(500);

        int total = porcionMixta.ganancia(); // 🔁 Solo una llamada

        verify(soja).ganancia();
        verify(trigo, times(2)).ganancia(); // Porque se llama 2 veces en total

        assertEquals(1100, total);
    }

}
