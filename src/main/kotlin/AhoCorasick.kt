class AhoCorasick(private val patterns: List<String>) {
    private val trie = mutableListOf<TrieNode>()

    init {
        trie.add(TrieNode(0))
        for (i in patterns.indices) {
            addPattern(patterns[i], i)
        }
        buildSuffixAndMatchLinks()
    }

    private fun addPattern(word: String, patternIndex: Int) {
        var currentIndex = 0
        for (char in word) {
            val index = calculateIndex(char)
            if (trie[currentIndex].edge[index] == -1) {
                trie[currentIndex].edge[index] = trie.size
                trie.add(TrieNode(trie.size, currentIndex, char))
            }
            currentIndex = trie[currentIndex].edge[index]
        }
        trie[currentIndex].leaf = true
        trie[currentIndex].patternIndices.add(patternIndex)
    }

    private fun calculateIndex(char: Char): Int {
        return char.code - 'a'.code
    }

    fun buildSuffixAndMatchLinks() {
        val queue = ArrayDeque<Int>()
        queue.add(0)
        while (queue.isNotEmpty()) {
            val currentIndex = queue.removeFirst()
            addSuffixAndMatchLinks(currentIndex)

            for (i in trie[currentIndex].edge.indices) {
                if (trie[currentIndex].edge[i] != -1) {
                    queue.addLast(trie[currentIndex].edge[i])
                }
            }
        }
    }

    fun addSuffixAndMatchLinks(index: Int) {
        val node = trie[index]
        if (node.position == 0) {
            node.suffixLink = 0
            if (node.leaf) {
                node.matchLink = index
            }
        }

        if (index != 0 && node.position != 0) {
            var potentialBest = trie[node.position].suffixLink
            val currChar = calculateIndex(node.patternChar)
            while (true) {
                if (trie[potentialBest].edge[currChar] != -1) {
                    node.suffixLink = trie[potentialBest].edge[currChar]
                    break
                }
                if (potentialBest == 0) {
                    node.matchLink = 0
                    break
                }
                potentialBest = trie[potentialBest].suffixLink
            }
            if (node.leaf) {
                node.matchLink = node.index
            } else {
                node.matchLink = trie[node.suffixLink].matchLink
            }
        }
    }

    fun search(text: String): Array<MutableList<Int>> {
        val matches = Array(patterns.size) { mutableListOf<Int>() }

        var currentNode = trie[0]

        for (i in text.indices) {
            val index = calculateIndex(text[i])
            while (true) {
                if (currentNode.edge[index] != -1) {
                    currentNode = trie[currentNode.edge[index]]
                    break
                }
                if (currentNode.index == 0) {
                    break
                }
                currentNode = trie[currentNode.suffixLink]
            }

            var matchState = currentNode
            while (true) {
                matchState = trie[matchState.matchLink]
                if (matchState.index == 0) {
                    break
                }
                for (matchIndex in matchState.patternIndices) {
                    matches[matchIndex].add(i - patterns[matchIndex].length + 1)
                }
                matchState = trie[matchState.suffixLink]
            }
        }

        return matches
    }

    inner class TrieNode(val index: Int, val position: Int = -1, val patternChar: Char = Char.MIN_VALUE) {
        val edge = IntArray(26) { -1 }
        var leaf = false
        var patternIndices = mutableListOf<Int>()
        var suffixLink = 0
        var matchLink = 0
    }
}

fun main() {
    val text = "caaab"
    val patterns = listOf("a", "b", "c", "aa", "d", "b")

    val ahoCorasick = AhoCorasick(patterns)
    val matches = ahoCorasick.search(text)

    for (i in matches.indices) {
        println("Pattern '${patterns[i]}' found at indices: ${matches[i]}")
    }
}