package jakopec.model;

public class MjesanjeDvaUnosa extends Mjesanje {

    private int bodovaPrviUnos;
    private int bodovaDrugiUnos;

    private int zvanjePrviUnos;
    private int zvanjeDrugiUnos;


    public int getBodovaPrviUnos() {
        return bodovaPrviUnos;
    }

    public void setBodovaPrviUnos(int bodovaPrviUnos) {
        this.bodovaPrviUnos = bodovaPrviUnos;
    }

    public int getBodovaDrugiUnos() {
        return bodovaDrugiUnos;
    }

    public void setBodovaDrugiUnos(int bodovaDrugiUnos) {
        this.bodovaDrugiUnos = bodovaDrugiUnos;
    }

    public int getZvanjePrviUnos() {
        return zvanjePrviUnos;
    }

    public void setZvanjePrviUnos(int zvanjePrviUnos) {
        this.zvanjePrviUnos = zvanjePrviUnos;
    }

    public int getZvanjeDrugiUnos() {
        return zvanjeDrugiUnos;
    }

    public void setZvanjeDrugiUnos(int zvanjeDrugiUnos) {
        this.zvanjeDrugiUnos = zvanjeDrugiUnos;
    }


    @Override
    public Rezulat getRezultat() {
        return new Rezulat(getBodovaPrviUnos() + getZvanjePrviUnos(),
                getBodovaDrugiUnos() + getZvanjeDrugiUnos());
    }
}
