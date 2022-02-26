package t3nasljedivanje

/**
 * @author Matija Skrletović
 **/

class Start {

    init {
        val n = Nova()
        println(n)
        val dokument = Dokument(1, "D1", 200.toDouble())
        println(dokument)
        val radniNalog = RadniNalog(1, "RN1", 1200.toDouble(), Osoba(1, "Marko", "Markovina"))
        println(radniNalog)
        val racun = Racun(1, "2020-001", 1200.34, "FFOS")
        println(racun)

    }
}

fun main() {
    Start()
}