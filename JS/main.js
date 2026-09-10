import fs from 'fs'

import { Igrac } from './JS/igrac.js'
import { Lokacija } from './JS/lokacija.js'

import { MjesanjeDvaUnosa } from './JS/mjesanje/mjesanjeDvaUnosa.js'
import { MjesanjeTriUnosa } from './JS/mjesanje/mjesanjeTriUnosa.js'

import { PartijaDvaIgraca } from './JS/partija/partijaDvaIgraca.js'
import { PartijaTriIgraca } from './JS/partija/partijaTriIgraca.js'
import { PartijaDvaPara } from './JS/partija/partijaDvaPara.js'

const siroviPodaci = JSON.parse(
    fs.readFileSync('./podaci.json', 'utf-8')
)

const partije = siroviPodaci.map(podatakPartije => {
    const podatakLokacije = podatakPartije.lokacija

    const lokacija = new Lokacija(
        podatakLokacije.id,
        podatakLokacije.longitude,
        podatakLokacije.latitude,
        podatakLokacije.naziv
    )

    const podatakUnosa = podatakPartije.unosi

    const unosi = new Igrac(
        podatakUnosa.id,
        podatakUnosa.ime,
        podatakUnosa.prezime,
        podatakUnosa.urlSlika,
        podatakUnosa.spol
    )

    const igraci = podatakPartije.igraci.map(podatakIgraca => {
        return new Igrac(
            podatakIgraca.id,
            podatakIgraca.ime,
            podatakIgraca.prezime,
            podatakIgraca.urlSlika,
            podatakIgraca.spol
        )
    })

    let mjesanja

    if (igraci.length === 3) {
        mjesanja = podatakPartije.mjesanja.map(podatakMjesanja => {
            return new MjesanjeTriUnosa(
                podatakMjesanja.id,
                podatakMjesanja.stiglja,
                podatakMjesanja.belot,
                podatakMjesanja.datumUnosa,
                podatakMjesanja.zvaoAdutUnos ?? 1,
                podatakMjesanja.bodovaPrviUnos,
                podatakMjesanja.bodovaDrugiUnos,
                podatakMjesanja.zvanjePrviUnos,
                podatakMjesanja.zvanjeDrugiUnos,
                podatakMjesanja.bodovaTreciUnos,
                podatakMjesanja.zvanjeTreciUnos
            )
        })
    } else {
        mjesanja = podatakPartije.mjesanja.map(podatakMjesanja => {
            return new MjesanjeDvaUnosa(
                podatakMjesanja.id,
                podatakMjesanja.stiglja,
                podatakMjesanja.belot,
                podatakMjesanja.datumUnosa,
                podatakMjesanja.zvaoAdutUnos ?? 1,
                podatakMjesanja.bodovaPrviUnos,
                podatakMjesanja.bodovaDrugiUnos,
                podatakMjesanja.zvanjePrviUnos,
                podatakMjesanja.zvanjeDrugiUnos
            )
        })
    }

    if (igraci.length === 2) {
        return new PartijaDvaIgraca(
            podatakPartije.id,
            podatakPartije.doKolikoSeIgra,
            lokacija,
            unosi,
            mjesanja,
            igraci
        )
    }

    if (igraci.length === 3) {
        return new PartijaTriIgraca(
            podatakPartije.id,
            podatakPartije.doKolikoSeIgra,
            lokacija,
            unosi,
            mjesanja,
            igraci
        )
    }

    if (igraci.length === 4) {
        return new PartijaDvaPara(
            podatakPartije.id,
            podatakPartije.doKolikoSeIgra,
            lokacija,
            unosi,
            mjesanja,
            igraci
        )
    }

    throw new Error(
        `Nepodržan broj igrača: ${igraci.length}`
    )
})

partije.forEach(partija => {
    console.log(partija.toString())

    if (!partija.isIgraGotova()) {
        return
    }

    const pobjednikIndex = partija.getPobjednikIndex()
    const igraci = partija.getIgraci()

    if (igraci.length === 2 || igraci.length === 3) {
        console.log(
            `Pobjednik je ${igraci[pobjednikIndex].toString()}`
        )
    }

    if (igraci.length === 4) {
        const prviIgracPara = pobjednikIndex === 0 ? 0 : 2
        const drugiIgracPara = prviIgracPara + 1

        console.log(
            `Pobjednici su ` +
            `${igraci[prviIgracPara].toString()} i ` +
            `${igraci[drugiIgracPara].toString()}`
        )
    }
})