import kotlin.math.E

fun main() {
    println("Hello Welcome!")
    println("-----------------------------")
    while (true) {
        println("Enter The First Number:")
        val firstNumber: Float? = readln().toFloatOrNull()
        if (firstNumber == null) {
            println("You Entered An Invalid Value")
            continue
        }
        println("Enter The Operator:'+','-','/','*'")
        val operator : String = readln()
        if (operator.isEmpty() || !mutableListOf("+","-","/","*").contains(operator)){
            println("You Entered An Invalid Value")
            continue
        }
        println("Enter The Second Number:")
        val secondNumber: Float? = readln().toFloatOrNull()
        if (secondNumber == null) {
            println("You Entered An Invalid Value")
            continue
        }
        val result = calculator(firstNumber, secondNumber, operator)
        if (secondNumber.toInt() == 0){
            println("Result : Error")
        }else{
            println("Result: $result ")
        }
        println("Do you want to continue? Yes[Y], No[N]")
        val continueOrNot = readln()
        if (continueOrNot == "Y"){
            continue
        }else if(continueOrNot == "N"){
            break
        }
    }
}

fun calculator(firstNo: Float, secondNo: Float, operator: String): Any {

    val result : Any = when (operator) {
        "+" -> firstNo + secondNo
        "-" -> firstNo - secondNo
        "*" -> firstNo * secondNo
        "/" -> if (secondNo.toInt() == 0){
            println("A number cannot be divisible by 0. Try Again:")
        }else{
            firstNo / secondNo
        }
        else -> {
            println("Try Again")
        }
    }
    return result
}