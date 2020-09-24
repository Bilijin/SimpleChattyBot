import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val population = scanner.nextInt()
    val result = Math.cbrt(population.toDouble()).toInt()
    print(result.toString())
}