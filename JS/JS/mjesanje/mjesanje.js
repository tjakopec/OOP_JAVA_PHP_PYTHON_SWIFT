import { Entitet } from '../entitet.js'

export class Mjesanje extends Entitet {
    #stiglja
    #belot
    #datumUnosa
    #zvaoAdut

    constructor(id, stiglja, belot, datumUnosa, zvaoAdut) {
        super(id)
        this.#stiglja = stiglja
        this.#belot = belot
        this.#datumUnosa = datumUnosa
        this.#zvaoAdut = Number(zvaoAdut)
    }

    getStiglja() {
        return this.#stiglja
    }

    setStiglja(stiglja) {
        this.#stiglja = stiglja
    }

    getBelot() {
        return this.#belot
    }

    setBelot(belot) {
        this.#belot = belot
    }

    getDatumUnosa() {
        return this.#datumUnosa
    }

    setDatumUnosa(datumUnosa) {
        this.#datumUnosa = datumUnosa
    }

    getZvaoAdut() {
        return this.#zvaoAdut
    }

    setZvaoAdut(zvaoAdut) {
        this.#zvaoAdut = Number(zvaoAdut)
    }

    getRezultat() {
        throw new Error('Metoda getRezultat() mora biti definirana u podklasi')
    }
}