import { Partija } from './partija.js'

export class PartijaDvaIgraca extends Partija {

    constructor(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci) {
        super(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci)
    }

    toString() {
        const rezultat = this.getRezultat()
        const igraci = this.getIgraci()

        return `Partija DVA IGRAČA, igra gotova: ${this.isIgraGotova()}, ` +
            `${igraci[0]}: ${rezultat.getPrvi()} | ` +
            `${igraci[1]}: ${rezultat.getDrugi()}`
    }
}