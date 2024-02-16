import kotlin.math.E

fun main() {
    println("Merhaba Hoş Geldiniz :D")
    println("-----------------------------")
    while (true) {
        println("İlk Sayıyı giriniz:")
        val firstNumber: Float? = readln().toFloatOrNull()
        if (firstNumber == null) {
            println("Geçersiz Değer Girdiniz Tekrar Deneyiniz")
            continue
        }
        println("İşlemi Giriniz:'+','-','/','*'")
        val operator : String = readln()
        if (operator.isEmpty() || !mutableListOf("+","-","/","*").contains(operator)){
            println("Yanlış Değer Girdiniz:")
            continue
        }
        println("İkinci Sayıyı Giriniz:")
        val secondNumber: Float? = readln().toFloatOrNull()
        if (secondNumber == null) {
            println("Geçersiz Değer Girdiniz")
            continue
        }
        val result = calculator(firstNumber, secondNumber, operator)
        if (secondNumber.toInt() == 0){
            println("Sonuç : Error")
        }else{
            println("Sonuç: $result ")
        }
        println("Devam Etmek İstiyor musunuz? Evet[E], Hayır[H]")
        val continueOrNot = readln()
        if (continueOrNot == "E"){
            continue
        }else if(continueOrNot == "H"){
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
            println("Bir sayı 0'a Bölünemez Tekrar Deneyiniz:")
        }else{
            firstNo / secondNo
        }
        else -> {
            println("Tekrar Deneyiniz")
        }
    }
    return result
}