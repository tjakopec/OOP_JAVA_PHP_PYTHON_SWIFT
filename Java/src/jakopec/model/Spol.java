package jakopec.model;

public enum Spol {

    ZENSKO(0), MUSKO(1);

    private int id;

    Spol(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

}
