package model

/**
 * @author Matija Skrletović
 **/

abstract class Partija : Entitet() {

    abstract val doKolikoSeIgra: Int
    abstract val lokacija: Lokacija
    abstract val unosi: Igrac
    abstract val mjesanja: List<Mjesanje>
    abstract val igraci: MutableList<Igrac?>

    open fun getRezultat(): Rezultat {
        return Rezultat(
            mjesanja.stream().mapToInt { it.getRezultat()!!.prvi }.sum(),
            mjesanja.stream().mapToInt { it.getRezultat()!!.drugi }.sum()
        )
    }

    fun isIgraGotova(): Boolean {
        val rezultat = getRezultat()
        if (rezultat.isPocetak()) {
            return false
        }
        if (rezultat.treci == 0) {
            return if (rezultat.prvi == rezultat.drugi) false else rezultat.prvi > doKolikoSeIgra || rezultat.drugi > doKolikoSeIgra
        } else {
            if (rezultat.prvi == rezultat.drugi || rezultat.prvi == rezultat.treci || rezultat.drugi == rezultat.treci) {
                return false
            }
            if (rezultat.prvi > doKolikoSeIgra || rezultat.drugi > doKolikoSeIgra || rezultat.treci > doKolikoSeIgra) {
                return true
            }
        }
        return false
    }
}