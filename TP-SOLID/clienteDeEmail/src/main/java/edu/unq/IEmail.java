package edu.unq;

public interface IEmail {
    public void borrarCorreo(ICorreo correo);
    public int contarBorrados();
    public int contarInbox();
    public void eliminarBorrado(ICorreo correo);
}
