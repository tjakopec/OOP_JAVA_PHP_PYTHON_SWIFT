package jakopec.t3nasljedivanje;

public class RadniNalog extends Dokument {

    private Osoba radnik;

    public RadniNalog(){

    }

    public RadniNalog(Osoba radnik) {
        this.radnik = radnik;
    }



    public Osoba getRadnik() {
        return radnik;
    }

    public void setRadnik(Osoba radnik) {
        this.radnik = radnik;
    }
}
