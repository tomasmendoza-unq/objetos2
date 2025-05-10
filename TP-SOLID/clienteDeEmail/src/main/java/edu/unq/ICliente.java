package edu.unq;

public interface ICliente {
    public void conectar();
    public void recibirNuevos();
    public void enviarCorreo(String asunto, String destinatario, String cuerpo);
}
