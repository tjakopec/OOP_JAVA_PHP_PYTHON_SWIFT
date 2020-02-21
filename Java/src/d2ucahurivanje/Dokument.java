package d2ucahurivanje;

public class Dokument {
    private int sifra;
    private String brojDokumenta;
    private double iznos;

    public Dokument() {
    }

    public Dokument(int sifra, String brojDokumenta, double iznos) {
        this.sifra = sifra;
        this.brojDokumenta = brojDokumenta;
        this.iznos = iznos;
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

    public String opisiMe(){
        return this.sifra + " - " + brojDokumenta + " - " + getIznos();
    }
}
