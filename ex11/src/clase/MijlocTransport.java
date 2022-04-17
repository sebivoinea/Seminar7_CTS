package clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> lista;
    private int nrLinie;

    public MijlocTransport(int nrLinie) {
        this.lista = new ArrayList<>();
        this.nrLinie= nrLinie;
    }

    public void adaugaCalator(ICalator calator) {
        lista.add(calator);
    }

    public void stergeCalator(ICalator calator) {
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj) {
        for (ICalator c : lista) {
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajePlecareCapatLinie() {
        trimiteMesaj("Autobuzul numarul " + nrLinie + " a plecat din capatul de linie!!");
    }
}
