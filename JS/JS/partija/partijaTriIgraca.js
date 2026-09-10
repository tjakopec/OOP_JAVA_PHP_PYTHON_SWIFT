import { PartijaDvaIgraca } from './partijaDvaIgraca.js'

export class PartijaTriIgraca extends PartijaDvaIgraca {

    constructor(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci) {
        super(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci)
    }

    toString() {
        const rezultat = this.getRezultat()
        const igraci = this.getIgraci()

        return `Partija TRI IGRAČA, igra gotova: ${this.isIgraGotova()}, ` +
            `${igraci[0]}: ${rezultat.getPrvi()} | ` +
            `${igraci[1]}: ${rezultat.getDrugi()} | ` +
            `${igraci[2]}: ${rezultat.getTreci()}`
    }
}