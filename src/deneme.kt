fun main()  {

}
class Calculator (firstNumber: Float, secondNumber: Float, operator: String){
    val firstNo : Float?
    val secondNo : Float?

    init {
        println("Enter First Number")
        firstNo = readln()?.toFloatOrNull()
        println("Enter Second Number")
        secondNo = readln()?.toFloatOrNull()
    }
    fun calculate (firstNumber : Float , secondNumber : Float, operator : String){
        println("Enter the operator + - / *")
        val operator = readln()

        when(operator){
            "+" -> println("Result : ${sum()}")
            "-" -> println("Result : ${minus()}")
            "*" -> println("Result : ${times()}")
            "/" -> println("Result : ${divide()}")

            }
        }


    private fun sum() : Float{
        return firstNo!! + secondNo!!

    }
    private fun minus() : Float{
      return  firstNo!! - secondNo!!
    }

    private fun divide() : Float{
        return if (secondNo?.toInt() != 0){
            firstNo!! / secondNo!!
        }else{
            println("Cannot Divide By Zer0")
            0f
        }
    }
    private fun times() : Float {
        return firstNo!! * secondNo!!
    }

}