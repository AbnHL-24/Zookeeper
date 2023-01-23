fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(if (c < a) {
        "Deficiency"
    } else if(c > b) {
        "Excess"
    } else {
        "Normal"
    })
}