package t2ucahurivanje

/**
 * @author Matija Skrletović
 **/

class Start {

    private var dokument: Dokument

    init {
        dokument = Dokument(2, "2020-002", 100.toDouble(), Osoba(1, "Tomislav", "Jakopec"))
        println(dokument.opisiMe())

        println(Dokument(3, "2020-003", 200.toDouble(), Osoba(1, "Pero", "Perić")).opisiMe())
    }
}

fun main() {
    Start()
}