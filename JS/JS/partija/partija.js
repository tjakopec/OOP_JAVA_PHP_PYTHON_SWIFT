import { Entitet } from '../entitet.js'
import { Rezultat } from '../rezultat.js'

export class Partija extends Entitet {
    #doKolikoSeIgra
    #lokacija
    #unosi
    #mjesanja
    #igraci

    constructor(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci) {
        super(id)
        this.#doKolikoSeIgra = doKolikoSeIgra
        this.#lokacija = lokacija
        this.#unosi = unosi
        this.#mjesanja = mjesanja
        this.#igraci = igraci
    }

    getDoKolikoSeIgra() {
        return this.#doKolikoSeIgra
    }
    setDoKolikoSeIgra(doKolikoSeIgra) {
        this.#doKolikoSeIgra = doKolikoSeIgra
    }

    getLokacija() {
        return this.#lokacija
    }
    setLokacija(lokacija) {
        this.#lokacija = lokacija
    }

    getUnosi() {
        return this.#unosi
    }
    setUnosi(unosi) {
        this.#unosi = unosi
    }

    getMjesanja() {
        return this.#mjesanja
    }
    setMjesanja(mjesanja) {
        this.#mjesanja = mjesanja
    }

    dodajMjesanje(mjesanje) {
        this.#mjesanja.push(mjesanje)
    }

    getIgraci() {
        return this.#igraci
    }
    setIgraci(igraci) {
        this.#igraci = Array.isArray(igraci) ? igraci : []
    }

    getRezultat() {
        let prvi = 0
        let drugi = 0
        let treci = 0

        this.getMjesanja().forEach(mjesanje => {
            const rezultatMjesanja = mjesanje.getRezultat()

            prvi += rezultatMjesanja.getPrvi()
            drugi += rezultatMjesanja.getDrugi()
            treci += rezultatMjesanja.getTreci()
        })

        return new Rezultat(prvi, drugi, treci)
    }

    isIgraGotova() {
        const imaBelot = this.getMjesanja().some(mjesanje => mjesanje.getBelot())
        if (imaBelot) {
            return true
        }

        const rez = this.getRezultat()
        const granica = this.getDoKolikoSeIgra()
        const bodovi = this.getIgraci().length === 3
            ? [rez.getPrvi(), rez.getDrugi(), rez.getTreci()]
            : [rez.getPrvi(), rez.getDrugi()]
        const maxBodovi = Math.max(...bodovi)

        if (maxBodovi < granica) {
            return false
        }
        const brojVodecih = bodovi.filter(b => b === maxBodovi).length
        if (brojVodecih > 1) {
            return false 
                }

        return true
    }
    getPobjednikIndex() {
        if (!this.isIgraGotova()) {
            return null
        }
        const belotMjesanje = this.getMjesanja().find(mjesanje => mjesanje.getBelot())
        if (belotMjesanje) {
            return belotMjesanje.getZvaoAdut() - 1
        }

        const rez = this.getRezultat()
        const bodovi = this.getIgraci().length === 3
            ? [rez.getPrvi(), rez.getDrugi(), rez.getTreci()]
            : [rez.getPrvi(), rez.getDrugi()]
        const maxBodovi = Math.max(...bodovi)
        return bodovi.indexOf(maxBodovi)
    }
}
