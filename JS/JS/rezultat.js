export class Rezultat {
    #prvi
    #drugi
    #treci

    constructor(prvi, drugi, treci = 0) {
        this.#prvi = prvi
        this.#drugi = drugi
        this.#treci = treci
    }

    getPrvi() {
        return this.#prvi
    }
    setPrvi(prvi) {
        this.#prvi = prvi
    }

    getDrugi() {
        return this.#drugi
    }
    setDrugi(drugi) {
        this.#drugi = drugi
    }

    getTreci() {
        return this.#treci
    }
    setTreci(treci) {
        this.#treci = treci
    }

    isPocetak() {
        return this.#prvi === 0 && this.#drugi === 0 && this.#treci === 0
    }
}