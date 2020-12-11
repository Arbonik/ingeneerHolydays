package Averanger/*HOW TO USE
* CREATE YOR CLASS
* REALISE AVERAGEITEM
* USE AVERENGER
* */
class Name(var str : String = "") : AverageItem{
    override fun toDoubleItem(): Double {
        return str.length.toDouble()
    }
}

fun main(){

    var array = arrayOf<AverageItem>(Name("Fedor"),Name("Polina"), Name("Alexandr"))
    var averanger = Averanger()
    averanger.addSet(1.0, array)
    println(averanger.calculate())

}