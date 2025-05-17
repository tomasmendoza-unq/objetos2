package src;

import Factory.IFactoryCredito;
import Factory.impls.FactoryCredito;
import com.modules.ICliente;
import com.modules.IPropiedad;
import com.modules.ISolicitudDeCredito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class FactoryCreditoTest {

    ICliente cliente;
    IPropiedad propiedad;
    IFactoryCredito factoryCredito;
    ISolicitudDeCredito solicitudDeCredito;

    @BeforeEach
    public void setUp(){
        factoryCredito = new FactoryCredito();
         cliente = mock(ICliente.class);
         solicitudDeCredito = mock(ISolicitudDeCredito.class);
         propiedad = mock(IPropiedad.class);
    }

    @Test
    public void testCrearUnCreditoPersonal(){
        when(cliente.getSueldoNetoMensual()).thenReturn(800D);
        when(cliente.getSueldoNetoAnual()).thenReturn(20000D);

        ISolicitudDeCredito credito = factoryCredito.crearSolicitudDeCredito(cliente, 1000D, 12);


        assertTrue(credito.seAcepto());
    }

    @Test
    public void testCrearUnCreditoHipo(){
        when(cliente.getSueldoNetoMensual()).thenReturn(400D); // <= 500
        when(cliente.getSueldoNetoAnual()).thenReturn(12000D); // 1000 mensual
        when(propiedad.getValorFiscal()).thenReturn(2000D);    // 70% de 2000 = 1400 > 1000
        when(cliente.getEdad()).thenReturn(20);                // +1 año = 21

        ISolicitudDeCredito credito = factoryCredito.crearSolicitudDeCredito(cliente, 1000D, 12, propiedad);

        assertTrue(credito.seAcepto());
    }

}
