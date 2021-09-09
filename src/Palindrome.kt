
import java.util.*


fun isPalindrome(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun main() {

    val input = Scanner(System.`in`)

    print("Enter String : ")
    val inString: String = input.nextLine()



    if (isPalindrome(inString)) {
        println("$inString #--> palindrome")
    } else {
        println("$inString #--> not palindrome")
    }
}
