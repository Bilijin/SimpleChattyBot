import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    val fourth = scanner.nextInt()

    val numbers = arrayOf(first, second, third, fourth)
    val numbers2 = numbers.sorted()

    var check = 0

    for (i in 0..3) {
        if (numbers2[i] > 0) {
            if (numbers2[i] == numbers2[0] && numbers2[i] == numbers2[1] && numbers2[i] == numbers2[2] && numbers2[i] == numbers2[3]) {
                break
            }
            if (numbers2[i] == check) {

            }else {
                println(numbers2[i])
                check = numbers2[i]
            }
        }
    }
}
