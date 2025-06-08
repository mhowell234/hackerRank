fun main() {

    val numbers = listOf(5, 2, 10, 4)

    val simpleSum = numbers.reduce { sum, element -> sum + element }
    val sumDoubled = numbers.fold(0) { sum, element ->
        sum + element * 2
    }
    println(simpleSum)
    println(sumDoubled)
}