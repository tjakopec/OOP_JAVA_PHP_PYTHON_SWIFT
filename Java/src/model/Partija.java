package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Partija extends Entitet {

    public abstract boolean isIgraGotova();

    private String vrsta;
    private int doKolikoSeIgra;
    private Lokacija lokacija;
    private Igrac unosi;
    private List<Mjesanje> mjesanja = new ArrayList<>();


    public String getVrsta(){
     return vrsta;
    }
    public void setVrsta(String vrsta){
        this.vrsta=vrsta;
    }


    public int getDoKolikoSeIgra() {
        return doKolikoSeIgra;
    }

    public void setDoKolikoSeIgra(int doKolikoSeIgra) {
        this.doKolikoSeIgra = doKolikoSeIgra;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public Igrac getUnosi() {
        return unosi;
    }

    public void setUnosi(Igrac unosi) {
        this.unosi = unosi;
    }

    public List<Mjesanje> getMjesanja() {
        return mjesanja;
    }

    public void setMjesanja(List<Mjesanje> mjesanja) {
        this.mjesanja = mjesanja;
    }

    public int getUkupno(int redniBroj){
        int ukupno=0;
        for (Mjesanje m : mjesanja) {
            ukupno+=m.getUkupno(redniBroj);
        }
        return ukupno;
    }


}
