package test;

import Enums.EstadoCivil;
import Models.EPermanente;
import Models.Empleado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class testEmpleado {

    Empleado empl;

    @Test
    public void test(){
         empl = new EPermanente("Jorgito", "2321", LocalDate.of(2000, 10, 15), EstadoCivil.CASADO, 3000.00, 2, 12);

         Assertions.assertEquals(empl.getNombre(), "Jorgito");

    }
}
