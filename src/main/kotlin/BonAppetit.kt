fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    bill.sum()
    var annaShared = bill.filterIndexed { i, _ -> i != k }
    var totalShared = annaShared.sum()
    var fairShare = totalShared / 2
    if (fairShare == b) {
        println("Bon Appetit")
    } else {
        println(b - fairShare)
    }

}

fun main(args: Array<String>) {
    val k = 1
    val bill = arrayOf(3, 10, 2, 9)
    val b = 12

    bonAppetit(bill, k, b)
}