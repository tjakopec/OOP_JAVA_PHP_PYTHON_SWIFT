package model;

public abstract class Entitet {

    private int sifra;

    public Entitet(int sifra) {
        this.sifra = sifra;
    }

    public Entitet() {
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

}
