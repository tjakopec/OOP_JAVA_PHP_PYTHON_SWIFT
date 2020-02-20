package model;

public class PartijaDvaIgraca extends Partija {

    private Igrac prvi;
    private Igrac drugi;

    public PartijaDvaIgraca(){
        setVrsta("dvaIgraca");
    }

    public Igrac getPrvi() {
        return prvi;
    }

    public void setPrvi(Igrac prvi) {
        this.prvi = prvi;
    }

    public Igrac getDrugi() {
        return drugi;
    }

    public void setDrugi(Igrac drugi) {
        this.drugi = drugi;
    }


    @Override
    public boolean isIgraGotova() {
        int ukupnoPrvi=getUkupno(Mjesanje.UKUPNO_PRVI_UNOS),ukupnoDrugi=getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS);
        return ukupnoPrvi==ukupnoDrugi ? false : ukupnoPrvi>getDoKolikoSeIgra() || ukupnoDrugi>getDoKolikoSeIgra();
    }

    @Override
    public String toString() {
        return "Partija DVA IGRAČA, igra gotova: " + isIgraGotova() + ", " + getPrvi() + ": " + getUkupno(Mjesanje.UKUPNO_PRVI_UNOS) +
                " | "+ getDrugi() + ": " + getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS);
    }


}
