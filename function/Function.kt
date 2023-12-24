// Kotlinでは関数をトップレベルで定義できる。
// クラスの中に定義された関数はメソッドと呼ばれる。
fun main() {
    // ローカル関数(関数の中にある関数)
    println("local function")
    fun hello(): Unit {
        println("Hello, world!")
    }
    hello()

    println()
    println("function with arguments")
    // 推論できる場合は戻り値の型を省略できる。
    fun getTriangleArea(width: Double = 1.0, height: Double = 3.0) = width * height / 2
    println(getTriangleArea(10.0, 5.0))
    println(getTriangleArea()) // 1.0 * 3.0 / 2 = 1.5
    println(getTriangleArea(5.0)) // 5.0 * 3.0 / 2 = 7.5
    println(getTriangleArea(height = 7.0)) // 1.0 * 7.0 / 2 = 3.5

    // 可変長引数
    fun allSum(vararg values: Int): Int {
        var sum = 0
        for (value in values) {
            sum += value
        }
        return sum
    }

    println()
    println("vararg")
    println(allSum(1, 2, 3, 4, 5))
    println("spread operator")
    // 配列を渡す場合はスプレッド演算子を使う
    println(allSum(*intArrayOf(1, 2, 3, 4, 5)))

    fun getSumAverage(args: Array<Int>): Pair<Int, Double> {
        val sum = args.sum()
        val average = sum.toDouble() / args.size
        return Pair(sum, average)
    }

    println()
    println("Pair")
    // 分解宣言
    val (sum, average) = getSumAverage(arrayOf(1, 2, 3, 4, 5))
    println(sum)
    println(average)

    println()
    println("lambda")
    val arr = arrayOf(1, 2, 3, 4, 5)
    arr.forEach { println(it) }

    println()
    println("lambda with lavel syntax")
    arr.forEach { e ->
        if (e == 3) return@forEach
        println(e)
    }

    // 高階関数
    println()
    println("high-order function")
    fun benchmark(timeUnit: String, function: () -> Unit) {
        val start = System.currentTimeMillis()
        function()
        val end = System.currentTimeMillis()
        println("処理時間: ${end - start} $timeUnit")
    }

    benchmark("ms") {
        var x = 0
        for (i in 1..1_000_000) {
            x += i
        }
    }
}
