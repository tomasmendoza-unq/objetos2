package encuentrosDeportivos;

public interface Observer {
    public void registrar(Subject servidor);
    public void quitar(Subject servidor);
    public void publicar(Partido partido);
}
