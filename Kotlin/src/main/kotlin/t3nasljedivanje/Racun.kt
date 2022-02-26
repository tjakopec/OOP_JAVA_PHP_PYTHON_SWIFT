package t3nasljedivanje

/**
 * @author Matija Skrletović
 **/

class Racun(sifra: Int, brojDokumenta: String, iznos: Double, val kupac: String) : Dokument(sifra, brojDokumenta, iznos) {

    override fun toString(): String {
        return "Racun{kupac='$kupac'} koji nasljeđuje ${super.toString()}"
    }
}