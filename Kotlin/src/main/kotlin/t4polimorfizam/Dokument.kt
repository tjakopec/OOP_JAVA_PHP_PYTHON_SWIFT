package t4polimorfizam

/**
 * @author Matija Skrletović
 **/

abstract class Dokument(val sifra: Int, val brojDokumenta: String, val iznos: Double, val izradio: Osoba? = null) : Any() {

    abstract fun obradiDokument()
    abstract fun getOpis(): String?

    override fun toString(): String {
        return "Dokument{ sifra=$sifra, brojDokumenta='$brojDokumenta', iznos=$iznos}"
    }

}