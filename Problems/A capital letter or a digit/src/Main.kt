import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val value = scanner.next().first()

    print(value in '\u0031'..'\u0039' || value.isUpperCase())
}