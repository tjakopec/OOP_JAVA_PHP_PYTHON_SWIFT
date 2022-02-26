package t2ucahurivanje

/**
 * @author Matija Skrletović
 **/

class Dokument(val sifra: Int, val brojDokumenta: String, val iznos: Double, izradio: Osoba?) {

    fun opisiMe(): String {
        return "$sifra - $brojDokumenta - $iznos"
    }

}