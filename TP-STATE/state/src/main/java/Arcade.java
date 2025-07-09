public class Arcade {

    StateGame stateGame;

    public Arcade(StateGame stateGame){
        this.stateGame = stateGame;
    }

    public void agregarFicha() {
        stateGame.agregarFicha(this);
    }

    public int iniciarJuego() {
         return stateGame.iniciarJuego();
    }

    public void setEstado(StateGame stateGame) {
        this.stateGame = stateGame;
    }
}
