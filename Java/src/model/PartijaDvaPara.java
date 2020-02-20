package model;


public class PartijaDvaPara extends Partija {

    @Override
    public String toString() {
        Rezulat rezulat = getRezultat();
        return "Partija DVA PARA, igra gotova: " + isIgraGotova() + ", " +
                getIgraci().get(0) + " i " + getIgraci().get(1) + ": " + rezulat.getPrvi() + " | "+
                getIgraci().get(2) + " i " + getIgraci().get(3)  + ": " + rezulat.getDrugi();
    }

    @Override
    public Rezulat getRezultat() {
        Rezulat rezulat = new Rezulat(getMjesanja().stream().mapToInt(x->x.getRezultat().getPrvi()).sum(),
                getMjesanja().stream().mapToInt(x->x.getRezultat().getDrugi()).sum());
        return rezulat;
    }

}
