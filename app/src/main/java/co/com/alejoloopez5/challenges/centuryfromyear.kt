package co.com.alejoloopez5.challenges

fun main(){
    solution(1987)
}

private fun solution(year: Int): Int {

    var result : Int = 0

    val firstData = year.toString().take(getFirstLenght(year.toString().length))
    val secondData = year.toString().takeLast(2).toInt()

    if(year.toString().length in 1..2){
        return 1
    }

    if(secondData > 0 && secondData <=99){
        result = firstData.toInt() + 1
    } else {
        result = firstData.toInt()
    }
    print(result)
    return result
}

private fun getFirstLenght(century: Int): Int {
    return when(century){
        4 -> 2
        else -> 1
    }
}