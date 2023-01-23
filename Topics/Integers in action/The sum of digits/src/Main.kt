fun main() {
    val numero = readln().toInt()
    val centena = numero / 100
    val decena = (numero % 100) / 10
    val unidad = (numero % 100) % 10
    println(centena + decena + unidad)
}