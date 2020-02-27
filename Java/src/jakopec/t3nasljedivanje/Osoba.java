package jakopec.t3nasljedivanje;

public class Osoba {

    private int sifra;
    private String ime;
    private String prezime;

    public Osoba(){
        
    }

    public Osoba(int sifra, String ime, String prezime) {
        this.sifra = sifra;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
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
}
