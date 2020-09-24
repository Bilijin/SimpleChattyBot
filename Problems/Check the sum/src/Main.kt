import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()

    print(one + two == 20 || one + three == 20 || three + two == 20)

}