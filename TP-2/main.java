import Enums.EstadoCivil;
import Models.EPermanente;
import Models.Empleado;
import Models.Empresa;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        EPermanente jorgito = new EPermanente("Jorgito", "2321", LocalDate.of(2000, 10, 15), EstadoCivil.CASADO, 3000.00, 2, 12);

        empleados.add(jorgito);

        Empresa empresa = new Empresa("Marolio", "240213023", empleados);
        System.out.println("Liquidacion total: " + empresa.montoTotalSueldosNetos());
    }

}
