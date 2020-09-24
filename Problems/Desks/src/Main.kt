import java.util.Scanner
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val firstSet = scanner.nextInt()
    val secondSet = scanner.nextInt()
    val thirdSet = scanner.nextInt()

//    val first = (firstSet.toFloat() / 2).roundToInt()
//    val second = (secondSet.toFloat() / 2).roundToInt()
//    val third = (thirdSet.toFloat() / 2).roundToInt()

    print((firstSet.toFloat() / 2).roundToInt() + (secondSet.toFloat() / 2).roundToInt() + (thirdSet.toFloat() / 2).roundToInt())


}