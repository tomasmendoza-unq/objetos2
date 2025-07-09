package encuentrosDeportivos;

import java.util.List;

public class ServidorChannel implements Observer {
    List<Subject> subscriptores;

    @Override
    public void registrar(Subject servidor) {
        subscriptores.add(servidor);
    }

    @Override
    public void quitar(Subject servidor) {
        subscriptores.remove(servidor);
    }

    @Override
    public void publicar(Partido partido) {
        subscriptores.stream().filter(subject -> subject.estaInteresadoEn(partido)).forEach(subject -> subject.notificar(partido));
    }
}
