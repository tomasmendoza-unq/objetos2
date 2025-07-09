public class InsertCoin extends StateGame{
    @Override
    void agregarFicha(Arcade arcade) {
        arcade.setEstado(new SinglerPlayer());
    }

    @Override
    int iniciarJuego() {
        return 0;
    }
}
