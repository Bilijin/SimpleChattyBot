import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val count = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(count) {
        when(scanner.nextInt()) {
            5 -> a++
            4 -> b++
            3 -> c++
            2 -> d++
        }
    }

    print("$d $c $b $a")

}