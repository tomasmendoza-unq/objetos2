package publicaciones;

import java.util.ArrayList;
import java.util.List;

public class CanalArticulos implements Observer {

    private List<Subject> subscriptores;

    public CanalArticulos(){
        subscriptores = new ArrayList<>();
    }

    @Override
    public void registrar(Subject investigador) {
        subscriptores.add(investigador);
    }

    @Override
    public void quitar(Subject investigador) {
        subscriptores.remove(investigador);
    }

    @Override
    public void publicar(Articulo articulo) {
        subscriptores.stream().filter(subject -> subject.estaInteresadoEn(articulo)).forEach(subject -> subject.notificar(articulo));
    }

    public boolean estaSubject(Subject subject){
        return subscriptores.contains(subject);
    }
}
