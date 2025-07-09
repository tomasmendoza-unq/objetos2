package publicaciones;

public class Articulo {
    private String titulo;
    private String[] autores;
    private String[] filiaciones;
    private String tipo;
    private String lugarPublicacion;
    private String[] palabrasClave;

    public Articulo(String titulo, String[] autores, String[] filiaciones, String tipo, String lugarPublicacion, String[] palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.filiaciones = filiaciones;
        this.tipo = tipo;
        this.lugarPublicacion = lugarPublicacion;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public String[] getFiliaciones() {
        return filiaciones;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public String[] getPalabrasClave() {
        return palabrasClave;
    }
}
