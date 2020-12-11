package Averanger

class Averanger {
    private var sets = mutableListOf<Pair<Double, Array<Double>>>()
    fun calculate(): Double {
        var result: Double = 0.0
        for (i in sets) {
            result += i.first * i.second.average()
        }
        return result
    }

    fun addSet(k: Double, array: Array<AverageItem>) {
        sets.add(Pair(k, Array(array.size)
        {
            array[it].toDoubleItem()
        }))
    }
}
