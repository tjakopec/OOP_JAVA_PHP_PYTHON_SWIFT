package jakopec.t4polimorfizam;

public class RadniNalog extends Dokument {

    private Osoba radnik;

    @Override
    public void obradiDokument() {
        System.out.println("Obrađujem radni nalog");
    }

    @Override
    public String getOpis() {
        return null;
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
