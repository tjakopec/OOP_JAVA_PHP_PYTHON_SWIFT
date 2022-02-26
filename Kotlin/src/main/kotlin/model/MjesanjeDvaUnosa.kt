package model

import java.util.*

/**
 * @author Matija Skrletović
 **/

open class MjesanjeDvaUnosa(
    val bodovaPrviUnos: Int,
    val bodovaDrugiUnos: Int,
    val zvanjePrviUnos: Int = 0,
    val zvanjeDrugiUnos: Int = 0
) : Mjesanje() {

    override var stiglja: Boolean = false
    override var belot = false
    override var datumUnosa: Date? = null

    override fun getRezultat(): Rezultat? {
        return Rezultat(bodovaPrviUnos + zvanjePrviUnos, bodovaDrugiUnos + zvanjeDrugiUnos)
    }
}