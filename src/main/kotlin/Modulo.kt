fun gradingStudents(grades: Array<Int>): Array<Int> {
    val roundedGrades = mutableListOf<Int>()
    grades.forEach {
        if (it < 38) {
            roundedGrades.add(it)
        } else {
            val leftover = it % 5
            if (leftover >= 3) {
                roundedGrades.add(it + 5 - leftover)
            } else {
                roundedGrades.add(it)
            }
        }
    }
    return roundedGrades.toTypedArray()
}

fun main(args: Array<String>) {

    val grades = arrayOf(73, 67, 38, 33)

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
