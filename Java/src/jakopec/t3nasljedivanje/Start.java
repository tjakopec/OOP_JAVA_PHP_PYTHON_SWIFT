package jakopec.t3nasljedivanje;

import javax.print.attribute.standard.NumberOfDocuments;

public class Start {

    public  Start(){


        Nova n = new Nova();
        System.out.println(n);




        Dokument dokument = new Dokument();
        dokument.setSifra(1);
        dokument.setBrojDokumenta("D1");
        dokument.setIznos(200);
        System.out.println(dokument);


        RadniNalog radniNalog = new RadniNalog();
        radniNalog.setSifra(1);
        radniNalog.setBrojDokumenta("RN1");
        radniNalog.setIznos(1200);
        radniNalog.setRadnik(new Osoba(1,"Marko","Markovina"));
        System.out.println(radniNalog);



        Racun racun = new Racun();
        racun.setSifra(1);
        racun.setBrojDokumenta("2020-001");
        racun.setIznos(1200.34);
        racun.setKupac("FFOS");
        System.out.println(racun);

    }

    public static void main(String[] args) {
        new Start();
    }
}
