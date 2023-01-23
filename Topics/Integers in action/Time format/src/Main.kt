fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val segundosPorDia: Long = 60 * 60 * 24
    val segundosPorHora: Long = 60 * 60
    val segundosPorMinuto: Long = 60
    val totalDays = totalSeconds / segundosPorDia
    val segundosRestantes = totalSeconds - totalDays * segundosPorDia
    val dias = segundosRestantes / segundosPorDia
    val horas = segundosRestantes / segundosPorHora
    val minutos = segundosRestantes / segundosPorMinuto
    println("" + dias + ":" + horas + ":" + minutos)
}