package publicaciones;

public class Investigador implements Subject {
    private String nombre;
    private String lugarInteres;

    public Investigador(String nombre, String lugarInteres) {
        this.nombre = nombre;
        this.lugarInteres = lugarInteres;
    }

    @Override
    public void notificar(Articulo articulo) {
        System.out.println(nombre + " fue notificado sobre el artículo: " + articulo.getTitulo());
    }

    @Override
    public boolean estaInteresadoEn(Articulo articulo) {
        return articulo.getLugarPublicacion().equalsIgnoreCase(lugarInteres);
    }
}
