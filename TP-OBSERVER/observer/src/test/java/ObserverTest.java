import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publicaciones.Articulo;
import publicaciones.CanalArticulos;
import publicaciones.Observer;
import publicaciones.Subject;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ObserverTest {

    Observer observer;
    Subject subject;
    Subject subject2;
    Articulo articulo;

    @BeforeEach
    public void setUp(){
        articulo = mock(Articulo.class);
        observer = new CanalArticulos();
        subject = mock(Subject.class);
        subject2 = mock(Subject.class);
    }

    @Test
    public void agregarSubject(){
        observer.registrar(subject);

        assertTrue(observer.estaSubject(subject));
    }

    @Test
    public void llamoALosSubject(){
        when(subject.estaInteresadoEn(articulo)).thenReturn(true);
        when(subject2.estaInteresadoEn(articulo)).thenReturn(false);

        observer.registrar(subject);
        observer.registrar(subject2);

        observer.publicar(articulo);

        verify(subject).notificar(articulo);
        verify(subject).estaInteresadoEn(articulo);

        verify(subject2,never()).notificar(articulo);
        verify(subject2).estaInteresadoEn(articulo);

    }
}
