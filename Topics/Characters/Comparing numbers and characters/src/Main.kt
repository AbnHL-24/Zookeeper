fun main() {
    val numero = readln().toInt()
    val caracter = readln().first().code

    if (numero == caracter) {
        println(true)
    } else {
        println(false)
    }
}