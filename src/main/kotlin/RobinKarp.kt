class RobinKarp {

    fun search(text: String, pattern: String): List<Int> {
        val result = mutableListOf<Int>()
        val n = text.length
        val m = pattern.length
        if (m > n) return result

        val base = 256
        val prime = 101 // A prime number for modulus
        var patternHash = 0
        var textHash = 0
        var h = 1

        // Calculate the value of h (base^(m-1) % prime)
        for (i in 0 until m - 1) {
            h = (h * base) % prime
        }

        // Calculate the hash values for the pattern and the first window of text
        for (i in 0 until m) {
            patternHash = (base * patternHash + pattern[i].code) % prime
            textHash = (base * textHash + text[i].code) % prime
        }

        // Slide the window over the text
        for (i in 0..n - m) {
            // Check if the hash values match
            if (patternHash == textHash) {
                // If they match, check character by character
                if (text.substring(i, i + m) == pattern) {
                    result.add(i)
                }
            }

            // Calculate the hash value for the next window
            if (i < n - m) {
                textHash = (base * (textHash - text[i].code * h) + text[i + m].code) % prime

                // Ensure we have a positive hash value
                if (textHash < 0) {
                    textHash += prime
                }
            }
        }

        return result
    }
}

fun main() {
    val robinKarp = RobinKarp()
    val text = "geeksforgeeks"
    val pattern = "geeks"

    val result = robinKarp.search(text, pattern)
    println(result)
}