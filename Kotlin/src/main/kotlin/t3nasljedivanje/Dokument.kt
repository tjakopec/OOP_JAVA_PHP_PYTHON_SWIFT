package t3nasljedivanje

/**
 * @author Matija Skrletović
 **/

open class Dokument(val sifra: Int, private val brojDokumenta: String, private val iznos: Double, val izradio: Osoba? = null) : Any() {

    override fun toString(): String {
        return "Dokument{ sifra=$sifra, brojDokumenta='$brojDokumenta', iznos=$iznos}"
    }


}