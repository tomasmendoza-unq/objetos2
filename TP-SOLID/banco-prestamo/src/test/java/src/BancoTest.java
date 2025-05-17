package src;

import Factory.IFactoryCredito;
import com.modules.*;
import com.modules.impls.Banco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    IBanco banco;
    ICliente cliente;
    ISolicitudDeCredito solicitudDeCredito;
    IFactoryCredito factoryCredito;
    IPropiedad propiedad;

    @BeforeEach
    public void setUp(){
        cliente = mock(ICliente.class);
        solicitudDeCredito = mock(ISolicitudDeCredito.class);
        factoryCredito = mock(IFactoryCredito.class);
        propiedad = mock(IPropiedad.class);
        banco = new Banco(factoryCredito);
        when(factoryCredito.crearSolicitudDeCredito(cliente,1000D,12, propiedad)).thenReturn(solicitudDeCredito);
        when(factoryCredito.crearSolicitudDeCredito(cliente,1000D,12)).thenReturn(solicitudDeCredito);
    }

    @Test
    public void testBancoEntregaCreditoPersonal(){

        when(solicitudDeCredito.seAcepto()).thenReturn(true);

        double montoObtenido = banco.solicitudDeCreditoPersonal(cliente, 1000D,12);

        verify(factoryCredito).crearSolicitudDeCredito(cliente,1000D,12);

        assertEquals(1000D, montoObtenido);
    }

    @Test
    public void testBancoNoEntregaCreditoPersonal(){
        when(solicitudDeCredito.seAcepto()).thenReturn(false);

        double montoObtenido = banco.solicitudDeCreditoPersonal(cliente, 1000D,12);

        verify(factoryCredito).crearSolicitudDeCredito(cliente,1000D,12);

        assertEquals(0D, montoObtenido);
    }

    @Test
    public void testBancoEntregaCreditoHipotecario(){
        when(solicitudDeCredito.seAcepto()).thenReturn(true);

        double montoObtenido = banco.solicitudDeCreditoHipotecario(cliente, 1000D,12, propiedad);

        verify(factoryCredito).crearSolicitudDeCredito(cliente,1000D,12, propiedad);

        assertEquals(1000D, montoObtenido);
    }

    @Test
    public void testBancoNoEntregaCreditoHipotecario(){
        when(solicitudDeCredito.seAcepto()).thenReturn(false);

        double montoObtenido = banco.solicitudDeCreditoHipotecario(cliente, 1000D,12, propiedad);

        verify(factoryCredito).crearSolicitudDeCredito(cliente,1000D,12, propiedad);

        assertEquals(0D, montoObtenido);
        assertTrue(banco.tieneSolicitud(solicitudDeCredito));
    }


}
