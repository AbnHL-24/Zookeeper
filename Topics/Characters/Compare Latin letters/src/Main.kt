fun main() {
    val primerChar = readln().first().uppercaseChar()
    val segundoChar = readln().first().uppercaseChar()

    if (primerChar == segundoChar) {
        println("true")
    } else {
        println("false")
    }
}