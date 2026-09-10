import { Rezultat } from '../rezultat.js'
import { MjesanjeDvaUnosa } from "./mjesanjeDvaUnosa.js"

export class MjesanjeTriUnosa extends MjesanjeDvaUnosa {
    #bodovaTreciUnos
    #zvanjeTreciUnos

    constructor(id, stiglja, belot, datumUnosa, zvaoAdut, bodovaPrviUnos, bodovaDrugiUnos, zvanjePrviUnos, zvanjeDrugiUnos, bodovaTreciUnos, zvanjeTreciUnos) {
        super(id, stiglja, belot, datumUnosa, zvaoAdut, bodovaPrviUnos, bodovaDrugiUnos, zvanjePrviUnos, zvanjeDrugiUnos)
        this.#bodovaTreciUnos = Number(bodovaTreciUnos)
        this.#zvanjeTreciUnos = Number(zvanjeTreciUnos)
    }

    getBodovaTreciUnos() {
        return this.#bodovaTreciUnos
    }
    setBodovaTreciUnos(bodovaTreciUnos) {
        this.#bodovaTreciUnos = Number(bodovaTreciUnos)
    }

    getZvanjeTreciUnos() {
        return this.#zvanjeTreciUnos
    }
    setZvanjeTreciUnos(zvanjeTreciUnos) {
        this.#zvanjeTreciUnos = Number(zvanjeTreciUnos)
    }

    getRezultat() {
        const b1 = this.getBodovaPrviUnos()
        const b2 = this.getBodovaDrugiUnos()
        const b3 = this.getBodovaTreciUnos()
        const z1 = this.getZvanjePrviUnos()
        const z2 = this.getZvanjeDrugiUnos()
        const z3 = this.getZvanjeTreciUnos()

        return new Rezultat(b1 + z1, b2 + z2, b3 + z3)
    }
}