package jakopec.model;

public class PartijaDvaIgraca extends Partija {

    @Override
    public String toString() {
        Rezulat rezultat = getRezultat();
        return "Partija DVA IGRAČA, igra gotova: " + isIgraGotova() + ", " + getIgraci().get(0) + ": " +
                rezultat.getPrvi() +
                " | "+ getIgraci().get(1) + ": " + rezultat.getDrugi();
    }

}
