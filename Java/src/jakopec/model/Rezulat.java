package jakopec.model;

public class Rezulat {

    private int prvi;
    private int drugi;
    private int treci;

    public Rezulat(int prvi, int drugi) {
        this.prvi = prvi;
        this.drugi = drugi;
    }

    public Rezulat(int prvi, int drugi, int treci) {
        this.prvi = prvi;
        this.drugi = drugi;
        this.treci = treci;
    }

    public int getPrvi() {
        return prvi;
    }

    public void setPrvi(int prvi) {
        this.prvi = prvi;
    }

    public int getDrugi() {
        return drugi;
    }

    public void setDrugi(int drugi) {
        this.drugi = drugi;
    }

    public int getTreci() {
        return treci;
    }

    public void setTreci(int treci) {
        this.treci = treci;
    }

    public boolean isPocetak(){
        return prvi==0 && drugi==0 && treci==0;
    }
}
