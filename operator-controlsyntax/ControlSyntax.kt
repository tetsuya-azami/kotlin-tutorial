fun main(args: Array<String>) {
	// if expression
	println()
	println("if expression:")
	val condition = true
	val msg = if(condition) "trueです。" else "falseです。"
	println(msg)

	// when expression
	println()
	println("when expression(range):")
	val score = 100
	val messageFromTeacher = when(score) {
		100 -> "💯"
		in 90..99 -> "素晴らしい"
		in 80..89 -> "良い"
		in 70..79 -> "普通"
		else -> "頑張りましょう"
	}
	println(messageFromTeacher)

	println()
	println("when expression(type):")
	val obj: Any = "Hello"
	val message = when(obj){
		is String -> "${obj.length}文字です。"
		else -> "文字列ではありません。"
	}
	println(message)

	// for loop
	println()
	println("for loop:")
	val list = listOf("a", "b", "c")
	println("list with index:")
	for ((i, e) in list.withIndex()) {
		println("インデックス: ${i}, 要素: ${e}")
	}

	val map = mapOf(1 to "one", 2 to "two", 3 to "three")
	println("map:")
	for ((key, value) in map) {
		println("キー: ${key}, 値: ${value}")
	}
}
