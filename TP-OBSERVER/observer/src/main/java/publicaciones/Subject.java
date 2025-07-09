package publicaciones;

public interface Subject {

    void notificar(Articulo articulo);
    boolean estaInteresadoEn(Articulo articulo);
}
