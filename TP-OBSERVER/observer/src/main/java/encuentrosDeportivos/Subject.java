package encuentrosDeportivos;

public interface Subject {

    void notificar(Partido partido);
    boolean estaInteresadoEn(Partido partido);
}
