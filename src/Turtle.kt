fun calculator(firstNo: Float, secondNo: Float, operator: String): Any {

    val result : Any = when (operator) {
        "+" -> firstNo + secondNo
        "-" -> firstNo - secondNo
        "*" -> firstNo * secondNo
        "/" -> if (secondNo.toInt() == 0){
            println("0 A BOLUNMEZ")
        }else{
            firstNo / secondNo
        }
        else -> {
            println("Düzgün gir")
        }
    }
    return result
}