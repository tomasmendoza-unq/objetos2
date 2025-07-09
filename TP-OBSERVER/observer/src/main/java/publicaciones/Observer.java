package publicaciones;

public interface Observer {
    void registrar(Subject investigador);
    void quitar(Subject investigador);
    void publicar(Articulo articulo);
    boolean estaSubject(Subject subject);
}
