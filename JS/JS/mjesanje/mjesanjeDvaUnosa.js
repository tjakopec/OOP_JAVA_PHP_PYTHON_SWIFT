import { Mjesanje } from "./mjesanje.js"
import { Rezultat } from '../rezultat.js'

export class MjesanjeDvaUnosa extends Mjesanje {
    #bodovaPrviUnos
    #bodovaDrugiUnos
    #zvanjePrviUnos
    #zvanjeDrugiUnos

    constructor(id, stiglja, belot, datumUnosa, zvaoAdut, bodovaPrviUnos, bodovaDrugiUnos, zvanjePrviUnos, zvanjeDrugiUnos) {
        super(id, stiglja, belot, datumUnosa, zvaoAdut)
        this.#bodovaPrviUnos = Number(bodovaPrviUnos)
        this.#bodovaDrugiUnos = Number(bodovaDrugiUnos)
        this.#zvanjePrviUnos = Number(zvanjePrviUnos)
        this.#zvanjeDrugiUnos = Number(zvanjeDrugiUnos)
    }

    getBodovaPrviUnos() {
        return this.#bodovaPrviUnos
    }
    setBodovaPrviUnos(bodovaPrviUnos) {
        this.#bodovaPrviUnos = Number(bodovaPrviUnos)
    }

    getBodovaDrugiUnos() {
        return this.#bodovaDrugiUnos
    }
    setBodovaDrugiUnos(bodovaDrugiUnos) {
        this.#bodovaDrugiUnos = Number(bodovaDrugiUnos)
    }

    getZvanjePrviUnos() {
        return this.#zvanjePrviUnos
    }
    setZvanjePrviUnos(zvanjePrviUnos) {
        this.#zvanjePrviUnos = Number(zvanjePrviUnos)
    }

    getZvanjeDrugiUnos() {
        return this.#zvanjeDrugiUnos
    }
    setZvanjeDrugiUnos(zvanjeDrugiUnos) {
        this.#zvanjeDrugiUnos = Number(zvanjeDrugiUnos)
    }

    getRezultat() {
        const b1 = this.getBodovaPrviUnos()
        const b2 = this.getBodovaDrugiUnos()
        const z1 = this.getZvanjePrviUnos()
        const z2 = this.getZvanjeDrugiUnos()

        return new Rezultat(b1 + z1, b2 + z2)
    }
}