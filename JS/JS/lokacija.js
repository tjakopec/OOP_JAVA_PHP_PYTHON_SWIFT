import { Entitet } from "./entitet.js"

export class Lokacija extends Entitet{
    #longitude
    #latitude
    #naziv

    constructor(id, longitude, latitude, naziv){
        super(id)
        this.#longitude = longitude
        this.#latitude = latitude
        this.#naziv = naziv
    }

    getLongitude(){
        return this.#longitude
    }
    setLongitude(longitude){
        this.#longitude = longitude
    }

    getLatitude(){
        return this.#latitude
    }
    setLatitude(latitude){
        this.#latitude = latitude
    }

    getNaziv(){
        return this.#naziv
    }
    setNaziv(naziv){
        this.#naziv = naziv
    }
}