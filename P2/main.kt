fun add(value: Int): Int = value

fun Int.add(value: Int): Int = this + value

fun Int.subtract(value: Int): Int = this - value

fun main(args: Array<String>) {
    val result = add(4).add(5).subtract(3)
    println(result)
}