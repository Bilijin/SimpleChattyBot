import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val num = scanner.nextInt()
    print(num in 1..9)
}