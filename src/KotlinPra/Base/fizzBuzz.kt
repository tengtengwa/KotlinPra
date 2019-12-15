package KotlinPra.Base

fun main() {
    for (i in 100 downTo 1) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) = when {
    i % 5 == 0 -> "buzz"
    i % 3 == 0 -> "fizz"
    i % 15 == 0 -> "fizzbuzz"
    else -> "$i"
}
