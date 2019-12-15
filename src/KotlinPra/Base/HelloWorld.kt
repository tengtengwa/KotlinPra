package KotlinPra.Base

fun main() {
    println(getVoice("Π‘Ή·"))
    
}

fun getVoice(string: String) = when (string) {
    "Π‘Ή·" -> "ΝτΝτΝτ"
    "Γ¨ίδ" -> "ίχίχίχ"
    else -> "ΞϋΞϋΞϋ"
}