package hu.kocsma.wysio.kocsma.model;

import java.util.ArrayList;
import java.util.List;

public class Fogyasztas {
    private List<Ital> italLista;
    private int elfogyaszottEgyses;
    public Fogyasztas() {
        italLista = new ArrayList<>();
    }

    public void hozzaAdItalt(Ital ital) {
        italLista.add(ital);
    }

    public List<Ital> getItalLista() {
        return italLista;
    }

}
