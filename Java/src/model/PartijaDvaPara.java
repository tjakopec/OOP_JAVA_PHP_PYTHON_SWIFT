package model;

import java.util.Collections;
import java.util.List;

public class PartijaDvaPara extends Partija {

    private List<Igrac> prvi;
    private List<Igrac> drugi;

    public PartijaDvaPara(){
        setVrsta("dvaPara");
    }

    public List<Igrac> getPrvi() {
        return prvi;
    }

    public void setPrvi(List<Igrac> prvi) {
        this.prvi = prvi;
    }

    public List<Igrac> getDrugi() {
        return drugi;
    }

    public void setDrugi(List<Igrac> drugi) {
        this.drugi = drugi;
    }

    @Override
    public boolean isIgraGotova() {
        int ukupnoPrvi=getUkupno(Mjesanje.UKUPNO_PRVI_UNOS),ukupnoDrugi=getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS);
        return ukupnoPrvi==ukupnoDrugi ? false : ukupnoPrvi>getDoKolikoSeIgra() || ukupnoDrugi>getDoKolikoSeIgra();
    }

    @Override
    public String toString() {
        return "Partija DVA PARA, igra gotova: " + isIgraGotova() + ", " + getPrvi().get(0) + " i " + getPrvi().get(1) + ": " + getUkupno(Mjesanje.UKUPNO_PRVI_UNOS) +
                " | "+ getDrugi().get(0) + " i " + getDrugi().get(1)  + ": " + getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS);
    }



}
