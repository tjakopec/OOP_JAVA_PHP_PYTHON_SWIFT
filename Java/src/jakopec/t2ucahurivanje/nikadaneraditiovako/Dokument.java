package jakopec.t2ucahurivanje.nikadaneraditiovako;

public class Dokument {

    int sifra;
    String brojDokumenta;
    double iznos;

    void obrada(){
        System.out.println("Obrađujem " + sifra + " - " + brojDokumenta + " - " + iznos);
    }

}
