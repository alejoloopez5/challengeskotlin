package co.com.alejoloopez5.challenges

fun main(){
    solution(mutableListOf(6, 2, 3, 8))
}

private fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    val firstValue = statues.first()
    var lastValue : Int = 0
    var contador: Int = 0
    for((position, value) in statues.withIndex()){
        if(position > 0){
            if((value - lastValue) > 1 ){
                contador = contador + ((value - lastValue) -1)
            }
        }
        lastValue = value
    }
    return contador
}