import javax.xml.stream.events.Characters

fun main() {
    val characters = mutableListOf('a', 'z', 'e', 'd')

    println(characters.joinToString())
}