package t4polimorfizam

import java.util.function.Consumer

/**
 * @author Matija Skrletović
 **/

class Start {

    private var dokumenti: MutableList<Dokument>? = null

    init {

        dokumenti = mutableListOf()
        val radnik = Osoba(1, "Marko", "Markovina")
        val radniNalog = RadniNalog(1, "RN1", 1200.toDouble(), radnik)
        println(radniNalog)
        dokumenti!!.add(radniNalog)
        val racun = Racun(1, "2020-001", 1200.34, "FFOS")
        println(racun)
        dokumenti!!.add(racun)
        obradiDokumente()
    }

    private fun obradiDokumente() {
        println("forEach funkcija")
        dokumenti!!.forEach(Consumer { d: Dokument -> d.obradiDokument() })

        //ako nekog buni gornja sintaksa evo još dvije
        println("for petlja")
        for (i in dokumenti!!.indices) {
            dokumenti!![i].obradiDokument()
        }
        println("foreach petlja")
        for (d in dokumenti!!) {
            d.obradiDokument()
        }
    }
}

fun main() {
    Start()
}