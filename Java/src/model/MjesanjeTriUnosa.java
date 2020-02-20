package model;

public class MjesanjeTriUnosa extends MjesanjeDvaUnosa {

    private int bodovaTreciUnos;

    private int zvanjeTreciUnos;

    public int getBodovaTreciUnos() {
        return bodovaTreciUnos;
    }

    public void setBodovaTreciUnos(int bodovaTreciUnos) {
        this.bodovaTreciUnos = bodovaTreciUnos;
    }

    public int getZvanjeTreciUnos() {
        return zvanjeTreciUnos;
    }

    public void setZvanjeTreciUnos(int zvanjeTreciUnos) {
        this.zvanjeTreciUnos = zvanjeTreciUnos;
    }

    @Override
    public int getUkupno(int redniBroj) {
        switch (redniBroj){
            case Mjesanje.UKUPNO_PRVI_UNOS:
            case Mjesanje.UKUPNO_DRUGI_UNOS:
                return super.getUkupno(redniBroj);
            case Mjesanje.UKUPNO_TRECI_UNOS:
                return this.bodovaTreciUnos + this.zvanjeTreciUnos;
                default:
                    return 0;
        }
    }
}
