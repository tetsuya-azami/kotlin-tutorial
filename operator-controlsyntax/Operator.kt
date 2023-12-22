fun main() {
	// range operator(両端を含む)
	println("range operator:")
	println(1..100) // 1..100
	println((1..100)::class) // class kotlin.ranges.IntRange
	println(5 in 1..100) // true
}
