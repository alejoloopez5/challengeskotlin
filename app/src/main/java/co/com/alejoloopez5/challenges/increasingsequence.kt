package co.com.alejoloopez5.challenges

import java.lang.Math.abs

fun main(){

    solution(mutableListOf(1, 2, 1, 2)) //false
    solution(mutableListOf(1, 3, 2, 1)) //false
    solution(mutableListOf(3, 6, 5, 8, 10, 20, 15)) //false
    solution(mutableListOf(10, 1, 2, 3, 4, 5)) // true
    solution(mutableListOf(1, 2, 5, 3, 5)) // true
    solution(mutableListOf(1, 2, 3, 4, 99, 5, 6)) //true
    solution(mutableListOf(1, 3,2)) //true
    solution(mutableListOf(1, 2, 3, 4, 5, 3, 5, 6)) //false

}

private fun solution(sequence: MutableList<Int>): Boolean {
    var numErr = 0
    var resultado: Boolean = false
    for (i in 0 until sequence.size - 1) {
        if (sequence[i] - sequence[i + 1] >= 0) {
            numErr += 1
            if (i - 1 >= 0 && i + 2 <= sequence.size - 1 && sequence[i] - sequence[i + 2] >= 0 && sequence[i - 1] - sequence[i + 1] >= 0) {
                println(resultado)
                return false
            }
        }
    }

    if(numErr <= 1){
        resultado = true
    }
    println(resultado)
    return resultado
}