import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun captureStdout(block: () -> Unit): String {
    val originalOut = System.out
    val baos = ByteArrayOutputStream()
    System.setOut(PrintStream(baos))
    try {
        block()
    } finally {
        System.setOut(originalOut)
    }
    return baos.toString()
}
