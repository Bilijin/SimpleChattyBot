import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val number = scanner.nextInt()
    val tens = number % 10

    val nee = (number - tens) %100
    print(nee/10)

}