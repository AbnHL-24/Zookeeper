fun main() {
    val numero = readln().toInt()
    println(if (numero < 0) {
        "negative"
    } else if (numero > 0) {
        "positive"
    } else {
        "zero"
    })
}