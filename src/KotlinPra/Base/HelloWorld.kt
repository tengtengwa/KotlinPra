package KotlinPra.Base

fun main() {
    println(getVoice("С��"))
    
}

fun getVoice(string: String) = when (string) {
    "С��" -> "������"
    "è��" -> "������"
    else -> "������"
}