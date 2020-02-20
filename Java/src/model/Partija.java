package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Partija extends Entitet {

    public abstract Rezulat getRezultat();

    private int doKolikoSeIgra;
    private Lokacija lokacija;
    private Igrac unosi;
    private List<Mjesanje> mjesanja = new ArrayList<>();
    private List<Igrac> igraci = new ArrayList<>();


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

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public void setIgraci(List<Igrac> igraci) {
        this.igraci = igraci;
    }

    public boolean isIgraGotova() {

        Rezulat rezulat = getRezultat();

        if(rezulat.isPocetak()){
            return false;
        }

        if(rezulat.getTreci()==0){
            return rezulat.getPrvi()==rezulat.getDrugi() ? false : rezulat.getPrvi()>getDoKolikoSeIgra() || rezulat.getDrugi()>getDoKolikoSeIgra();
        }else{
            if(rezulat.getPrvi()==rezulat.getDrugi() || rezulat.getPrvi()==rezulat.getTreci() || rezulat.getDrugi()==rezulat.getTreci()){
                return false;
            }

            /* ne treba jer imam na kraju return true
            if (rezulat.getPrvi()>getDoKolikoSeIgra() || rezulat.getDrugi()>getDoKolikoSeIgra() || rezulat.getTreci()>getDoKolikoSeIgra()){
                return true;
            }
            */
        }

        return true;
    }
}
