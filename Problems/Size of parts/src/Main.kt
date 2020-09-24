import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var ready = 0
    var fix = 0
    var rejects = 0

    val count = scanner.nextInt()

    repeat(count) {
        val num = scanner.nextInt()

        if(num == 0) {
            ready++
        }else if(num < 0) {
            rejects++
        } else if(num == 1) {
            fix++
        }
    }

    print("$ready $fix $rejects")
}