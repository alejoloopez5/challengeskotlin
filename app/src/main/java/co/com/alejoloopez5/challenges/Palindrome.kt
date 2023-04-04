package co.com.alejoloopez5.challenges

fun main(){
    solution("aabaa")
}

fun solution(inputString: String): Boolean {
    val reversedStr = inputString.reversed()
    return inputString.equals(reversedStr)
}