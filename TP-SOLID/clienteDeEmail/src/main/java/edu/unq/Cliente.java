package edu.unq;

public class Cliente implements ICliente{
    private IServidor servidor;

    private String nombreUsuario;

    private String passUsuario;

    private IEmail email;

    public Cliente(IServidor servidor, String nombreUsuario, String passUsuario, IEmail email) {
        this.servidor = servidor;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
        this.email = email;
    }

    @Override
    public void conectar(){
        this.servidor.conectar(this.nombreUsuario,this.passUsuario);
    }

    @Override
    public void recibirNuevos(){
        this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
    }

    @Override
    public void enviarCorreo(String asunto, String destinatario, String cuerpo){
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        this.servidor.enviar(correo);
    }
}
