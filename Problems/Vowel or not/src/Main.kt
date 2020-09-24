import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel(a : Char) : Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val value = a.toLowerCase()
    return value in vowels
}