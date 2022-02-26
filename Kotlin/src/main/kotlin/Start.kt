import model.*
import pomocno.Json

/**
* @author Matija Skrletović
**/
class Start {
    private var partije: MutableList<Partija> = mutableListOf()
    private var igrac1: Igrac? = null
    private var igrac2: Igrac? = null
    private var igrac3: Igrac? = null
    private var igrac4: Igrac? = null
    private var lokacija: Lokacija? = null

    init {
        kreirajRucno()
        Json.toJsonFile("podaci.json", partije)
    }

    private fun kreirajRucno() {
        partije = ArrayList()
        igrac1 = kreirajIgraca1()
        igrac2 = kreirajIgraca2()
        igrac3 =
            Igrac(3, "Marija", "Zimska", "https://picsum.photos/200", Spol.ZENSKO.id)
        igrac4 =
            Igrac(4, "Anita", "Račman", "https://picsum.photos/200", Spol.ZENSKO.id)
        lokacija = kreirajLokaciju()
        kreirajPartijuDvaIgraca()
        kreirajPartijuTriIgraca()
        kreirajPartijuDvaPara()
        println(partije.joinToString())
    }

    private fun kreirajPartijuDvaPara() {
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci.add(igrac1)
        igraci.add(igrac2)
        igraci.add(igrac3)
        igraci.add(igrac4)
        val partija = PartijaDvaPara(501, lokacija!!, igrac1!!, kreirajMjesanjaDvaPara(), igraci)
        partije.add(partija)
    }

    private fun kreirajMjesanjaDvaPara(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = ArrayList()
        var m = MjesanjeDvaUnosa(10, 152, 0, 20)

        mjesanja.add(m)
        m = MjesanjeDvaUnosa(152, 10, 0, 20)
        m.stiglja = true
        mjesanja.add(m)
        return mjesanja
    }

    private fun kreirajPartijuTriIgraca() {
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci.add(igrac1)
        igraci.add(igrac2)
        igraci.add(igrac3)
        val partija = PartijaTriIgraca(501, lokacija!!, igrac1!!, kreirajMjesanjaTriIgraca(), igraci)
        partije.add(partija)
    }

    private fun kreirajMjesanjaTriIgraca(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = mutableListOf()
        var m = MjesanjeTriUnosa(10, 76, 0, 20, 76)
        mjesanja.add(m)
        for (i in 0..4) {
            m = MjesanjeTriUnosa(10, 76, 0, 20, 76)
            mjesanja.add(m)
        }
        return mjesanja
    }

    private fun kreirajPartijuDvaIgraca() {
        val igraci: MutableList<Igrac?> = mutableListOf()
        igraci.add(igrac1)
        igraci.add(igrac2)
        val mjesanja = kreirajMjesanjaDvaIgraca()
        val partija = PartijaDvaIgraca(501, lokacija!!, igrac1!!, mjesanja, igraci)
        partije.add(partija)
    }

    private fun kreirajMjesanjaDvaIgraca(): List<Mjesanje> {
        val mjesanja: MutableList<Mjesanje> = ArrayList()
        var m = MjesanjeDvaUnosa(10, 152, 0, 20)

        mjesanja.add(m)
        m = MjesanjeDvaUnosa(152, 10, 0, 20)
        m.stiglja = true
        mjesanja.add(m)
        return mjesanja
    }

    private fun kreirajLokaciju() = Lokacija(
        id = 1,
        naziv = "Caffe Bar Peppermint",
        latitude = 45.5605825,
        longitude = 18.6098766
    )


    private fun kreirajIgraca1() = Igrac(1, "Tomislav", "Jakopec", "https://picsum.photos/200", Spol.MUSKO.id)


    private fun kreirajIgraca2() = Igrac(2, "Marijan", "Zidar", "https://picsum.photos/200", Spol.MUSKO.id)

}

fun main() {
    Start()
}