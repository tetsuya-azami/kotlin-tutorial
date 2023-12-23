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
	// 推論できる場合は戻り値を省略できる。
	fun getTriangleArea(width: Double= 1.0, height: Double=3.0) = width * height / 2
	println(getTriangleArea(10.0, 5.0))
	println(getTriangleArea()) // 1.0 * 3.0 / 2 = 1.5
	println(getTriangleArea(5.0)) // 5.0 * 3.0 / 2 = 7.5
	println(getTriangleArea(height = 7.0)) // 1.0 * 7.0 / 2 = 3.5
}
