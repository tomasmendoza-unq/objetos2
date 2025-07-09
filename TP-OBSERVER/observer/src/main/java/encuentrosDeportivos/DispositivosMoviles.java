package encuentrosDeportivos;

import java.util.List;

public class DispositivosMoviles extends ServidorDeportes{
    List<String> coord;

    @Override
    public boolean otrosIntereses(Partido partido) {
        return coord.stream().anyMatch(c -> partido.getCoordinadores().contains(c));
    }


}
