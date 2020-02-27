package jakopec.model;

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
    public Rezulat getRezultat() {
        return new Rezulat(getBodovaPrviUnos() + getZvanjePrviUnos(),
                getBodovaDrugiUnos() + getZvanjeDrugiUnos(),
                getBodovaTreciUnos() + getZvanjeTreciUnos());
    }
}
