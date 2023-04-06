package co.com.alejoloopez5.challenges

fun main(){
    solution(mutableListOf(1, 2, 1, 2))
    solution(mutableListOf(3, 6, 5, 8, 10, 20, 15))
}

private fun solution(sequence: MutableList<Int>): Boolean {

    var valAnterior: Int = 0
    var contador: Int = 0
    var respuesta: Boolean = false

    for ((position, value) in sequence.withIndex()){

        if(valAnterior >= value && position >0){
            contador += 1
        }

        valAnterior = value

    }

    if(contador <=1){
        respuesta = true
    }
    println(respuesta)
    return respuesta

}