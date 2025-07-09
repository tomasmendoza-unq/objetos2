import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ArcadeTest {

    Arcade arcade;
    StateGame stateGame;

    @BeforeEach
    public void setup(){
        stateGame = mock(StateGame.class);
        arcade = new Arcade(stateGame);
    }

    @Test
    public void arcadeLlamaAgregarFichaEnSuEstado(){
        arcade.agregarFicha();

        verify(stateGame).agregarFicha(arcade);
    }

    @Test
    public void arcadeLlamaIniciarJuego(){
        when(stateGame.iniciarJuego()).thenReturn(2);

        int resultado = arcade.iniciarJuego();

        verify(stateGame).iniciarJuego();

        assertEquals(2, resultado);
    }
}
