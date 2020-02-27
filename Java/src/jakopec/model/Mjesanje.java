package jakopec.model;

import java.util.Date;

public abstract class Mjesanje extends Entitet {

    public abstract Rezulat getRezultat();

    private boolean stiglja;
    private boolean belot;
    private Date datumUnosa = new Date();

    public boolean isBelot() {
        return belot;
    }

    public void setBelot(boolean belot) {
        this.belot = belot;
    }

    public boolean isStiglja() {
        return stiglja;
    }

    public void setStiglja(boolean stiglja) {
        this.stiglja = stiglja;
    }

    public Date getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(Date datumUnosa) {
        this.datumUnosa = datumUnosa;
    }


}
