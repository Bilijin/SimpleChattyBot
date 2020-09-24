import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val days = scanner.nextInt()
    val food = scanner.nextInt()
    val flight = scanner.nextInt()
    val hotel = scanner.nextInt()

    print(food * days + flight * 2 + hotel * (days - 1))
}
