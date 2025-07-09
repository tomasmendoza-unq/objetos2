import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StateGameTest {

    StateGame stateGame;
    Arcade arcade;


    @BeforeEach
    public void setup(){
        arcade = mock(Arcade.class);
        stateGame = new InsertCoin();
    }

    @Test
    public void insertCoinLlamaAArcade(){
        stateGame.agregarFicha(arcade);

        verify(arcade).setEstado(any(SinglerPlayer.class));
    }
}
