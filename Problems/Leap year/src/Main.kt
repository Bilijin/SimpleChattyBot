import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val year = scanner.nextInt()
    if (year % 4 == 0) {
        if(year % 100 != 0) {
            print("Leap")
        }else if(year % 400 == 0){
            print("Leap")
        }else{
            print("Regular")
        }
    }else{
        print("Regular")
    }
}