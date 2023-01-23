// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Write only exchange actions here. Do not touch the lines above
    val c = b
    b = a
    a = c

    // Do not touch the lines below
    print("$a $b")
}
