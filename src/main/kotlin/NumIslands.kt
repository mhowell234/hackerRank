fun numIslands(grid: Array<CharArray>): Int {
    if (grid.isEmpty() || grid[0].isEmpty()) return 0

    var count = 0
    val rows = grid.size
    val cols = grid[0].size

    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols || grid[r][c] == '0') return
        grid[r][c] = '0' // Mark visited
        dfs(r + 1, c) // Down
        dfs(r - 1, c) // Up
        dfs(r, c + 1) // Right
        dfs(r, c - 1) // Left
    }

    for (r in 0 until rows) {
        for (c in 0 until cols) {
            if (grid[r][c] == '1') {
                count++
                dfs(r, c)
            }
        }
    }

    return count
}

fun main() {
    val grid = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '1', '1'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '1', '1', '0', '1')
    )

    println("Number of islands: ${numIslands(grid)}") // Output: 4
}