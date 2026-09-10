import { Partija } from './partija.js'

export class PartijaDvaPara extends Partija {

    constructor(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci) {
        super(id, doKolikoSeIgra, lokacija, unosi, mjesanja, igraci)
    }

    toString() {
        const rezultat = this.getRezultat()
        const igraci = this.getIgraci()

        return `Partija DVA PARA, igra gotova: ${this.isIgraGotova()}, ` +
            `${igraci[0]} i ${igraci[1]}: ${rezultat.getPrvi()} | ` +
            `${igraci[2]} i ${igraci[3]}: ${rezultat.getDrugi()}`
    }
}