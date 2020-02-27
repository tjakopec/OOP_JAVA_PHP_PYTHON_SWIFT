package jakopec.t4polimorfizam;


import java.util.ArrayList;
import java.util.List;

public class Start {

    private List<Dokument> dokumenti;

    public  Start(){

       // Dokument dokument = new Dokument(); Dokument je abstraktna klasa i ne može se instancirati

        dokumenti = new ArrayList<>();

        RadniNalog radniNalog = new RadniNalog();
        radniNalog.setSifra(1);
        radniNalog.setBrojDokumenta("RN1");
        radniNalog.setIznos(1200);
        radniNalog.setRadnik(new Osoba(1,"Marko","Markovina"));
        System.out.println(radniNalog);
        dokumenti.add(radniNalog);


        Racun racun = new Racun();
        racun.setSifra(1);
        racun.setBrojDokumenta("2020-001");
        racun.setIznos(1200.34);
        racun.setKupac("FFOS");
        System.out.println(racun);
        dokumenti.add(racun);

        obradiDokumente();
    }

    private void obradiDokumente(){
        System.out.println("forEach funkcija");
        dokumenti.forEach((d)->{d.obradiDokument();});

        //ako nekog buni gornja sintaksa evo još dvije
        System.out.println("for petlja");
        for(int i=0;i<dokumenti.size();i++){
            dokumenti.get(i).obradiDokument();
        }
        System.out.println("foreach petlja");
        for (Dokument d: dokumenti) {
            d.obradiDokument();
        }
    }

    public static void main(String[] args) {
        new Start();
    }
}
