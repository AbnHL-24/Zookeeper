fun main() {
    val entrada = readln()
    var salida = ""
    repeat(entrada.length) { salida += entrada }
    println("${entrada.length} repetitions of the word $entrada: $salida")
}