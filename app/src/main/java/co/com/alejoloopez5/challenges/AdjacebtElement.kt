package co.com.alejoloopez5.challenges

fun main(){
    solution2(mutableListOf(3, 6, -2, -5, 7, 3))
}

private fun solution2(inputArray: MutableList<Int>): Int {

    var firstValue: Int = 0
    var secondValue: Int = 0
    var maxValue: Int = -9999

    for((position, value) in inputArray.withIndex()){
        if(position == 0){
            firstValue = value
        } else if(position ==1){
            secondValue = value
        } else{
            firstValue = secondValue
            secondValue = value
        }

        if((firstValue * secondValue) >= maxValue && position >=1){
            maxValue = firstValue * secondValue
        }
    }
    print(maxValue)
    return maxValue
}