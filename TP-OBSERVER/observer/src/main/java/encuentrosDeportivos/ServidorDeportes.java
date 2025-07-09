package encuentrosDeportivos;

import java.util.List;

public class ServidorDeportes implements Subject{
    List<Categoria> categoriaList;

    public void notificar(Partido partido){

    }
    public final boolean estaInteresadoEn(Partido partido){
        return this.estaMiCategoria(partido) && this.otrosIntereses(partido);
    }

    public boolean estaMiCategoria(Partido partido) {
        return categoriaList.contains(partido.getCategoria());
    }

    public boolean otrosIntereses(Partido partido){
        return true;
    };
}
