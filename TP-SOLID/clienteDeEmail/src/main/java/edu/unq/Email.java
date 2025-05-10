package edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Email implements IEmail{

    private List<ICorreo> inbox;
    private List<ICorreo> borrados;

    public Email() {
        this.borrados = new ArrayList<ICorreo>();
        this.inbox = new ArrayList<ICorreo>();
    }

    @Override
    public void borrarCorreo(ICorreo correo) {
        this.inbox.remove(correo);
        this.borrados.remove(correo);
    }


    @Override
    public int contarBorrados(){
        return this.borrados.size();
    }


    @Override
    public int contarInbox(){
        return this.inbox.size();
    }


    @Override
    public void eliminarBorrado(ICorreo correo) {
        this.borrados.remove(correo);
    }

}
