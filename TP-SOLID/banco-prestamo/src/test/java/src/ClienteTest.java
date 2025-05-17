package src;

import com.modules.*;
import com.modules.impls.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    ICliente cliente;
    IBanco banco;
    IPropiedad propiedad;

    @BeforeEach
    public void setup(){
        banco = mock(IBanco.class);
        propiedad = mock(IPropiedad.class);
        cliente = new Cliente("Juan", "baldez", "243", 20, banco, 12D);
        cliente.agregarPropiedad(propiedad);
    }

    @Test
    public void testClientePideCreditoPersonalYElBancoLaRecibe(){
        cliente.solicitarCreditoPersonal(1200D, 12);

        verify(banco).solicitudDeCreditoPersonal(cliente, 1200D, 12);

    }
    @Test
    public void testClientePideCreditoHipotecarioYElBancoLaRecibe(){
        cliente.solicitarCreditoHipotecario(1200D, 12, 0);
        when(propiedad.getValorFiscal()).thenReturn(5000D);

        verify(banco).solicitudDeCreditoHipotecario(cliente, 1200D, 12, propiedad);

    }



    @Test
    public void testClienteCalculaSuIngresoMensual(){
        assertEquals(144D, cliente.getSueldoNetoAnual());
    }
}
