import { Entitet } from './entitet.js'
import { Spol } from './spol.js'

export class Igrac extends Entitet {
    #ime
    #prezime
    #urlSlika
    #spol

    constructor(id, ime, prezime, urlSlika, spol) {
        super(id)
        this.#ime = ime
        this.#prezime = prezime
        this.#urlSlika = urlSlika
        this.#spol = spol
    }

    getIme() {
        return this.#ime
    }

    setIme(ime) {
        this.#ime = ime
    }

    getPrezime() {
        return this.#prezime
    }

    setPrezime(prezime) {
        this.#prezime = prezime
    }

    getUrlSlika() {
        return this.#urlSlika
    }

    setUrlSlika(urlSlika) {
        this.#urlSlika = urlSlika
    }

    getSpol() {
        return this.#spol
    }

    setSpol(spol) {
        this.#spol = spol
    }

    getSpolNaziv() {
        return this.getSpol() === Spol.MUSKI ? 'Muško' : 'Žensko'
    }

    toString() {
        return `${this.getIme()} ${this.getPrezime()}`
    }
}