fun main() {
    val entrada = readln().toInt()
    var valorMaximo = 0

    repeat(entrada) {
        val nuevoNumero = readln().toInt()
        if (nuevoNumero % 4 == 0 && nuevoNumero > valorMaximo) {
            valorMaximo = nuevoNumero
        }
    }
    println(valorMaximo)
}