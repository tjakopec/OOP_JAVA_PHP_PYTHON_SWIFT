export class Entitet{
    #id = 0
    constructor (id = 0){
        this.#id = id
    }
    getId() {
        return this.#id
    }
    setId(id) {
        this.#id = id
    }
}