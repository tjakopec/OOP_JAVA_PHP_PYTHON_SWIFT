package model

/**
 * @author Matija Skrletović
 **/

class PartijaTriIgraca(
    doKolikoSeIgra: Int, lokacija: Lokacija,
    unosi: Igrac, mjesanja: List<Mjesanje>,
    igraci: MutableList<Igrac?>
) : PartijaDvaIgraca(
    doKolikoSeIgra, lokacija,
    unosi, mjesanja,
    igraci
) {

    override fun toString(): String {
        val rezultat = getRezultat()
        return "Partija TRI IGRAČA, igra gotova: " + isIgraGotova() + ", " +
                igraci[0] + ": " + rezultat.prvi + " | " +
                igraci[1] + ": " + rezultat.drugi + " | " +
                igraci[2] + ": " + rezultat.treci
    }

    override fun getRezultat(): Rezultat {
        val rezultat = super.getRezultat()
        rezultat.treci = mjesanja.stream().mapToInt { it.getRezultat()!!.treci }.sum()
        return rezultat
    }
}