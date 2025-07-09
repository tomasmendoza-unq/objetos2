package encuentrosDeportivos;

import java.util.List;

public class Partido {
    int resultado;
    List<String> coordinadores;
    Categoria categoria;

    public int getResultado() {
        return resultado;
    }

    public List<String> getCoordinadores() {
        return coordinadores;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
