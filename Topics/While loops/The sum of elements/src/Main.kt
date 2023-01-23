fun main() {
    var suma = 0
    var entrada = 0
    do {
        suma += entrada
        entrada = readln().toInt()
    } while (entrada != 0)
    println(suma)
}