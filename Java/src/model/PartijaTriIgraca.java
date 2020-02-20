package model;

public class PartijaTriIgraca extends PartijaDvaIgraca {

    private Igrac treci;

    public PartijaTriIgraca(){
        setVrsta("triIgraca");
    }

    public Igrac getTreci() {
        return treci;
    }

    public void setTreci(Igrac treci) {
        this.treci = treci;
    }

    @Override
    public boolean isIgraGotova() {
        int ukupnoPrvi=getUkupno(Mjesanje.UKUPNO_PRVI_UNOS);
        int ukupnoDrugi=getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS);
        int ukupnoTreci=getUkupno(Mjesanje.UKUPNO_TRECI_UNOS);

        if(ukupnoPrvi==ukupnoDrugi || ukupnoPrvi==ukupnoTreci || ukupnoDrugi==ukupnoTreci){
            return false;
        }

        if (ukupnoPrvi>getDoKolikoSeIgra() || ukupnoDrugi>getDoKolikoSeIgra() || ukupnoTreci>getDoKolikoSeIgra()){
            return true;
        }


        return false;
    }

    @Override
    public String toString() {
        return "Partija TRI IGRAČA, igra gotova: " + isIgraGotova() + ", " + getPrvi() + ": " + getUkupno(Mjesanje.UKUPNO_PRVI_UNOS) +
                " | "+ getDrugi() + ": " + getUkupno(Mjesanje.UKUPNO_DRUGI_UNOS) + " | "+ getTreci() + ": " + getUkupno(Mjesanje.UKUPNO_TRECI_UNOS);
    }


}
