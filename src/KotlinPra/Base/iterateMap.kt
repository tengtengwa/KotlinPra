package KotlinPra.Base

import java.util.*

fun main() {
    val tm = TreeMap<Char, String>()
    for (c in 'a'..'f') {
        val binary = Integer.toBinaryString(c.toInt())
        tm[c] = binary
    }

    for ((letter, binary) in tm) {
        println("$letter=$binary")
    }

}
