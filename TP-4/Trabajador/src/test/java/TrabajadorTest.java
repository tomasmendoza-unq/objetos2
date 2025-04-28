
import com.models.ITrabajador;
import com.models.Ingreso;
import com.models.IngresoHSExtras;
import com.models.Trabajador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TrabajadorTest {

    Ingreso ingreso;

    IngresoHSExtras ingresoHSExtras;

    Trabajador trabajador;

    @BeforeEach
    public void setUp(){
        ingreso = new Ingreso("Julio", 20d, "Sueldo");
        ingresoHSExtras = new IngresoHSExtras("Julio", 20d, "idk", 2);
        trabajador = new Trabajador();
    }

    @Test
    public void testTotalPercibido() {
        assertEquals(0, trabajador.getTotalPercibido());
        trabajador.registrarIngreso(ingreso);
        assertEquals(20d, trabajador.getTotalPercibido());
        trabajador.registrarIngreso(ingresoHSExtras);
        assertEquals(40d, trabajador.getTotalPercibido());
    }

    @Test
    public void  testMontoPercibido(){
        assertEquals(0, trabajador.getMontoImponible());
        trabajador.registrarIngreso(ingreso);
        assertEquals(20d, trabajador.getMontoImponible());
        trabajador.registrarIngreso(ingresoHSExtras);
        assertEquals(20d, trabajador.getMontoImponible());
    }

    @Test
    public void  testImpuestoAPagar(){
        assertEquals(0, trabajador.getImpuestoAPagar());
        trabajador.registrarIngreso(ingreso);
        assertEquals(4d, trabajador.getImpuestoAPagar());
        trabajador.registrarIngreso(ingresoHSExtras);
        assertEquals(4d, trabajador.getImpuestoAPagar());
    }

}
