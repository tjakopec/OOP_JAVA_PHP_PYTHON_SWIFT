package jakopec.model;


public class PartijaDvaPara extends Partija {

    @Override
    public String toString() {
        Rezulat rezulat = getRezultat();
        return "Partija DVA PARA, igra gotova: " + isIgraGotova() + ", " +
                getIgraci().get(0) + " i " + getIgraci().get(1) + ": " + rezulat.getPrvi() + " | "+
                getIgraci().get(2) + " i " + getIgraci().get(3)  + ": " + rezulat.getDrugi();
    }


}
