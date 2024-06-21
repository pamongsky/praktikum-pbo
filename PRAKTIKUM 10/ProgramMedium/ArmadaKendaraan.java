import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan {
    private List<Object> armada = new ArrayList<>();

    public void tambahArmada(Collection<?> kendaraan) {
        armada.addAll(kendaraan);
    }

    public List<Object> getAllArmada() {
        return armada;
    }
}
