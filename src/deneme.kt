fun main() {
    println("Welcome")
    val calculator = Calculator()
    calculator.calculate()
    calculator.continueOrNot()

}

class Calculator {
    val firstNo: Float?
    val secondNo: Float?

    init {
        println("Enter First Number")
        firstNo = readln()?.toFloatOrNull()
        println("Enter Second Number")
        secondNo = readln()?.toFloatOrNull()
    }

    fun calculate() {
        println("Enter the operator + - / *")
        val operator = readln()
        when (operator) {
            "+" -> println("Result : ${sum()}")
            "-" -> println("Result : ${minus()}")
            "*" -> println("Result : ${times()}")
            "/" -> println("Result : ${divide()}")
        }
    }

    private fun sum(): Float {
        return firstNo!! + secondNo!!

    }

    private fun minus(): Float {
        return firstNo!! - secondNo!!
    }
    private fun divide(): Float {
        return if (secondNo?.toInt() != 0) {
            firstNo!! / secondNo!!
        } else {
            println("Cannot Divide By Zer0")
            0f
        }
    }
    private fun times(): Float {
        return firstNo!! * secondNo!!
    }


     fun continueOrNot(): Any {
        val input :String = readln()
        return when(input){
            "Y" -> Calculator()
            else -> {
                println("Try Again")
                Calculator()
            }
        }

    }

}