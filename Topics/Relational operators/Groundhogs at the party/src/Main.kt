fun main() {
    val cups = readln().toInt()
    val weekEnd = readln().toBoolean()

    if (weekEnd) {
        if (cups >= 15 && cups <= 25) {
            println(true)
        } else {
            println(false)
        }
    } else {
        if (cups >= 10 && cups <= 20) {
            println(true)
        } else {
            println(false)
        }
    }
}