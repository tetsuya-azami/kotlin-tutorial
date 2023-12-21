fun main() {
	// var: mutable variable
	var n = 10
	n= 15
	println(n)

	// val: immutable variable
	val m = 20
	// m = 25 // error
	println(m)

	// type annotation
	var x: Int
	x = 10
	println(x)

	// type suffix
	val y = 1L;
	val z = 1F;
	println(y::class)
	println(z::class)

	// escaped string and raw string
	val s = "Hello, \n\"Kotlin\""
	println(s)
	val r = """
		|Hello,
		|"Kotlin"
	""".trimMargin()
	println(r)

	// string template
	val data = arrayOf(1, 2, 3, "hoge")
	println("data=${data.joinToString(",")}")
	println("data[0] = ${data[0]}")
	println("1+1=${1+1}")
}
