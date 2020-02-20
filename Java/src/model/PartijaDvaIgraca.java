package model;

public class PartijaDvaIgraca extends Partija {

    @Override
    public String toString() {
        Rezulat rezulat = getRezultat();
        return "Partija DVA IGRAČA, igra gotova: " + isIgraGotova() + ", " + getIgraci().get(0) + ": " +
                rezulat.getPrvi() +
                " | "+ getIgraci().get(1) + ": " + rezulat.getDrugi();
    }

    @Override
    public Rezulat getRezultat() {
        Rezulat rezulat = new Rezulat(getMjesanja().stream().mapToInt(x->x.getRezultat().getPrvi()).sum(),
                getMjesanja().stream().mapToInt(x->x.getRezultat().getDrugi()).sum());
        return rezulat;
    }
}
