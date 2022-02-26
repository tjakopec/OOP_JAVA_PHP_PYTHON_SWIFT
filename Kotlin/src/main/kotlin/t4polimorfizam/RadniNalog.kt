package t4polimorfizam

/**
 * @author Matija Skrletović
 **/

class RadniNalog(sifra:Int, brojDokumenta: String, iznos:Double, radnik: Osoba? = null) : Dokument(sifra, brojDokumenta, iznos) {

    override fun obradiDokument() = println("Obrađujem radni nalog")
    override fun getOpis(): String? = null

}