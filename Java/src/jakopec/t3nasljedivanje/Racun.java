package jakopec.t3nasljedivanje;

public class Racun extends Dokument {

    private String kupac;

    public Racun() {
        super();
    }

    public Racun(int sifra, String brojDokumenta, double iznos, String kupac) {
        super(sifra, brojDokumenta, iznos,null);
        this.kupac = kupac;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    @Override
    public String toString() {
        return "Racun{" +
                "kupac='" + kupac + '\'' +
                '}' + " koji nasljeđuje " + super.toString();
    }
}
