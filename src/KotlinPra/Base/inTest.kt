package KotlinPra.Base

fun main() {
    println(isLetter('#'))
    println(isNotDigit('*'))

}

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun sum(a: Int, b: Int, c: Int) = if (a+b==c) arrayOf(a,b) else 0
