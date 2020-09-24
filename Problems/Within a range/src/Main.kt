import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val value1 = scanner.nextInt()
    val value2 = scanner.nextInt()
    val value3 = scanner.nextInt()
    val value4 = scanner.nextInt()
    val value5 = scanner.nextInt()
    print(value5 in value1..value2 || value5 in value3..value4)
}