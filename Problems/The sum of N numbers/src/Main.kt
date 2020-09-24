import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val count = scanner.nextInt()
    var sum = 0

    for (i in 1..count) {
        val num = scanner.nextInt()
        sum += num
    }
    print(sum)
}