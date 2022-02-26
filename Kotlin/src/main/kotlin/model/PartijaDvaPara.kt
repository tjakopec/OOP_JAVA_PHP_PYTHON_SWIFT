package model

/**
 * @author Matija Skrletović
 **/

class PartijaDvaPara(
    override var doKolikoSeIgra: Int, override val lokacija: Lokacija,
    override val unosi: Igrac, override val mjesanja: List<Mjesanje>,
    override val igraci: MutableList<Igrac?>
) : Partija() {

    override fun toString(): String {
        val rezultat = getRezultat()
        return "Partija DVA PARA, igra gotova: " + isIgraGotova() + ", " +
                igraci[0] + " i " + igraci[1] + ": " + rezultat.prvi + " | " +
                igraci[2] + " i " + igraci[3] + ": " + rezultat.drugi
    }
}