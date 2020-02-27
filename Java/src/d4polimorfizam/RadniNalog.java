package d4polimorfizam;

public class RadniNalog extends Dokument {

    private Osoba radnik;

    @Override
    public void obradiDokument() {
        System.out.println("Obrađujem radni nalog");
    }

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
