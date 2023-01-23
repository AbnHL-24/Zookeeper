fun main() {
    val repeticiones = readln().toInt()
    var cantidadDePositivos = 0

    repeat(repeticiones) {
        val entrada = readln().toInt()
        if (entrada > 0) {
            cantidadDePositivos++
        }
    }
    println(cantidadDePositivos)
}