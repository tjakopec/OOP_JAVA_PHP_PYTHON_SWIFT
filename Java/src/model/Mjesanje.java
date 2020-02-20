package model;

import java.util.Date;

public abstract class Mjesanje extends Entitet {

    public static final int UKUPNO_PRVI_UNOS =1;
    public static final int UKUPNO_DRUGI_UNOS =2;
    public static final int UKUPNO_TRECI_UNOS =3;

    private boolean stiglja;

    public boolean isStiglja() {
        return stiglja;
    }

    public void setStiglja(boolean stiglja) {
        this.stiglja = stiglja;
    }

    public abstract int getUkupno(int redniBroj);

    private Date datumUnosa = new Date();

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }


}
