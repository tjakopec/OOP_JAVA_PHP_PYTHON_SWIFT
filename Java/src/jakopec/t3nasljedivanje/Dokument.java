package jakopec.t3nasljedivanje;

import jakopec.t2ucahurivanje.Osoba;

public class Dokument extends Object{
    private int sifra;
    private String brojDokumenta;
    private double iznos;
    private Osoba izradio;

    public Dokument() {
    }

    public Dokument(int sifra, String brojDokumenta, double iznos, Osoba izradio) {
        this.sifra = sifra;
        this.brojDokumenta = brojDokumenta;
        this.iznos = iznos;
        this.izradio = izradio;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getBrojDokumenta() {
        return brojDokumenta;
    }

    public void setBrojDokumenta(String brojDokumenta) {
        this.brojDokumenta = brojDokumenta;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Osoba getIzradio() {
        return izradio;
    }

    public void setIzradio(Osoba izradio) {
        this.izradio = izradio;
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "sifra=" + sifra +
                ", brojDokumenta='" + brojDokumenta + '\'' +
                ", iznos=" + iznos +
                '}';
    }
    
}
