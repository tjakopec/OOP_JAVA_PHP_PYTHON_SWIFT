package jakopec.model;

public class Igrac extends Entitet {

    private String ime;
    private String prezime;
    private String urlSlika;
    private int spol;

    public Igrac() {
    }

    public Igrac(int sifra, String ime, String prezime, String urlSlika, int spol) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.urlSlika = urlSlika;
        this.spol = spol;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUrlSlika() {
        return urlSlika;
    }

    public void setUrlSlika(String urlSlika) {
        this.urlSlika = urlSlika;
    }

    public int getSpol() {
        return spol;
    }

    public void setSpol(int spol) {
        this.spol = spol;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
