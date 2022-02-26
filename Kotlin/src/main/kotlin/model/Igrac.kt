package model

/**
 * @author Matija Skrletović
 **/

class Igrac(sifra: Int, val ime: String, val prezime: String, val urlSlike: String, val spol: Int) : Entitet(sifra) {

    override fun toString() = "$ime $prezime"

}